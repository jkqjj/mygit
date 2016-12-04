package demo;

/**
 * Created by qianjiajia on 2016/11/4.
 */

class Person{
    public Person(){
        System.out.println("1.public Person()");
    }

    static {
        System.out.println("2.Person类的静态代码被调用!");
    }

}


public class TestStaticDemo5 {

    static {
        System.out.println("3.TestStaticDemo5类的静态代码块被调用!");
    }

    public static void main(String[] args){
        System.out.println("4.程序开始执行!");
        //产生两个实例化对象
        new Person();
        new Person();
    }


}
