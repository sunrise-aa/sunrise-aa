package 测试;

import java.util.Arrays;



public class sort排序 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		/*double[] numbers= {6.0,4.4,1.9,2.9,3.4,3.5};
		java.util.Arrays.sort(numbers);
		System.out.println(java.util.Arrays.toString(numbers));*/
		

		double[] numbers= {6.0,4.4,1.9,2.9,3.4,3.5};
		java.util.Arrays.parallelSort(numbers);
		System.out.println(java.util.Arrays.toString(numbers));
	}
}