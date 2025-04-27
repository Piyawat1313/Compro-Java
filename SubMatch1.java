import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String msg = sc.nextLine();
        //รูปแบบการแบ่ง String ทีละ 3 แบบไม่ใช้ Loop
        String part1 = msg.substring(0,3);
        String part2 = msg.substring(1, 4);
        String part3 = msg.substring(2, 5);

        int pos1 = str.indexOf(part1);
        int pos2 = str.indexOf(part2);
        int pos3 = str.indexOf(part3);
        boolean ch1 = (pos1 != -1);
        boolean ch2 = (pos2 != -1);
        boolean ch3 = (pos3 != -1);

        sc.close();
        //System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4);
            if(ch1) System.out.println(pos1 + 1);
            else System.out.println("No");
            
            if(ch2) System.out.println(pos2 + 1);
            else System.out.println("No");
            
            if(ch3) System.out.println(pos3 + 1);
            else System.out.println("No");
            sc.close();
    }
}
