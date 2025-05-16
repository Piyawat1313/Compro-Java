import java.util.Scanner;

public class TrainTicker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int resevre = sc.nextInt();
        int seat[] = new int[n + 1];
        for (int i = 0; i < resevre; i++) {
            int sataneeX = sc.nextInt();
            int sataneeY = sc.nextInt();
            int countSeat = sc.nextInt();
           if(sataneeX >= 1 && sataneeY <= n){
            boolean check = true;
                for (int j = sataneeX; j < sataneeY; j++) {
                    if(seat[j] + countSeat > p){    //ถ้าที่นั่งเกิน
                        check = false;  //เปลี่ยนเป็น false
                        break;  //หยุดการทำงาน
                    }
                }
                if(check){      //ถ้าไม่เกิน
                    for (int j = sataneeX; j < sataneeY; j++) {
                        seat[j] += countSeat;   //บวกที่นั่ง
                    }
                    System.out.println("Y");    
                }
                else{   //ถ้าเกิน 
                    System.out.println("N");
                }
           }
            
        }
        sc.close();
    }
}
