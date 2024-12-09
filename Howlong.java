import java.util.Scanner;

public class Howlong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] number = new int[n + 1];
        for(int i = 1; i <= n; i++){
            number[i] = sc.nextInt();
        }
        int index_1 = sc.nextInt(); //รับตำแหน่งจากผู้ใช้
        int index_2 = sc.nextInt();
        int index_3 = sc.nextInt();
        
        int limmit_1 = 0;   //ตัวแปรอัปเดตว่าแต่ละตัวมีกี่ตัว
        int limmit_2 = 0; 
        int limmit_3 = 0;
        for(int i = index_1; i <= n && number[i] == 1; i++){    //loop ตรวจสอบว่าค่าที่ผู้ใช้ใส่เข้ามา เจอเลข 1 กี่ตัว
            limmit_1++;
        }
        for(int i = index_2; i <= n && number[i] == 1; i++){
            limmit_2++;
        }
        for(int i = index_3; i <= n && number[i] == 1; i++){
            limmit_3++;
        }
        System.out.println(limmit_1);
        System.out.println(limmit_2);
        System.out.println(limmit_3);
        sc.close();
    }
}
