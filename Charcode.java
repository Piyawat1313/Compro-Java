
import java.util.Scanner;

public class Charcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int number = sc.nextInt();
        if(number > text.length() || number <= 0){
            System.out.println("invalid position");
        }else{
          System.out.println(text.charAt(number - 1));  
        }
        sc.close();
    }
}
