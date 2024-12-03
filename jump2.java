import java.util.Scanner;

public class jump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลเข้า
        int N = sc.nextInt(); // ความยาวของอาร์เรย์
        int[] arr = new int[N];
        int index = sc.nextInt(); // เริ่มต้นที่ตำแหน่ง 1
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // เริ่มกระโดด
        int jump = 0;    // นับจำนวนครั้งที่กระโดด
            for(int i = 1; i <= arr.length; i++){
                int result = arr[index-1];
                System.out.println(index + " " + result);
                index += result;
                jump++;
                
                
                    if(index  > arr.length){
                        System.out.println("out of bounds");
                        break;
                    }
                
            } 

        sc.close();
    }
}
