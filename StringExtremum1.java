import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String str = "";
        int max = Integer.MIN_VALUE;
        String text1 = "";
        int min = Integer.MAX_VALUE;
        String text2 = "";
        while (true) {
            str = sc.nextLine();
            if (str.isEmpty()) {
                break;
            }
            if (str.length() >= max) {
                max = str.length();
                text1 = str;
            }
            else if(str.length() <= min){
                min = str.length();
                text2 = str;
            }
        }
        switch (number) {
            case 1:  
            System.out.println(max);
            System.out.println(text1);
            break;
            case 2: 
            System.out.println(min);
            System.out.println(text2);
            break;
        }
        sc.close();
    }
}
