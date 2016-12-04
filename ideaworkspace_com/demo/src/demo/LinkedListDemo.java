package demo;

import java.util.LinkedList;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");

        ll.addLast("Z");

        ll.addFirst("A");

        ll.add(1,"A2");

        System.out.println("ll 最初的内容: "+ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("从ll中移除内容之后: "+ll);


        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll 移除第一个和最后一个元素之后的内容: "+ll);

        Object val = ll.get(2);

        ll.set(2,(String)val + "Changed");

        System.out.println("ll 被改变之后: "+ll);

    }

}
