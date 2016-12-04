package calssDemo;

/**
 * Created by qianjiajia on 2016/11/9.
 */
public class ArrayToolDemo {

    public static void main(String[] args) {

        int[] arr = {3,2,5,8,1};
        //ArrayTool arrayTool = new ArrayTool();
        //
        //int max = arrayTool.getMax(arr);
        //System.out.println("max = "+max);

        int max = ArrayTool.getMax(arr);
        System.out.println("max = "+max);
    }
}
