import java.util.ArrayList;
import java.util.Scanner;

public class Occ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Input N: ");
        int n = sc.nextInt();
        if(n < 1 || n > 100000){
            return;
        }
        //System.out.print("Input K: ");
        int k = sc.nextInt();
        if(k < 1 || k > 200000){
            return;
        }
        boolean [] occ = new boolean[n + 1];    //อาเรย์บันทึกการจอง

        for(int i = 0; i < k; i++){
            int reques = sc.nextInt();
            if(reques >= 0 && reques < n){
                occ[reques] = true; //บันทึกว่าช่องนี้จองไปแล้ว
            }
        }
        ArrayList<Integer> arr_occ = new ArrayList<>(); //ใช้เก็บตำแหน่งสิ้นสุดของช่วงว่างต่อเนื่อง
        //คำนวณหาช่องว่าง
        int max = 0;    //เก็บความยาวต่อเนื่องที่ยาวที่สุด
        int current = 0;    //ความยาวต่อเนื่องปัจจุบัน
        int inx = 0;          // ตำแหน่งสิ้นสุด
        for(int i = 1; i <= n; i++){
            //loop นี้ คำนวณช่องว่างที่ยาวต่อเนื่องมากที่สุด
            if(!occ[i]){    //เป็นเท็จ ถ้ายังไม่มีใครจอง
               current++;
               inx = i;
            }
            else{
                if(current > max){  //ช่องว่างต่อเนื่องของปัจจุบัน  มากกว่า ช่องว่างต่อเนื่องที่พบมั้ย 
                    max = current;      //ตำแหน่งสิ้นสุด เก็บค่า ช่องว่างปัจจุบัน
                    arr_occ.clear();    //เคลียค่าในอาเรย์ลิส
                    arr_occ.add(inx);   //แอดค่าส้นสุด
                }
                else if(current == max){    //ถ้าเท่ากัน
                    arr_occ.add(inx);   //แอดค่าสุดท้าย
                }
                current = 0;    // reset ค่าความต่อเนื่องของปัจจุบัน
            }
        }
        //เช็คอีกรอบ
        if(current > max){
            max = current;
            arr_occ.clear();
            arr_occ.add(inx);
        }
        System.out.print(max + "\n");
        for(int index : arr_occ){
            System.out.print(index + " ");
        }
    }
}
