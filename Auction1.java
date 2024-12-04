import java.util.Scanner;

public class Auction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //สินค้าทั้งหมด 
        int[] arr = new int[n]; 
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();  //ราคาสินค้าตั้งต้น
        }
        int k = sc.nextInt();   //รอบการประมูล
        for(int r = 0; r < k; r++){     //จำนวนรอบ
            for(int i = 0; i < n; i++){     //ลูปบอกราคา
                int price  = sc.nextInt();  //รับราคาใหม่
                if(price < 0){  //ราคาน้อยกว่า ราคาตั้งต้น
                   continue;    //ทำต่อไป
                }
                else if(price > arr[i]){    //ราคาที่เสนอ มากกว่า ราคาตั้งต้น
                    arr[i] = price; //อาเรย์จะเก็บราคาใหม่เข้าไป
                }
            }
            for(int j = 0; j < n; j++){     //ปริ้น ราคาใหม่ออกมาของแต่ละรอบ
                System.out.print(arr[j] + " "); 
            }
            System.out.println();
        }
        sc.close();
    }
}
