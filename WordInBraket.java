import java.util.ArrayList;
import java.util.Scanner;

public class WordInBraket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        ArrayList<String> result = new ArrayList<>();
        while (true) {
            int end = word.indexOf("}");    //เก็บตำแหน่งปีกกาจบ
            if(end == -1) break;    //ถ้าไม่เจอ } หยุดการทำงาน
            int start = word.lastIndexOf("{", end);     //start เก็บค่าสตริงตั้งแต่ ปีกกาจบ จนถึงปีกกาเปิด
            if(start == -1){    //ถ้าไม่เจอ
                word = word.substring(end + 1);     //ดึงค่าสตริงตั้งแต่ ปีกกาจบ
                continue;       //ทำงานส่วนถัดไป
            }
            String word2 = word.substring(start + 1, end);      //เก็บค่า สตริงที่อยู่ภายในปีกกา
            if(!word2.isEmpty()){   //ถ้าไม่มีช่องว่างหรือ ว่างเปล่า
                result.add(word2);  //แอดลงอาเรย์ลิสต์
            }
            word = word.substring(end + 1);     //เก็บค่าตั้งแต่หลังปีกกาปิด
        }
        if(result.isEmpty()){       //ถ้าว่างเปล่า
            System.out.println("not found");
        }
        else{
            for(String n : result){
                System.out.println(n);
            }
        }
    }
}
