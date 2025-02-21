import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int length = str.length();
        int countCha = 0;
        for(int i = 0; i <= length - 3; i++){   //ลูปทีละ 3 ตัว
            char a = str.charAt(i);     //เก็บอักษรตัวแรก
            char b = str.charAt(i + 1);     //คัวที่ 2
            char c = str.charAt(i + 2);     //ตัวที่ 3 
            if(b == a + 1 && c == b + 1){   //เช็คว่าเรียงตามลำดับหรือไม่
                countCha++;
            }
        }
        System.out.print(countCha);
    }
}
