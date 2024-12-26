
import java.util.Scanner;

public class charWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);
        char ch3 = s3.charAt(0);
        String text = sc.next();
        int round = sc.nextInt();
        int index = 0;
        int countOutbound = 0;
        int countCh1 = 0;
        int countCh2 = 0;
        int countCh3 = 0;
        for(int i = 0; i < round; i++){
            index = sc.nextInt();
            if(index < 1 || index > text.length()){ //เกินขอบเขตของข้อความมั้ย
            countOutbound++;
            }else{
                char chWant = text.charAt(index - 1);   //อ้างอิงถึงตำแหน่งเริ่มที่ 0 
                if(chWant == ch1){
                countCh1++;
                }
                else if(chWant == ch2){
                    countCh2++;
                }
                else if(chWant == ch3){
                    countCh3++;
                }
            } 
        }
        System.out.println(countCh1);
        System.out.println(countCh2);
        System.out.println(countCh3);
        System.out.println(countOutbound);
        sc.close();
    }
}
