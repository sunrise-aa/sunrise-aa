package 接口的使用;

import com.sun.security.jgss.GSSUtil;

/*
*接口的使用
*1.接口的使用也满足多态性
*2.接口实际上就是定义了一种规范
*
*
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer=new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash=new Flash();
        computer.transferDate(flash);
        //2.创建了接口的非匿名实现类的匿名对象
        computer.transferDate(new printer());
        //3.创建了接口的匿名实现类的非匿名对象
        USB phone=new USB(){
            public void start(){
                System.out.println("手机开始工作");
            }
            public void stop(){
                System.out.println("手机结束工作");
            }

        };
        computer.transferDate(phone);
        //4.创建了接口的匿名实现类的匿名对象
        computer.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });
    }

}
interface USB{
    /*定义了长宽最大最小的传输速度*/
    void start();
    void stop();
}

class Flash implements USB{
    public void start(){
        System.out.println("U盘开始工作");
    }
    public void stop(){
        System.out.println("U盘结束工作");
    }

}
class printer implements USB{
    public void start(){
        System.out.println("打印机开始工作");
    }
    public void stop(){
        System.out.println("打印机结束工作");
    }

}
class Computer{
    public void transferDate(USB usb){//USB usb=new Flash();
        usb.start();
        System.out.println("具体传输的细节");
        usb.stop();

    }
}