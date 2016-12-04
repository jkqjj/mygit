package demosecond;

/**
 * Created by qianjiajia on 2016/11/7.
 */
public class IfTest {

    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1;i < 11;i++){
            sum += i;
        }

        System.out.println("sum = "+sum);


        int x = 0;
        int sum1 = 0;
        while(x<11){

            sum1 += x;
            x++;

        }
        System.out.println("sum1 = "+sum1);
        System.out.println("-----------------------------------");

        /**
         * 1~100之间7的倍数的个数
         */

        int sum7 = 0;
        for(int i = 1;i <= 100;i++){
            if(i % 7 == 0){
                sum7++;
                System.out.print("i = "+i+"\t");
            }
        }
        System.out.println();
        System.out.println("sum7 = "+sum7);
        System.out.println("--------------------------");


        /**
         * 语句嵌套形式
         */


        for (int x1 = 0;x1 < 5;x1++){
            for(int y = x1;y < 5;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");



        for(int i = 1; i <= 9;i++){

            for(int j = 1;j <= i;j++){

                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
        System.out.println("********************************************");



        for (int i = 1;i <= 10;i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println("i = "+i);
        }


    }




}
