
import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String[] str = new String[number];
        String[] str2 = new String[10];
        String result = "";
       
        for(int i = 0; i < number; i++){
             str[i] = sc.next();
        }
        for(int i = 0; i < 10; i++){
            str2[i] = sc.next();  
        }
        for(String word : str2){
            boolean check = false;
            for(String toString : str){
                if(word.equals(toString)){
                    check = true;
                    break;
                }
                
            }
            if(check){
                result += "1";
            }else{
                result += "0";
            }
           
        }
        System.out.println(result);
        sc.close();
    }
}
