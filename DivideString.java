import java.util.ArrayList;
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char ch = text.charAt(0);
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> upper = new ArrayList<>();
        ArrayList<Character> notation = new ArrayList<>();
        for(int i = 0; i < text.length(); i++){
            ch = text.charAt(i);
            if(Character.isLowerCase(ch)){
                lower.add(ch);     
            }
            else if(Character.isUpperCase(ch)){
              upper.add(ch);
            }
            else if(!Character.isLowerCase(ch) && !Character.isUpperCase(ch)){
              notation.add(ch);
            }   
        }
        for(char i : lower){
            System.out.print(i);
        }
        System.out.println();
        for(char ii : upper){
            System.out.print(ii);
        }
        System.out.println();
        for(char iii : notation){
            System.out.print(iii);
        }
        sc.close();
    }
}
