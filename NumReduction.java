import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int pump = sc.nextInt();
        for(int i = 0; i < pump; i++){
            int pos = sc.nextInt();
            int powerPum = sc.nextInt();
            int index = pos - 1;
            int start = Math.max(0, index - 2); //ใช้หาช่องฝั่งซ้าย
            int stop = Math.min(n - 1, index + 2);  //ใช้หาช่องทางขวา
            for(int j = start; j <= stop; j++){     // loop เช็คการสูบ 
                if(arr[j] > 0){
                    arr[j] = Math.max(arr[j] - powerPum, 0);
                }
            }
            for(int k = 0; k < n; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
