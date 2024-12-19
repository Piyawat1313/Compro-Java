
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String want_Text = sc.nextLine(); 
        int index = text.indexOf(want_Text);  //ค้นหาข้อความของ index ของ want_text in text     
        if(index < 0){
            System.out.println("string not found");
            
        }
        else{
            System.out.println(index + 1);
        }
        sc.close();
        }
}

