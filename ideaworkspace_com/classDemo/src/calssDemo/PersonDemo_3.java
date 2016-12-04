package calssDemo;

/**
 * Created by qianjiajia on 2016/11/9.
 */

class Person3{

    private String name;
    private int age;

    {
        System.out.println("Person code run");
    }


    void speak(){
        System.out.println("name = "+name+"age = "+age);
    }

    public Person3() {
        System.out.println("A:name = "+name+",,age = "+age);
    }

    public Person3(int age) {
        this.age = age;
        System.out.println("B:name = "+name+",,age = "+age);
    }

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("C:name = "+name+",,age = "+age);
    }

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

    public boolean compare(Person3 p){
        return this.age == p.age;
    }
}


public class PersonDemo_3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3(20);
        Person3 p2 = new Person3(30);
        boolean b = p1.compare(p2);
        System.out.println(b);
    }


}


