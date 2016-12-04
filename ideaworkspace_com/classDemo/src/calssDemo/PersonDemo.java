package calssDemo;

/**
 * Created by qianjiajia on 2016/11/9.
 */

class Person{
    /**
     * private:私有,权限修饰符，用于修饰类中的成员（成员变量，成员函数）
     * 私有仅仅是封装的一种表现形式。
     * 之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句
     * 对访问的数据进行操作，提高代码的健壮性。
     */
    private String name;
    private int age;

    /**
     * 构造代码块
     * 作用：给对象进行初始化
     * 对象一建立就开始运行，而且优先于构造函数执行
     * 和构造函数的区别:构造代码块是给所有对象进行同意初始化
     * 而构造函数是给对应的对象初始化。
     * 构造代码块中定义的是不同对象共性的初始化内容。
     */
    {
        System.out.println("Person code run");
    }


    void speak(){
        System.out.println("name = "+name+"age = "+age);
    }

    public Person() {
        System.out.println("A:name = "+name+",,age = "+age);
    }

    public Person(int age) {
        this.age = age;
        System.out.println("B:name = "+name+",,age = "+age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("C:name = "+name+",,age = "+age);
    }

    /**
     * 构造函数:对象一建立就会调用与之对应的构造函数
     * 构造函数的作用,可以用于给对象进行初始化
     * 构造函数的小细节:
     * 当一个类中没有定义构造函数时,那么系统会默认给该类加入一个空参数的构造函数
     *
     * 当在类中自定义了构造函数后,默认的构造函数就不存在了.
     *
     * 构造函数与一般方法的不同：
     * 构造函数实在对象一建立就运行的，给对象进行初始化。
     * 而一般方法是对象调用才执行，是给对象添加对象具备的功能。
     *
     * 一个对象建立，构造函数只运行一次。
     * 而一般方法可以被该对象调用多次。
     *
     * 什么时候定义构造函数呢？
     * 当分析事物时，该事物存在具备一些特性或者行为，那么将这些内容定义在构造函数中。
     */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>0&&age<130){
            this.age = age;
            speak();
        }else {
            System.out.println("input age error");
        }

    }
}

public class PersonDemo {

    public static void main(String[] args) {

        Person p = new Person();
        //p.age = 20;
        //p.speak();
    }
}
