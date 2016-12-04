package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ArrayTest6 {

    public static void main(String[] args) {

        //toHex(60);
        toBin(-6);

    }

    /**
     * 查表法
     * 将所有的元素临时存储起来，建立对应关系
     */
    public static void toHex(int num){
        char[] ch = {'0','1','2','3',
                    '4','5','6','7',
                    '8','9','A','B',
                    'C','D','E','F'};

        char[] arr = new char[8];
      //1--  int pos = 0;

        int pos = arr.length;
        while (num != 0){
            int temp = num&15;
        //1---    arr[pos++] = ch[temp];

            arr[--pos] = ch[temp];
            num = num >>> 4;
        }

        //存储数据arr数组遍历
        //1-- for (int x = pos-1;x>=0;x--){
        //    System.out.print(arr[x]);
        //}

        System.out.println("pos = "+pos);
        for (int x = pos;x<arr.length;x++){
            System.out.print(arr[x]);
        }
    }

    public static void toBin(int num){

        //定义一个二进制的表
        char[] ch = {'0','1'};
        //定义一个临时存储器
        char[] arr = new char[32];
        //定义一个操作数组的指针
        int pos = arr.length;
        while (num != 0){
            int temp = num &1;
            arr[--pos] = ch[temp];
            num = num >>> 1;
        }

        for (int x = 0;x < arr.length;x++){
            System.out.print(arr[x]);
        }

    }

}
