import java.util.Scanner;

public class Cumulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x >= 1 && y < n && z > 0){
                for (int j = x; j <= y; j++) {
                    arr[j] += z;
                }
            }
            for (int j = 1; j < n; j++) {
                    System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
