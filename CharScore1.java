import java.util.Scanner;

public class CharScore1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int median = word.length() / 2;
        String sub = word.substring(0, median);
        String sub1 = word.substring(median);
        int sum = 0;
        int score = 0;
        for (int i = 0; i < sub.length(); i++) {        //ครึ่งแรก
            char ch = sub.charAt(i);
            score = ch - 'A' + 1;    //วิธีการกำหนดค่าให้ A = 1 ไล่ลงไปเรื่อยๆ
            sum += score;
        }
        System.out.println(sum);
        int score1 = 0;
        int sum1 = 0;
        for (int i = 0; i < sub1.length(); i++) {        //ครึ่งหลัง
            char ch = sub1.charAt(i);
            score1 = ch - 'A' + 1;
            sum1 += score1;
        }
        System.out.println(Math.abs(sum1));
        sc.close();
    }
}
