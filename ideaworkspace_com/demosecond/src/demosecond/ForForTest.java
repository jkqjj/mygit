package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class ForForTest {

    public static void main(String[] args) {

        for (int i = 0;i < 5;i++){

            for (int j = i;j < 5;j++){
                System.out.print("-");
            }

            for (int z = 0;z <= i;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

    }

    public static int getMax(int a,int b){
        return (a>b)?a:b;
    }


}
