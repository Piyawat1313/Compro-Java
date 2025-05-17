import java.util.Scanner;

public class SUpiercer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int head = sc.nextInt();
        if (head % 2 == 0) {
            System.out.println("Engineers Rejected");
            sc.close();
            return;
        }
        int notHead = head - 1;
        if (notHead % 4 != 0) {
            System.out.println("Wilkorn Industries Rejected");
            sc.close();
            return;
        }
        int Class = notHead / 4;    //จำนวนห้องแรก
        int nightCar = notHead / 10;    //จำนวนที่ทำห้อง night Car
        int start = (notHead / 2) - (nightCar / 2) + 1;   //หาตำแหน่งกลางของรถไฟ 
        int end = (start + nightCar);   //หาจุดสิ้นสุดของการทำ night Car
        int Second = Class - (nightCar / 2);
        int Third = Class - (nightCar / 2);
        int Engin = 1;
        int theTail = notHead / 4;
        
        if (nightCar < 10) {    //ห้อง night Car น้อยกว่า 10
            nightCar = 0;   //เปลี่ยนเป็น 0
            System.out.println("Night Car " + nightCar);
        }
        else{   //มากกว่า 10
            System.out.println("Night Car " + nightCar);
        }
            for (int i = start; i < end; i++) {
                if (i > 10) //ตำแหน่งของห้อง Night Car
                    System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("Engine " + Engin);
        System.out.println("First Class " + Class);
        System.out.println("Second Class " + Second);
        System.out.println("Third Class " + Third);
        System.out.println("The Tail " + theTail);
        sc.close();
    }
}
