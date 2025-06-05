import java.util.Scanner;

public class RowCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C =  sc.nextInt();
        int arr[][] = new int[R + 1][C + 1];
        int k = sc.nextInt();
        int Q = sc.nextInt();
        int sumR[] = new int[R + 1];    //เก็บผลรวมของแถว
        for (int i = 1; i <= Q; i++) {
            int pos1 = sc.nextInt();
            int pos2 = sc.nextInt();
            int add = sc.nextInt();
            if(sumR[pos1] + add <= k){
                arr[pos1][pos2] += add;
                sumR[pos1] += add;
            }
        }
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
