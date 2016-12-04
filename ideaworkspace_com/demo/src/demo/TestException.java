package demo;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class TestException {

    public static void main(String[] args) {

        try{
            int arr[] = new int [5];
            arr[10] = 7;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组超出绑定范围!");
        }finally {
            System.out.println("这里一定会被执行!");
        }
    }

}
