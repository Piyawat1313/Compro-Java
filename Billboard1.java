import java.util.Scanner;

public class Billboard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[index] + " ");
            index++;
            if(index >=  n){
                index = 0;
            }
        }
    }
}
