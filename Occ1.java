
import java.util.ArrayList;
import java.util.Scanner;

public class Occ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Input N: ");
        int n = sc.nextInt();
        //System.out.print("Input K: ");
        int k = sc.nextInt();
        int [] arr = new int[n + 1];
        int [] count = new int[n + 1];
        int sucess = 0; //คนที่จองสำเร็จ
        int notsucess = 0;  //คนที่จองไม่สำเร็จ
        int limmit_not_reserve = 0;     //จองไม่ได้ต่อเนื่อง
        int number_reserve = 0;     //หมายเลขที่มีคนขอจองมากที่สุด   
        for (int i = 0; i < k; i++) {
            int reques = sc.nextInt();
            if(reques < 1 || reques > n){   //ถ้าเกินขอบเขตอาเรย์
                notsucess++;
            }
            else if (arr[reques] == 0) {  //อาเรย์ที่ป้อนเข้ามาไม่เกินขอบเขต
                sucess++;
                arr[reques] = 1;  //ตรวจสอบว่าเจอแล้ว
            }
            else {  //ถ้าช่องที่จองตรงกัน
                limmit_not_reserve++;
            }
            if(reques >= 1 && reques <= n){     //เช็คว่าข้าที่ใส่เข้ามามีค่าตั้งแต่ 1 และไม่เกิน n 
                count[reques]++;
            }
        }
        int max = 0;
        ArrayList<Integer> maxArrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(count[i] > max){
                max = count[i];
                maxArrayList.clear();   //เป็นการล้างข้อมูลทั้งหมดในArray maxList
                maxArrayList.add(i);    //เพิ่มค่า i เข้าไปในตัวแปร ArrayList
            }else if (count[i] == max) {
                maxArrayList.add(i);
            }
        }
       
        System.out.println(sucess);
        System.out.println(notsucess);
        System.out.println( limmit_not_reserve);
        for (int i : maxArrayList) {    //วนลูปใน ArrayList โดยมีตัวแปร i มารองรับ
            System.out.print(i + " ");
        }

    }
}
