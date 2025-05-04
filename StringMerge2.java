import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int length = Math.min(s1.length(), s2.length());
        StringBuilder s3 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(Character.isUpperCase(ch1) && Character.isLowerCase(ch2)){
                s3.append(ch1);
            }
            else if(Character.isLowerCase(ch1) && Character.isUpperCase(ch2)){
                s3.append(ch2);
            }
            else if(Character.isDigit(ch1) && Character.isLetter(ch2)){
                s3.append(ch1);
            }
            else if(Character.isDigit(ch2) && Character.isLetter(ch1)){
                s3.append(ch2);
            }
            else if((ch1 == '(' || ch1 == ')' || ch1 == '{' || ch1 == '}') && Character.isLetter(ch2)){
                s3.append(ch1);
            }
            else if((ch2 == '(' || ch2 == ')' || ch2 == '{' || ch2 == '}') && Character.isLetter(ch1)){
                s3.append(ch2);
            }
            else if(Character.isDigit(ch1) && (ch2 == '(' || ch2 == ')' || ch2 == '{' || ch2 == '}')){
                s3.append(ch2);
            }
            else if(Character.isDigit(ch2) && (ch1 == '(' || ch1 == ')' || ch1 == '{' || ch1 == '}')){
                s3.append(ch1);
            }
            else{
                s3.append(ch1);
            }
        }
        System.out.println(s3);
        sc.close();
    }
}
