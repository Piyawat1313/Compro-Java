import java.util.Scanner;

public class InsideOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int median = sc.nextInt();
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 1) { // ใช้ตำแหน่ง % 2 เพื่อวนหาทางขวา
                    int right = (median + (i + 1) / 2) % str.length();
                    System.out.print(str.charAt(right));
                } else { // หาทางซ้าย
                    int left = (median - (i / 2) + str.length()) % str.length();
                    System.out.print(str.charAt(left));
                }
            }
        } else {
            System.out.print(str.charAt(median));
            for (int i = 1; i <= str.length() / 2; i++) {       //หาแบบเลขคี่
                int left = (median - i + str.length()) % str.length();  //หาทางซ้าย
                int right = (median + i) % str.length();    //หาทางขวา
                System.out.print(str.charAt(left));
                System.out.print(str.charAt(right));
            }
        }
        /*ที่ต้อง % ตัวมันเองเพราะจะได้วนกลับมาที่เดิมในตำแหน่งแรกใหม่เสมอ */

        sc.close();
    }
}
