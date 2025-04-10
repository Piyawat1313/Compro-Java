import java.util.ArrayList;
import java.util.Scanner;
public class Calculator_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index_1 = 0;
        int index_2 = 0;
        int total = 0;
        int[] save = new int[10];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num == 1){
                index_1 = sc.nextInt();
                index_2 = sc.nextInt();
                if(index_1 >= 0 && index_1 < n && index_2 >= 0 && index_2 < n){
                    total = arr[index_1] + arr[index_2];    //อ้างอิงตำแหน่งที่รับมา เอามาบวกกัน
                    save[i] = total;    //บันทึกผลลัพธิ์
                        System.out.println("Save: " + save[i]);
                        result.add(save[i]);    //บันทึกผลลงในอาเรย์
                }
                else{
                    System.out.println("error");
                }
            }
             if(num == 2){
                if(result.isEmpty()){
                    System.out.println("none");
                }else{
                    System.out.println(result.remove(result.size() - 1));   //เป็นการแสดงผลล่าสุดที่เข้ามาใน result ที่ต้องเอามา -1 เพราะต้องการค่าสุดท้าย
                }
            }
        }
            if(result.isEmpty()){   //ไม่มีข้อมุล
                System.out.println("empty ");
            }else{
               for(int i = 0; i < result.size(); i++){
                System.out.print(result.get(i) + " ");  //แสดงผลทั้งหมด
               }
            }
        sc.close();
    }
}
