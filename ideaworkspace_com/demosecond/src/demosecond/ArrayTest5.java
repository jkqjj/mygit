package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ArrayTest5 {

    public static void main(String[] args) {

        //toBin(6);
        toHex(60);
    }

    /**
     * 十进制喜欢换成十六进制
     *
     */
    public static void toHex(int num){

        StringBuffer sb = new StringBuffer();

        for (int x = 0;x < 8;x++){
            int temp = num & 15;
            if (temp > 9)
                //System.out.println((char)temp-10+'A');
            sb.append((char)(temp-10+'A'));
            else
                //System.out.println(temp);
            sb.append(temp);

            num = num >>> 4;
        }
        System.out.println(sb.reverse());
    }


    /**
     * 十进制转换成二进制
     * @param num
     */
    public static void toBin(int num){

        StringBuffer sb = new StringBuffer();
        while (num>0){
            sb.append(num%2);

            num = num /2;
        }
        System.out.println(sb.reverse());
    }
}
