package demo;

import java.util.ArrayList;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(new Integer(1));
        al.add(new Integer(2));
        al.add(new Integer(3));
        al.add(new Integer(4));
        al.add(new Integer(5));
        al.add(new Integer(6));

        System.out.println("ArrayList 中的内容: "+al);

        Object ia[] = al.toArray();
        int sum = 0;
        for(int i = 0;i<ia.length;i++){
            sum += ((Integer) ia[i]).intValue();

        }

        System.out.println("数组累加结果是: "+sum);
    }
}
