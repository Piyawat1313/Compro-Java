import java.util.Scanner;

public class GeneticCode_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tex = sc.nextLine();
        int index = 0;
        int inde2 = 0;
        for (int i = 0; i < tex.length(); i++) {
            char ch = tex.charAt(i);  //เก็บอินเด็กของString 
            if(ch == '<'){    //เจอตัว < 
                index = i;  //เก็บตำแหน่งแรก
                continue;    //ทำงานส่วนถัดไป
            }
            if(ch == '>'){    //เจอตัว >
                inde2 = i;    //เก็บตำแหน่งสุดท้าย
                System.out.println(tex.substring(index + 1, inde2));    //ดึงString จากตำแหน่งที่เก็บมา 
            }
        }
        sc.close();
    }
}
