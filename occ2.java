
import java.util.ArrayList;
import java.util.Scanner;

public class Occ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();
        System.out.print("Input K: ");
        int k = sc.nextInt();
        
        boolean [] occ = new boolean[n];    //อาเรย์บันทึกการจอง

        for(int i = 0; i < k; i++){
            int reques = sc.nextInt();
            if(reques >= 0 && reques < n){
                occ[reques] = true; //บันทึกว่าช่องนี้จองไปแล้ว
            }
        }
        ArrayList<Integer> arr_occ = new ArrayList<>();
        //คำนวณหาช่องว่าง
        int limmit = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            //loop นี้ คำนวณช่องว่างที่ยาวต่อเนื่องมากที่สุด
            if(!occ[i]){    //เป็นเท็จ
                limmit++;
                arr_occ.clear();
                arr_occ.add(limmit);
            }
            /*else if(){

            }*/
        }
        System.out.print(limmit + " " + "\n");
        for(int index : arr_occ){
            System.out.println(index + " ");
        }
    }
}
