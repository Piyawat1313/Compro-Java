import java.util.ArrayList;
import java.util.Scanner;

public class countbetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int[] arr = new int[round];
        for(int i = 0; i < round; i++){
            arr[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        boolean countX = false;
        boolean countY = false;
        int countIsX = 0;
        int countIsY = 0;
        int countOutBound = 0;
        for(int i = 0; i < round; i++){
            if(x1 < x2 && arr[i] >= x1 && arr[i] <= x2){
                countIsX++;
                countX = true;
            }
            else if(y1 < y2 && arr[i] >= y1 && arr[i] <= y2){
                countIsY++;
                countY = true;
            }
            else {
                countOutBound++;
            }
        }
            System.out.println(countIsX);
            System.out.println(countIsY);
            System.out.println(countOutBound);
        sc.close();
    }
}
