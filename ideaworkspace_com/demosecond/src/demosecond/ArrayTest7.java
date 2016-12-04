package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ArrayTest7 {

    public static void main(String[] args) {
        //toBin(6);
        //toOct(60);
        toHex(60);
    }

    /**
     * 十进制转换为二进制
     */
    public static void toBin(int num){
        Trans(num,1,1);
    }


    /**
     * 十进制转换为八进制
     */
    public static void toOct(int num){
        Trans(num, 7,3);
    }


    /**
     * 十进制转换为十六进制
     */
    public static void toHex(int num){
        Trans(num,15,4);
    }


    public static void Trans(int num,int base,int offset){

        if(num == 0){
            System.out.println(0);
            return;
        }


        char[] ch = {'0','1','2','3',
                '4','5','6','7',
                '8','9','A','B',
                'C','D','E','F'};
        char[] arr = new char[32];
        int pos = arr.length;

        while (num!=0){
            int temp = num&base;
            arr[--pos] = ch[temp];
            num = num>>>offset;
        }

        for (int x = pos;x<arr.length;x++){
            System.out.print(arr[x]);
        }
    }
}
