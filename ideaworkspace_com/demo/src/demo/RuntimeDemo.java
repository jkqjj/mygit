package demo;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class RuntimeDemo {

    public static void main(String[] args){

        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
