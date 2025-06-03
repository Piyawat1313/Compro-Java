import java.util.Scanner;

public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][] = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int p = sc.nextInt();
        int minus = 0;
        int plus = 0;
        int even = 0;
        int odd = 0;
        int result = 0;
        for (int i = 0; i < p; i++) {
            int pos1 = sc.nextInt();
            int pos2 = sc.nextInt();
            if (pos1 >= 1 && pos1 <= R && pos2 >= 1 && pos2 <= C) {
                result = arr[pos1][pos2];
                if (arr[pos1][pos2] < 0) {
                    minus++;
                }
                if (arr[pos1][pos2] >= 1) {
                    plus++;
                }
                if (arr[pos1][pos2] % 2 == 0) {
                    even++;
                }
                if (arr[pos1][pos2] % 2 != 0) {
                    odd++;
                }
            } 
            else{
                if(result > 0)
                    plus++;
                if(result % 2 == 0)
                    even++;
                if(result % 2 != 0)
                    odd++;
                if(result < 0)
                    minus++;
            }
        }
        System.out.println(plus + " " + minus + " " + even + " " + odd);
        sc.close();
    }
}
