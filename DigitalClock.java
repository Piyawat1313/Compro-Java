import java.util.Scanner;
public class DigitalClock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Start and minute:");
        int Starthour = sc.nextInt();
        int Startminute = sc.nextInt();
        System.out.println("Input Stop hour and minute:");
        int endhour = sc.nextInt();
        int endminute = sc.nextInt();
        //เวลาปัจจุบัน
        int Hour = Starthour;
        int Minute = Startminute;
        while (true){       //loop แสดงเวลา
                System.out.printf("%02d:%02d\n",Hour,Minute); 
           Minute++;        //เพิ่มเวลาทุก 1 นาที
           if(Minute == 60){    //ถ้านาที = 60
                Minute = 0;     //reset นาที
                Hour++;         //เพิ่มชั่วโมง
           }
           if(Hour > endhour || (Hour == endhour && Minute > endminute))   //ถ้าเวลาปัจจุบัน มากกว่า เวลาสิ้นสุด หรือ ชั่วโมงปัจจุบัน เท่ากับ เวลาสิ้นสุด และ นาทีปัจจุบัน มากกว่า นาทีสิ้นสุด
            break;
           }
        }
    }

