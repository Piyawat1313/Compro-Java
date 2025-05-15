import java.util.ArrayList;
import java.util.Scanner;

public class SUpiercer0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;
        int tail = 0;
        int fake = 0;
        int index[] = new int[10];
        boolean check = false;
        for (int i = 0; i < n; i++) {
            String num = sc.next();
            char ch = num.charAt(2);
            if (ch == '0') {
                System.out.println("Wilkorn Only");
            } else if (ch == '1') {
                one++;
            } else if (ch == '2') {
                two++;
            } else if (ch == '3') {
                three++;
            } else if (ch == '4') {
                tail++;
            } else {   
                System.out.println("No Permission");
                    fake = ch - '0';    //อินเด็กอ้างอิง 0 - 9
                    index[fake]++;      //อัปเดตเมื่อเจอตั๋วปลอม
                    check = true;       
                
            }
        }
        System.out.println("First Class " + one);
        System.out.println("Second Class " + two);
        System.out.println("Third Class " + three);
        System.out.println("The Tail " + tail);
        if (check == true) {
            System.out.println("###########");
            System.out.println("Fake Tickets");
            for (int i = 5; i <= 9; i++) {
                if(index[i] > 0){
                    System.out.println("Class " + i + " " + index[i]);
                }
            }
        }

        sc.close();
    }
}
