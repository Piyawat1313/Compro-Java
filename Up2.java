import java.util.Scanner;

public class Up {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.next();
            StringBuilder string  = new StringBuilder();
            for(int i = 0; i < text.length(); i++){
                if(string.length() == 0 || text.charAt(i) > text.charAt(i - 1)){
                string.append(text.charAt(i));
                }
                else if( string.length() != 0 || text.charAt(i) <= text.charAt(i - 1)){
                    System.out.println(string.toString());
                    string.setLength(0);
                    string.append(text.charAt(i));
                }
            }
                System.out.println(string.toString());
            
            sc.close();
        }
    }
