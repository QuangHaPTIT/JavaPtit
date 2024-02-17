package ThucHanh2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static String outdate(String s, long time){
        String[] a = s.split("/");
        Long m = Long.parseLong(a[1]);
        long y = Long.parseLong(a[2]);
        m += time;
        y += m/12;
        m %= 12;
        if(m == 0){
            m = (long)12;
            y--;
        }
        return String.format("%s/%02d/%04d", a[0], m, y);
    }

    static class sp{
        String code, name;
        Long price, time;
        public sp(String code, String name, Long price, Long time) {
            this.code = code;
            this.name = name;
            this.price = price;
            this.time = time;
        }

        
    }
    static class  hk {
    
        sp o;
        String code, name, address,date, outdate;
        Long s1, total;
        Date time;
        public hk(sp o, String code, String name, String address, String date, String outdate, Long s1, Long total
                ) {
            this.o = o;
            this.code = code;
            this.name = name;
            this.address = address;
            this.date = date;
            this.outdate = outdate(date, o.time);
            this.s1 = s1;
            this.total = s1 * o.price;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            try{
            this.time = f.parse(this.outdate);
            }catch(Exception e){

            }
    }

}
}
