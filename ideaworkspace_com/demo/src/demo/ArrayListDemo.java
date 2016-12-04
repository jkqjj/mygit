package demo;

import java.util.ArrayList;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al= new ArrayList();
        System.out.println("a1 的初始化大小: "+al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        al.add(1,"A2");

        System.out.println("a1 加入元素之后的大小: "+al.size());

        System.out.println("a1 的内容: "+al);

        al.remove("F");
        al.remove(2);
        System.out.println("a1 删除元素之后的大小: "+al.size());
        System.out.println("a1 的内容: "+al);
    }
}
