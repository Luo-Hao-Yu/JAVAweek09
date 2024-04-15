import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class dataExample {
    public static void main(String[] args) {

        //        Date类
        Date currentDate = new Date();
        System.out.println("当前时间："+currentDate);

        long millis = System.currentTimeMillis();
        Date dateFromMillis = new Date(millis);
        System.out.println("从毫秒数构造的日期： " + dateFromMillis);


        Date dateFromYMDHMSMS = new Date(124, 1, 1,12,0,0); // 这里的500表示500毫秒
        System.out.println("从年月日时分秒毫秒构造的日期： " + dateFromYMDHMSMS);

        Date primaryDate = new Date(0);
        System.out.println("Is today after primaryDate: " + dateFromMillis.after(primaryDate));
        System.out.println("Is primaryDate after today: " + primaryDate.after(dateFromMillis));

        SimpleDateFormat sdf = new SimpleDateFormat("G-yyyy-MM-dd a h:m:ss:S E");
        String formatDate = sdf.format(currentDate);
        System.out.println("转换后的日期格式: "+formatDate);

        System.out.printf("当前日期和时间： %tF %<tT%n", currentDate);



//        Calender类
//        windows状态栏时间效果
        System.out.println("windows状态栏时间效果");
        Calendar c = Calendar.getInstance();//默认是当前日期
        System.out.println(" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" ");
        System.out.println(c.get(Calendar.YEAR)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.DATE));

//        windows 日历效果
        System.out.println("windows 日历效果");
        System.out.print("一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六"+"\t"+"七"+"\t");
        c.set(2024,4-1,0);
        for(int i=0;i<30;i++){
            if(i % 7==0) {
                System.out.println();
            }
            c.add(Calendar.DATE,1);
            System.out.print(c.get(Calendar.DATE)+"\t");
        }





    }
}
