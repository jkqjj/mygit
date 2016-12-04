package demo;

/**
 * Created by qianjiajia on 2016/11/4.
 */

class Test{

    void add(int a ,int b) throws Exception{
        int c;
        c = a/b;
        System.out.println(a +"/"+b+"="+c);;
    }

}

public class TestException_5 {

    public static void main(String[] args) {

        Test t = new Test();
        /**
         * Error:(22, 14) java: 未报告的异常错误
         * java.lang.Exception;
         * 必须对其进行捕获或声明以便抛出
         */
        //t.add(4,0);

    }
}
