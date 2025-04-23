import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count[] = new int[k];
        for(int i = 0; i < k; i++){
            int num = sc.nextInt();
            int Q = sc.nextInt();
            int B = sc.nextInt();
            switch (num) {
                case 1:  
                if(count[B - 1] + Q <= arr[B - 1]){
                    count[B - 1] += Q;
                    System.out.println(count[B - 1]);
                }else{
                    System.out.println("-1");
                }
                break;
                case 2: 
                if(count[B - 1] >= Q){
                    count[B - 1] -= Q;
                    System.out.println(count[B - 1]);
                }else{
                    System.out.println("-1");
                }
                break;
            }
        }
       
        sc.close();
    }
}
