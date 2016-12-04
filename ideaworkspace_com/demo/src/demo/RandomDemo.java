package demo;

import java.util.Random;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0;i < 14;i++){
            System.out.print(r.nextInt(100)+"\t");
        }
    }

}
