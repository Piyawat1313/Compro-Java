import java.util.Scanner;

public class AtoZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String word = "";
        int AA = 0;
        int ZZ = 0;
        boolean A = false;
        for (int i = 0; i < text.length(); i++) {    //เจอ A ก่อน
            if (text.charAt(i) == 'A') {
                A = true;
                AA = text.indexOf("A");
            }
            if (text.charAt(i) == 'Z') {
                ZZ = text.indexOf("Z");
            }
        }
        if (A) {
            for (int i = AA; i <= ZZ; i++) {
                System.out.print(text.charAt(i));
            }
        }
        boolean Z = false;
        for (int i = 0; i < text.length(); i++) {    //เจอ Z ก่อน
            if(text.charAt(i) == 'Z'){
                Z = true;
                ZZ = text.indexOf("Z");
            }
            if(text.charAt(i) == 'A'){
                 AA = text.indexOf("A");
            }
        }
        if(Z){
            for (int i = AA; i >= ZZ; i--) {  //ปริ้นถอยหลัง
                System.out.print(text.charAt(i));
            }
        }
        sc.close();
    }
}
