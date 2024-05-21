package dynamicMemoryAllocation;

import java.util.ArrayList;
import java.util.List;

// 内存分配类
public class MemoryAllocation {
    private List<MemoryBlock> memoryBlocks;

    public MemoryAllocation() {
        memoryBlocks = new ArrayList<>();
        // 添加初始内存块
        memoryBlocks.add(new MemoryBlock(0, 100)); // 初始内存块大小为100，示例数据可根据需求更改
    }

    // 首次适应算法分配内存
    public void allocateFirstFit(int processId, int size) {
        for (MemoryBlock block : memoryBlocks) {
            if (!block.allocated && block.size >= size) {
                block.allocated = true;
                block.id = processId;
                if (block.size > size) {
                    MemoryBlock newBlock = new MemoryBlock(0, block.size - size);
                    newBlock.allocated = false;
                    memoryBlocks.add(memoryBlocks.indexOf(block) + 1, newBlock);
                    block.size = size;
                }
                System.out.println("Process " + processId + " allocated " + size + " units of memory.");
                return;
            }
        }
        System.out.println("Process " + processId + " cannot be allocated.");
    }

    // 最佳适应算法分配内存
    public void allocateBestFit(int processId, int size) {
        int minSize = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < memoryBlocks.size(); i++) {
            MemoryBlock block = memoryBlocks.get(i);
            if (!block.allocated && block.size >= size && block.size < minSize) {
                minSize = block.size;
                index = i;
            }
        }

        if (index != -1) {
            MemoryBlock block = memoryBlocks.get(index);
            block.allocated = true;
            block.id = processId;
            if (block.size > size) {
                MemoryBlock newBlock = new MemoryBlock(0, block.size - size);
                newBlock.allocated = false;
                memoryBlocks.add(index + 1, newBlock);
                block.size = size;
            }
            System.out.println("Process " + processId + " allocated " + size + " units of memory.");
        } else {
            System.out.println("Process " + processId + " cannot be allocated.");
        }
    }

    // 回收内存
    public void deallocate(int processId) {
        for (MemoryBlock block : memoryBlocks) {
            if (block.id == processId) {
                block.allocated = false;
                block.id = 0;
                System.out.println("Memory allocated to process " + processId + " deallocated.");
                mergeAdjacentBlocks();
                return;
            }
        }
        System.out.println("Process " + processId + " not found.");
    }

    // 合并相邻的空闲内存块
    private void mergeAdjacentBlocks() {
        for (int i = 0; i < memoryBlocks.size() - 1; i++) {
            MemoryBlock currBlock = memoryBlocks.get(i);
            MemoryBlock nextBlock = memoryBlocks.get(i + 1);
            if (!currBlock.allocated && !nextBlock.allocated) {
                currBlock.size += nextBlock.size;
                memoryBlocks.remove(nextBlock);
                i--; // 回退一步，重新检查合并后的块
            }
        }
    }

    // 打印内存状态
    public void printMemoryStatus() {
        System.out.println("\nMemory Status:");
        for (MemoryBlock block : memoryBlocks) {
            System.out.println("Block ID: " + block.id + ", Size: " + block.size + ", Allocated: " + block.allocated);
        }
        System.out.println();
    }
}