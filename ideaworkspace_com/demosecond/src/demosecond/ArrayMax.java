package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {5,6,12,34,7,9};
        int max = getMax(arr);
        System.out.println("max = "+max);
        int max_2 = getMax_2(arr);
        System.out.println("max = "+max);
        int min = getMin(arr);
        System.out.println("min = "+min);

    }

    public static int  getMax(int[] arr){

        int max = arr[0];

        for (int x = 1;x<arr.length;x++){
            if (arr[x]>max){
                max = arr[x];
            }

        }
        return max;
    }

    /**
     * 获取最大值的另一种方式
     * 可不可以将临时变量初始化为0呢？
     * 是可以的，因为这种方式，其实是在初始化为数组中的任意一个脚标
     * @param arr
     * @return
     */

    public static int  getMax_2(int[] arr){

        int max = 0;

        for (int x = 1;x<arr.length;x++){
            if (arr[x]>arr[max]){
                max = x;
            }

        }
        return arr[max];
    }

    public static int  getMin(int[] arr){

        int min = 0;

        for (int x = 1;x<arr.length;x++){
            if (arr[x]<arr[min]){
                min = x;
            }

        }
        return arr[min];
    }

}
