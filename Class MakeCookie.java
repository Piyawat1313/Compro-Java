import java.util.Scanner;

public class MakeCookie {
    static int make = 0;
    static int flour = 0;
    static int butter = 0;

    static void calCookieBags(int f, int b) {
            make = Math.min(f / 6, b / 3);
            flour = (f - make * 6);
            butter = (b - make * 3);
             if (f < 0 || b < 0 || b > 100000) {
                System.out.println("Cookie bags: " + "Error");
            }else{
                System.out.println("Cookie bags: " + make);
            }
            if (f < 0) {
                System.out.println("Flour left: " + "Invalid");
            }else{
                System.out.println("Flour left: " + flour);
            }
            if (b < 0 || b > 100000) {
                System.out.println("Butter left: " + "Invalid");
            }
            else{
                 System.out.println("Butter left: " + butter);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int b = sc.nextInt();
        MakeCookie.calCookieBags(f, b);
        sc.close();
    }
}
