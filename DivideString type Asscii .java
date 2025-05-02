import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.print(ch);
            }
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(ch);
            }
        }
        System.out.println();
        
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(ch >= 33 && ch <= 64 || ch == '^' || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126){
                System.out.print(ch);
            }
        }
        System.out.println();
        sc.close();
    }
}
