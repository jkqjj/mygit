package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class FunctionTest {

    public static void main(String[] args) {

        //draw(5, 6);
        //printHr();
        //draw(4, 4);
        //printHr();

        print99();
    }

    public static void draw(int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0;j < col;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printHr(){
        System.out.println("-----------------------");
    }

    public static void print99(){

        for (int x = 1;x <= 9;x++){
            for (int y = 1;y <= x;y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
