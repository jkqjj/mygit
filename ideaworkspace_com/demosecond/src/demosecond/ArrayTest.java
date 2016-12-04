package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ArrayTest {

    public static void selectSort_up(int[] arr) {

        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort_down(int[] arr) {

        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] < arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }


    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x = 0;x < arr.length;x++){
            if (x != arr.length-1)
                System.out.print(arr[x]+", ");
            else
                System.out.println(arr[x]+"]");
        }

    }

    /**
     * 冒泡排序
     * @param args
     */
    public static void bubbleSort(int[] arr){

        for (int x = 0;x < arr.length-1;x++){
            /**
             * -x：让每一次的比较元素减少
             * -1：避免脚标越界
             */
            for (int y = 0;y < arr.length-x-1;y++){
                if(arr[y]>arr[y+1]){

                    //int temp = arr[y];
                    //arr[y] = arr[y+1];
                    //arr[y+1] = temp;
                    swap(arr ,y ,y+1);
                }
            }
        }
    }

    /**
     * 位置置换的代码
     * 提取出来封装成一个函数
     */
    public static void swap(int[] arr,int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {3,6,1,7,9};

        //printArray(arr);
        //selectSort_down(arr);
        //
        printArray(arr);

        bubbleSort(arr);
        printArray(arr);

    }


}