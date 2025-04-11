import java.util.ArrayList;
import java.util.Scanner;

public class SupremeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int inSTA = 0;
        int start = -1;
        int stop = -1;
        int current = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if(current != Integer.MIN_VALUE){   //เช็คว่าเคยเจอเลขช่วงนี้มั้ย
                    result.add(current);    //จำค่าสูงสุดของช่วงนั้น
                }
                if(current > max){      //ถ้าค่าล่าสุด มีค่ามากกว่า ค่าเดิม
                    max = current;  //เก็บค่าล่าสุดไว้
                    start = inSTA; //เก็บตำแหน่ง
                    stop = i - 1;   //ช่วง index ก่อนถึง 0
                }
                //reset ค่าช่วงใหม่
                current = Integer.MIN_VALUE;
                inSTA = i + 1;  //อัปเดตตำแหน่งเริ่มต้นช่วงใหม่
            }
            else{
                if(arr[i] > current){   //ค่ามากสุด ใหญ่กว่าค่าที่บันทึกไว้มั้ย
                    current = arr[i];   //บันทึกค่าสูงสุด
                }
            }
        }
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
        System.out.println(max);
        for(int i = start; i <= stop; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
