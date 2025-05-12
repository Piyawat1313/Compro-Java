import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int pump = sc.nextInt(); 
        for (int i = 1; i <= pump; i++) {
            int pos = sc.nextInt();
            int power = sc.nextInt();
            int left = (pos - 2);
            int right = (pos + 2);
            if (left < 1) {
                left = 1;
            }
            if (right > n) {
                right = n;
            }
            for (int j = left; j <= right; j++) {
                if (arr[j] > 0) {
                    arr[j] = Math.max(0, arr[j] - power);
                } 
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
