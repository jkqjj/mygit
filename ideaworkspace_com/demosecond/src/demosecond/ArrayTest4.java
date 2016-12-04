package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ArrayTest4 {

    public static void main(String[] args) {

        //int[] arr = {3,1,2,4,9,8};
        //int index = getIndex(arr,9);
        //System.out.println("index = "+index);

        int[] arr = {1,2,3,4,45,67,89};
        int index = getIndex_2(arr,8);
        System.out.println("index = "+index);

    }

    /**
     * 折半查找
     * 前提：数组是有序的
     */
    public static int halfSearch(int[] arr,int key){
        int min,max,mid;
        min = 0;
        max = arr.length-1;
        mid = (max+min)/2;

        while(arr[min] != key){
            if (key>arr[mid])
                min = mid + 1;
            else if (key<arr[mid])
                max = mid -1;
            if(min>max)
                return -1;
            mid = (max+min)/2;
        }
        return mid;
    }


    /**
     * 折半查找的第二种方式;
     */
    public static int halfSearch_2(int[] arr,int key){
        int min,max,mid;
        min = 0;
        max = arr.length-1;
        while (min<=max){
            mid = (max+min)>>1;
            if (key>arr[mid])
                min = mid +1;
            else if(key<arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static int getIndex_2(int[] arr,int key){

        int min = 0,max = arr.length-1,mid;
        while (min<=max){
            mid=(max+min)>>1;
            if (key>arr[mid])
                min=mid+1;
            else if (key<arr[mid])
                max=mid-1;
            else
                return mid;
        }
        return min;
    }


    /**
     * 获取key第一次出现在数组中的位置。
     * 如果返回-1，那么代表该key在数组中不存在
     */
    public static int getIndex(int[] arr,int key){
        for (int x = 0;x < arr.length;x++){
            if (arr[x] == key){
                return x;
            }
        }
        return -1;
    }

}
