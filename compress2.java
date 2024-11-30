import java.util.Scanner;
public class compress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Input N:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.print("Input  K:");
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int sum = 0;    //ตัวที่บวกเลขในอาเรย์ ที่ไม่ใช่ค่ากั้นแบ่ง
        int count = 0;  // ตัวนับที่ไม่ใช่ค่ากั้นแบ่งก่อนหน้า
        for(int i = 0; i < n; i++){
            if(arr[i] == k1 || arr[i] == k2 || arr[i] == k3){
                if (i == 0) {  // ตรงนี้คือค่าตัวแรกของค่ากั้นแบ่ง
                    System.out.print(arr[i] + " "); 
                }
                if (count > 0) {
                    System.out.print(sum + " " + arr[i] + " ");
                    count = 0;  //reset ตัวนับที่เจอค่ากั้นแบ่ง
                    sum = 0;    // reset sum เอาไว้
                }
                else if(count == 0){    //ถ้าตัวนับมีค่าเป็น 0 ไม่ต้องทำอะไร 
                    //Do nothing
                }
            }
            else if (i == n - 1) {      //เช็คตัวสุดท้ายของลูป ว่าตรงกับค่าที่ป้อนมามั้ย
                sum += arr[i];
                System.out.print(sum + " " );   //ปริ้นผลรวมของอาเรย์
            }
            else{
                sum += arr[i];  
                count++;        //นับว่าเจอค่ากั้นแบ่ง
            }
        }
    }
}
