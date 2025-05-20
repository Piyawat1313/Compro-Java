import java.util.Scanner;

public class CropAround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r+1][c+1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int startRow = sc.nextInt();
        int startCol = sc.nextInt();
        int tall = sc.nextInt();
        int wide = sc.nextInt();
        if(startRow < 0 || startRow >= r || startCol < 0 || startCol  >= c){
            System.out.println("invalid ");
            sc.close();
            return;
        }
        else{
            int halftall = tall / 2;  //หาตรงกลางของความสูง
            int halfLong = wide / 2;  //หาตรงกลางของความกว้าง
            int under = 0;
            int down = 0;
            int left = 0;
            int right = 0;
            under = (startRow - halftall + 1);
            if(under < 1){
                under = 1;
            }
            down = (startRow + halftall + 1);
            if(down > r){
                down = r;
            }
            left = (startCol - halfLong + 1);
            if(left < 1){
                left = 1;
            }
            right = (startCol + halfLong + 1);
            if(right > c){
                right = c;
            }
            for (int i = under; i <= down; i++) {
                for (int j = left; j <= right; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close(); 
    }
}
