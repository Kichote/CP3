
public class Clock
{
    int m;
    int h;
    int alarmHour;
    int alarmMinute;
    Clock(){
    this.m=0;
    this.h=0;
    }
    
    void setAlarm(int alarmMinute, int alarmHour){
    this.alarmMinute=alarmMinute;
    this.alarmHour=alarmHour;
    }
    
    void runAlarm(){
    System.out.println("beep-beep-beep-beep !!");
    }
    
    Clock(int m, int h){
        this.m=m;
        this.h=h;
        if(m>59){
        System.out.println("Too many minutes, please fix it! Value set to 0");
        this.m=0;
        }
        if(h>23){
        System.out.println("Too many hours, please fix it! Value set to 0");
        this.h=0;
        }
    }
    
    void displayTime(){
         System.out.println("Current Time: " + h + " " + m);
    }
    void addOneMinute(){
        m=m+1;
        if(m>59){
        m=0;
        h++;
        }
        if(h>23){
        h=0;
        }
        
        if(m==alarmMinute && h==alarmHour){
        runAlarm();
        }
    }
    
}
