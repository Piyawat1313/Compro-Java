import java.util.HashSet;
import java.util.Scanner;

public class condosale1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int PnumHome = sc.nextInt();
        int orderK = sc.nextInt();
        int condo;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < orderK; i++){
            condo = sc.nextInt();
            if(condo >= PnumHome && condo < PnumHome + n){      //เช็คว่าหมายเลขห้องเกินเลขฟ้องที่น้อยมั้ย และ หมายเลขห้องที่รับเข้ามา อยู่ในขอบเขตหรือไม่
                set.add(condo);
            }
        }
        int Howlong = 0;
        int notSaleRoom = 0;
        int taget = 0;
        for(int i = PnumHome; i < PnumHome + n ; i++){  //loop นี้วนรอบตั้งแต่ห้องที่มีหมายเลขน้อยที่สุด ยาวไปถึง ห้องที่สิ้นสุดนั่นคือ Pnum + n หมายเลขห้องเริ่มต้น บวกกับ ห้องในคอนโดทั้งหมด
            if(!set.contains(i)){   
                Howlong++;
                taget++;
                notSaleRoom = Math.max(notSaleRoom, taget);     //ใช้ตรวจสอบค่าที่ยาวติดกันที่สุดมีค่าเท่าใด 
            }else{
                taget = 0;
            }
        }
        System.out.println(Howlong);
        System.out.println(notSaleRoom);
        sc.close();
    }
}
