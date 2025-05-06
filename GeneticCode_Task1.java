import java.util.Scanner;

public class GeneticCode_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tex = sc.nextLine();
        int index = 0;
        for (int i = 0; i < tex.length(); i++) {
            char ch = tex.charAt(i);
            if(ch == '<'){        //เจอตัว < 
                System.out.print((i) + " ");    //ปริ้นตำแหน่งแรกที่พบ
                continue;    //ทำงานส่วนถัดไป
            }
            else if(ch == '>'){        //เจอจุดสิ้นสุด
               System.out.println((i) + " ");    //ปริ้นตำแหน่งสุดท้าย
            }
        }
        sc.close();
    }
}
