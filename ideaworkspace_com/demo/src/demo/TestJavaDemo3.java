package demo;

/**
 * Created by qianjiajia on 2016/11/4.
 */

class Person3{

    public void fun1(){

        System.out.println("1.Person3{fun1()}");
    }
    public void fun2(){
        System.out.println("2.Person3{fun2()}");
    }
}

class Student3 extends Person3{

    public void fun1(){
        System.out.println("3.Student3{fun1()}");
    }

    public void fun3(){
        System.out.println("4.Student3{fun3()}");
    }

}

public class TestJavaDemo3 {

    public static void main(String[] args){

        Person3 p = new Student3();
        if(p instanceof Student3){
            Student3 s = (Student3)p;
            s.fun1();
        }else {
            p.fun2();
        }
    }

}
