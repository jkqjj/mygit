package demosecond;

/**
 * Created by qianjiajia on 2016/11/8.
 */
public class FunctionOverload {

    public static void main(String[] args) {
        int x = add(1,2);

        int y = add(1,2,3);

        System.out.println();



    }

    public static void print99(int num){
        for (int x = 1;x <= num;x++){
            for (int y = 1;y <= x;y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }

    }

    public static void print99(){

        print99(9);
    }




    public static int add(int x,int y){

        return x+y;
    }

    public static int  add(int x,int y,int z){
        return x+y+z;
    }

}
