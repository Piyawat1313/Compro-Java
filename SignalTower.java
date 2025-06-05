import java.util.Scanner;

public class SignalTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            
            int top = p1 - 1;
            if(top < 0){
                top = 0;
            }
            int under = p1 + 1;
            if(under > r - 1){
                under = r - 1;
            }
            int left = p2 - 1;
            if(left < 0){
                left = 0;
            }
            int right = p2 + 1;
            if(right > c - 1){
                right = c - 1;
            }
            for (int j = top; j <= under; j++) {
                for (int j2 = left; j2 <= right; j2++) {
                    arr[j][j2] += 1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
