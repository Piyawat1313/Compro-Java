import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String currenGroup = "" + str.charAt(0);    //เก็บตัวแรก
        for (int i = 1; i < str.length(); i++) {
            char curren = str.charAt(i);    //ตัวปัจจุบัน
            char pass = str.charAt(i - 1);  //ตัวก่อนหน้า
            if(curren > pass){  //ปัจจุบัน มากกว่า อดีต
                currenGroup += curren;  //ตัวแรก บวก ตัวปัจจุบัน
            }
            else{   //ถ้าตัวปัจจุบันน้อยกว่า 
                System.out.println(currenGroup);    //ปริ้น
                currenGroup = "" + curren;  //ตัวแรก รีเซ็ท และบวกตัวปัจจุบัน
            }
        }
        System.out.println(currenGroup);
        sc.close();
    }
}
