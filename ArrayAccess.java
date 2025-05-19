import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][1000];
        int L[] = new int[n];
        int Long = 0;
        for (int i = 0; i < n; i++) {
            Long = sc.nextInt();
            L[i] = Long;    //ใช้เก็บความยาวของอาเรย์ 
            for (int j = 0; j < Long; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int outBound = 0;
        int index1 = 0;
        int index2 = 0;
        while (true) {
            index1 = sc.nextInt();
            if (index1 == 0) {
                break;
            }
            index2 = sc.nextInt();
            if (index1 > n || index2 < 0 || index2 >= L[index1 - 1]) {  //เช็คว่าเกินขอบเขตหรือไม่
                outBound++;
            } else {
                int value = arr[index1 - 1][index2];    //วิธีการ เก็ตค่าตำแหน่งที่ต้องการ
                sum += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(outBound);
        sc.close();
    }
}
