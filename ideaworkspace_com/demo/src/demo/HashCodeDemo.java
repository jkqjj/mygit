package demo;

import java.util.HashMap;

/**
 * Created by qianjiajia on 2016/11/4.
 */

class PersonHashCode{

    private String name;
    private int age;

    PersonHashCode(String name,int age){

        this.name = name;
        this.age = age;

    }

    public String toString(){

        return "姓名: "+this.name+",年龄: "+this.age;

    }


    //public boolean equals(Objects obj){
    //
    //    return true;
    //}
    //
    //public int hashCode(){
    //    return 20;
    //}


}

public class HashCodeDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(new PersonHashCode("张三",20),"张三");
        System.out.println(hm.get(new PersonHashCode("张三",20)));

    }

}
