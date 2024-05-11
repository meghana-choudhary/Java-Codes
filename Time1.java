class Time{
    private int hr;
    private int min;
    private double sec;
    Time(int h,int m,double s){
        hr=h;
        min=m;
        sec=s;
    }
    void showtime(){
        System.out.println(hr+":"+min+":"+sec);
    }
    void add_time(int m1){
        min= min+m1;
        if(min>=60){
            hr=hr+1;
            min=min-60;
        }
    }
    void add_time(int h1,int m1){
        hr= hr+h1;
        min= min+m1;
        if(min>=60){
            hr=hr+1;
            min=min-60;
        }
    }
    void add_time(double s1){
        sec= sec+s1;
        if(sec>=60){
            min=min+1;
            sec=sec-60;
        }
    }
    Time add(Time T1){
        Time T2= new Time(0,0,0);
        T2.hr= T1.hr+hr;
        T2.min= T1.min+min;
        T2.sec= T1.sec+sec;
        if(min>=60){
            hr=hr+1;
            min=min-60;
        }
        if(sec>=60){
            min=min+1;
            sec=sec-60;
        }
        return T2;
    }
}
public class Time1{
    public static void main(String[] args) {
        Time ob1 = new Time(4,5,6.7);
        ob1.showtime();
        ob1.add_time(6);
        ob1.showtime();
        ob1.add_time(3,4);
        ob1.showtime();
        ob1.add_time(6.7);
        ob1.showtime();
        Time ob2 = new Time(3,4,8.9);
        Time ob3 = ob1.add(ob2);
        ob3.showtime();

    }
}