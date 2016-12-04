package calssDemo;

/**
 * Created by qianjiajia on 2016/11/9.
 */


/**
 * 成员变量与局部变量
 * 1.作用范围：
 * 成员变量作用于整个类中
 * 局部变量作用于函数中或者语句中。
 *
 * 2.在内存中的位置：
 * 成员变量在堆内存中，因为对象存在，才在内存中存在
 * 局部变量存在栈内存中。
 */

class Car {
    /**
     * 描述事物其实就是描述事物的属性和行为
     *
     * 属性对应的是类中的变量
     * 行为对象的是类中的函数（方法）
     * 其实定义类就是在描述事物，就是在定义属性和行为
     * 属性和行为共同成为类中的成员（成员变量和成员方法）
     */
    String color = "red";
    int num = 4;

    void run(){
        System.out.println(color+".."+num);
    }

}


public class carDemo {

    public static void main(String[] args) {
        /**
         * 生产汽车，在java中通过new操作符来完成
         * 其实就是在堆内存生产一个实体1
         */

        Car c = new Car();//c就是一个类类型变量.记住类类型的变量指向对象

        //需求：将已有车的颜色改成蓝色，指挥对象做使用。在java中的指挥方式是：对象.对象成员.
        c.color = "blue";
        c.run();
        c.num = 5;


        Car c1 = new Car();
        c1.num = 6;
        c1.run();

        Car c2 = c1;
        c2.num = 8;
        c2.run();

        new Car().num = 14;

        Car car = new Car();
        Show(car);

    }


    public static void Show(Car c){

        c.num =3;
        c.color = "black";
        c.run();

    }


}
