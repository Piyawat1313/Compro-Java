import java.util.Scanner;

public class InsideOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int median = str.length() / 2;
        if (str.length() % 2 != 0) {
            System.out.print(str.charAt(median));
            for (int i = 1; i <= median; i++) {
                if(median - i>= 0){
                    System.out.print(str.charAt(median - i));
                }
                if(median + i < str.length()){
                    System.out.print(str.charAt(median + i));
                }
            }
        }
        else{
           // System.out.print(str.charAt(median));
            for (int i = 0; i < median; i++) {
                    System.out.print(str.charAt(median - 1 - i));   //ปริ้้นตำแหน่งตัวด้านซ้ายถัดไป
                    System.out.print(str.charAt(median + i));   //ตำแหน่งด้านขวา
            }
        }
        sc.close();
    }
}
