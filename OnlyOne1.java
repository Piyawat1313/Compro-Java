import java.util.Scanner;

public class OnlyOne1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c + 1];
        for (int i = 0; i < r; i++) {
            for (int j = 1; j <= c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count[] = new int[c + 1];   //นับตอนเจอ 1 
        for (int i = 0; i < r; i++) {
            for (int j = 1; j <= c; j++) {
                if (arr[i][j] == 1) {   //เจอ 1 มั้ย
                    count[j]++;     //อัปเดตเข้าไป
                }
            }
           
        }
        int max = 0;
        int reIndex = 0;
        for (int i = 1; i <= c; i++) {
            if(count[i] >= max){    //เอาค่าที่มากที่สุด
                max = count[i];     //เก็บค่ามากไว้
                reIndex = i;        //เก็บตำแหน่งที่ต้องการ
            }
        }
        System.out.println(max);
        System.out.println(reIndex);
        sc.close();
    }
}
