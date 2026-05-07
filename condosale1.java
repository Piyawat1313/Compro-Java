import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class condosale1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> agian = new HashSet<>();   //เครื่องมือที่ใช้เก็บค่าที่พบแล้ว
        List<Integer> First = new ArrayList<>();    //ใช้เก็บลำดับค่าที่เจอครั้งแรก
        for(int i = 0; i < k; i++){
          int reques = sc.nextInt();
            if(reques >= p && reques < p + n && !agian.contains(reques)){   //เช็คหมายเลขห้อง และ ห้องที่ยังไม่ถูกขาย
                agian.add(reques);  //เก็บค่าเมื่อพบแล้ว
                First.add(reques);  //เจอค่าแรกแล้ว
          }
        }
        System.out.println(First.size());   //ขายไปได้กี่ห้อง
        Collections.sort(First);    //เรียงลำดับเลขห้องจากน้อยไปหามาก
        for(int room : First){
            System.out.println(room);   //ปริ้นค่าน้อบไปหามาก
        }
        sc.close();
    }
}
