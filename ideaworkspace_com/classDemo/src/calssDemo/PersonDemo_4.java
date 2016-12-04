package calssDemo;

/**
 * Created by qianjiajia on 2016/11/9.
 */

class Person4{
    private String name;
    private int age;

    Person4(){

    }

    Person4(String name){
        this();
        this.name = name;
    }

    Person4(String name,int age){
        this(name);
        this.age = age;
    }
}

public class PersonDemo_4 {

    public static void main(String[] args) {

        Person4 p1 = new Person4("lisi",30);
        Person4 p2 = new Person4("lisi2",36);
    }
}
