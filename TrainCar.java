import java.util.Scanner;

public class TrainCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = sc.nextInt();
        int max = (c + p);
        int arr[] = new int[max + 1];
        int valence = sc.nextInt();
        for (int i = 0; i < valence; i++) {
            int t = sc.nextInt();
            int num = sc.nextInt();
            int v = sc.nextInt();
            if(t == 1){
                if(num <= c){   //อยู่ด้านหน้า
                    if(arr[num] + v <= 50){     //ถ้าความจุไม่เกิน50  
                        arr[num] += v;
                    }
                }
            }
            if(t == 2){
                if(num > c){    //อยู่ด้านหลัง
                    if(arr[num] + v <= 60){     //ถ้าที่นั่งไม่เกิน 60
                        arr[num] += v;
                    }
                }
            }
            for (int j = 1; j <= max; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
