import java.util.Scanner;

public class UpLowCaseChar0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char ch1;
        int count1 = 0;
        int count0 = 0;
        int countChar = 0;
        for (int i = 0; i < str1.length(); i++) {
            ch1 = str1.charAt(i);
            if (Character.isLowerCase(ch1)) {
                System.out.print(0);
                count0++;
            } 
            else if(Character.isUpperCase(ch1)){
                System.out.print(1);
                count1++;
            }
            else if(ch1 >= 33 && ch1 <= 47 || Character.isDigit(ch1) || ch1 >= 58 && ch1 <= 64 || ch1 >= 91 && ch1 <= 96 || ch1 >= 123 && ch1 <= 126){
                System.out.print(2);
                countChar++;
            }
        }
        System.out.println();
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(countChar);
        sc.close();
    }
}
