import java.util.Scanner;

public class compress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Input  K:");
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int sum = 0;
        boolean first =true;

        for(int i = 0; i < n; i++){
            if((arr[i]== k1 || arr[i] == k2 || arr[i] == k3) ){
                continue;
                System.out.print(arr[i]+" ");
                if (arr[i + 2] != k1 || arr[i + 2] != k2 || arr[i + 2] != k3) {
                    sum += arr[i];
                    System.out.print(sum +" ");
                }
            }
            /*if(arr[i]==k[1]){
                System.out.print(k[1]+" ");
            }
            if(arr[i]==k[2]){
                System.out.print(k[2]+" ");
            }*/

            
            }  
        }
    }


