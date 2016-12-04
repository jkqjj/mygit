package calssDemo;

/**
 * Created by qianjiajia on 2016/11/9.
 */

/**
 * 主函数是一个特殊的函数，作为程序的入口，可以被jvm调用
 *
 * 主函数的定义：
 * public：代表着该函数访问权限是最大的
 * static：代表主函数随着类的加载已经存在了
 */
public class MainDemo {

    public static void main(String[] args) {

        int[] arr = {3,4,5,1};
        int max = getMax(arr);
        System.out.println("max = "+max);

    }


    public static int getMax(int[] arr){
        int max = 0;
        for (int x = 1;x<arr.length;x++){
            if (arr[x]>arr[max])
                max = x;
        }
        return arr[max];
    }



}
