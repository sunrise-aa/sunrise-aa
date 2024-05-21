package com.example.homeworklearn.ui.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @ClassName : Myreceiver
 * @Author : 骆发茂
 * @Date: 2021/4/15 21:38
 * @Description :
 */
public class Static_Myreceiver extends BroadcastReceiver{


    /*
    *----------------------参考该方法，接口方法用于回调 (这里定义接口是为了使用其接口方法)---------------------------
    *
    *public interface ICallback {
  public void   func();
}

public class Caller {
  ICallback callback;
  public void doCallback() {
    callback.func();
  }

  public void setCallback(ICallback callback) {
    this.callback = callback;
  }

}

public class MainClass {
  public MainClass() {
  }

  public static void main(String[] args) {
    Caller caller = new Caller();
    caller.setCallback(new ICallback () {
      public void func() {
        System.out.println("dosth");
      }
    });
    caller.doCallback();
  }
}
    *
    *
    *
    *    *----------------------参考该方法,向上转型---------------------------

    *2、向上转型


    * interface People{
   void peopleList();
}
class Student implements People{
   public void peopleList(){
       System.out.println("I’m a student.")；
  }
}
class Teacher implements People{
   public void peopleList(){
       System.out.println("I’m a teacher.");
   }
}
public class Example{
   public static void main(String args[]){
       People a;             //声明接口变量
       a=new Student();      //实例化，接口变量中存放对象的引用
       a.peopleList();        //接口回调
       a=new Teacher();     //实例化，接口变量中存放对象的引用
       a.peopleList();       //接口回调
  }
}
运行结果：
I’m a student.
I’m a teacher. */





/*
* 首先定义一个接口
*     public interface Static_interface {
        void set_static_message();
    }
    * 然后定义一个变量名
    *     static Static_interface static_interface;

* 之后可以自动生成一个setter函数，该函数可以获取外面重写的函数的内容
*     public static void setStatic_interface(Static_interface static_interface) {
        Static_Myreceiver.static_interface = static_interface;
    }
    * 再在外面些重写函数的内容，可以放在任何地方去重写
    * 再在你想要实现的地方去实现接口函数
    * 接口变量名.接口函数*/



    /*该函数是可以自动生成的，是个setter函数，能将外面重写的方法放进该函数内，
    * 将括号里面的(Static_interface static_interface)等于该类里面的Static_Myreceiver.static_interface
    * 这样重写的内容就赋给了该类的变量*/
    public static void setStatic_interface(Static_interface static_interface) {
        Static_Myreceiver.static_interface = static_interface;
    }

    /*定义一个Static_interface类型的，static类型的变量名，变量名叫static_interface、
    * 该变量名可以调用接口函数*/
    static Static_interface static_interface;


    /*这是接口，里面有一个函数，set_static_message，其他类去重写这个函数*/
    public interface Static_interface {
        void set_static_message();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("==================这里是static_Myreceiver，测试是否开启！=====================================");
        String static_info = intent.getStringExtra("msg");
        /*                intent_broadcast.putExtra("msg", "这是一条静态广播");  */
        Log.e("activityState", "static_Myreceiver，测试是否开启");

        Toast.makeText(context, "这里是static_Myreceiver，收到静态广播了~", Toast.LENGTH_LONG).show();
        Log.i(intent.getAction(), static_info);


        static_interface.set_static_message();

    }
}
