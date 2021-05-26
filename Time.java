package oop_assign;

public class Time {
    private int hour, min, sec;

    Time(int h,int m,int s)
    {
        this.hour=h;
        this.min=m;
        this.sec=s;
    }

    Time()
    {
        this.hour=0;
        this.min=0;
        this.sec=0;
    }

    public Time Add(Time timePassed)
    {
        Time t=new Time();
        t.sec= this.sec + timePassed.sec;
        if(t.sec>60)
        {
            t.sec-=60;
            this.min++;
        }
        t.min = this.min + timePassed.min;
        if(t.min>60)
        {
            t.min-=60;
            this.hour++;
        }
        t.hour += this.hour + timePassed.hour;
        if(t.hour>24)
            t.hour-=24;
        return t;
    }
    void Display(String str)
    {
        System.out.println(str + hour +":" + min +":"+sec);
    }

    public static void main(String[] args) {
        Time t1=new Time(5,23,12);
        Time t2=new Time(6,38,50);
        Time t3=t1.Add(t2);
        t1.Display("Time 1: ");
        t2.Display("Time 2: ");
        t3.Display("\nAdded time : Time 1 + Time 2  \n = ");
    }
}
