import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Howlongest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] number = new int[n + 1]; //ตั้งขนาดอาเรย์ให้มากกว่าตัวที่รับมา
        for(int i = 0; i < n; i++){     //รับเลขเข้าอาเรย์
            number[i] = sc.nextInt();
        }
        int max = 0;    //เก็บผลลัพธิ์
        int target = 0;
        ArrayList<Integer> Position = new ArrayList<>();
        int limmits = -1;
        for(int i = 0; i < n; i++){
            if(number[i] == 1){     //ถ้าเจอ 1 
                if(target == 0){    //ถ้ายังไม่มีตัวไหนเข้ามา
                    limmits =  i + 1; //เก็บตำแหน่งแรก
                }
                target++;   //อัปเดต
                if(target > max){   //ถ้า target ที่รับมา มากกว่า max
                    max = target;   //เก็บค่าที่มากที่สุดไว้
                    Position.clear();   //เคลียช่องในอาเรลิส
                    Position.add(limmits);  //แอดค่าที่เก็บตำแหน่งไว้
                }else if(target == max){    //ถ้าเท่ากัน
                    Position.add(limmits);  //แอด ตำแหน่งที่เก็บไว้
                }
            }else {
                target = 0; //reset เป้าหมาย
            }
        }
        System.out.println(max + " ");  //ปริ้นผลลัพธิ์ที่ต่อเนื่อง
        for(int i = 0; i < Position.size(); i++){   //loop ตามขนาด อาเรย์ลิส
            System.out.print(Position.get(i));
            if(i < Position.size() - 1){    //ถ้า i มากกว่า ขนาดอาเรย์ลิส
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
