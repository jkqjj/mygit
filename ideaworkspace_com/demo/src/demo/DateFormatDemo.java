package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class DateFormatDemo {

    public static void main(String[] args){

        SimpleDateFormat sp1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sp2 = new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");

        try {

            Date d = sp1.parse("2016-11-04 16:40:40");
            System.out.println(sp2.format(d));

        }catch (ParseException e){
            e.printStackTrace();
        }



}

}
