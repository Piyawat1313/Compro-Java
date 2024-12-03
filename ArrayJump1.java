import java.util.Scanner;

public class ArrayJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลเข้า
        int N = sc.nextInt(); // ความยาวของอาร์เรย์
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // เริ่มกระโดด
        int index = 1; // เริ่มต้นที่ตำแหน่ง 1
        int jump = 0;    // นับจำนวนครั้งที่กระโดด
        for(int i = 1; i <= 5; i++){
            if(index > N){
                System.out.println("out of bounds");
                break;  
            }
            int result = arr[index - 1];
            System.out.println(index + " " + result);
            index += result;
            jump++;
        }

        sc.close();
    }
}
