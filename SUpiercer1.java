import java.util.Scanner;

public class SUpiercer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int headTrain = sc.nextInt();   //รถไฟที่รวมหัว
        if(headTrain % 2 == 0){     //ไม่เป้นเลขคู่
            System.out.println("Engineers Rejected");
            sc.close();
            return;
        }
        int totalTrain = headTrain - 1;     //ตู้รถไฟที่ไม่รวมหัว ต้อง ลบ 1
        if(totalTrain % 4 != 0){    //หาร 4 ไม่ลงตัว
            System.out.println("Wilkorn Industries Rejected");
            sc.close();
            return;
        }
        int count1 = sc.nextInt();
        int count2 = sc.nextInt();
        int count3 = sc.nextInt();
        int countPassenger[] = new int[5];  //อาเรยืเก็บผู้โดยสาร
        while (true) {
            int num = sc.nextInt();
            if(num < 10000 || num > 99999){     //ถ้าเกิน
                System.out.println("Ticket END");
                break;
            }
            int CarPassen = sc.nextInt();
            boolean found = false;      //เช็คว่าเจอเลขที่สนใจ
            int midle = (num / 100) % 10;   //หาเลขตรงกลาง
           switch (midle) {
                case 0:
                if(CarPassen >= 0 && CarPassen <= 4)    //เข้าได้ทุกตู้
                    found = true; 
                    break;
                case 1:
                    if (CarPassen >= 1 && CarPassen <= 4) found = true;     //เข้าได้แค่ 1 - 4
                    break;
                case 2:
                    if (CarPassen >= 2 && CarPassen <= 4) found = true;     //เข้าได้แค่ 2 - 4
                    break;
                case 3:
                    if (CarPassen >= 3 && CarPassen <= 4) found = true;     //เข้าได้แค่ 3 - 4
                    break;
                case 4:
                    if (CarPassen == 4) found = true;   //เข้าได้แค่ 4
                    break;
                
                    default:    //เป็นเลขอื่น
                    found = false;      //เปลี่ยนสถานะ
            }
            if(!found || (CarPassen == 1 && countPassenger[1] >= count1) || (CarPassen == 2 && countPassenger[2] >= count2) || (CarPassen == 3 && countPassenger[3] >= count3)){    //ตู้ที่ขอมันเต็ม
                countPassenger[4]++;    //ไปที่ตู้ที่ 4 
            }
            else{
                countPassenger[CarPassen]++;    //ถ้าไม่เต็มเก็บเข้าเรย์
            }
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(i + " " + countPassenger[i]);
        }
        sc.close();
    }
}
