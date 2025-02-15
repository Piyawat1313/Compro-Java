import java.util.Scanner;

public class AlternateJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] arr2 = new int[n + 1];
        int index1 = 1; //เริ่มที่ 1 เพราะจะกระโดดที่ช่องแรก
        int index2 = 1;
        int get1 = 0;   //คอยนับว่ากระโดดไปกี่ช่อง
        int get2 = 0;
        int currArray = 1;  //ติดตามว่ากระโดดอาเรย์ไหน
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            arr2[i] = sc.nextInt();
        }
        while (index1 <= n && index2 <= n) {    //loop ถ้ากระโดดไม่เกินขอบเขต
            if(currArray == 1){     //กระโดดที่อาเรย์แรกใช่มั้ย
                int jump = arr[index1];     //ตัวแปร jump  เก็บอาเรย์ที่ช่องแรกไว้
                System.out.println("1 " + index1 + " " + jump); //ปริ้น ค่าที่กระโดดไปของอาเรย์แรก
                get1++;     //คอยนับอาเรย์แรกว่ากระโดดไปกี่ครั้ง
                if(jump % 2 == 1){      //ถ้าหาร 2 ไม่ลงตัว
                    currArray = 2;      //เปลี่ยนสถานะไปโดดอาเรย์อาเรย์ที่ 2 
                    index2 += jump;     //index2 ตัวที่ 2 บวกกับอาเรย์ช่องแรก
                }else{
                    index1 += jump;     //ถ้าหาร2 ลงตัว กระโดดในช่องแรกต่อไป
                }
            }else{          //ถ้าสถานะติดตามอาเรย์เป็น 2
                int jump = arr2[index2];    //เก็บอาเรย์ตัวที่ 2 ไว้ในตัวแปร
                System.out.println("2 " + index2 + " " + jump);
                get2++; 
                if(jump % 2 == 1){
                    currArray = 1;
                    index1 += jump;
                }
                else{
                    index2 += jump;
                }
            }
        }
        System.out.println(get1);
        System.out.println(get2);
        sc.close();
    }
}
