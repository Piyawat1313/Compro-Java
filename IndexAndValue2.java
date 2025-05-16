import java.util.Scanner;

public class IndexAndValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        boolean isOut1 = true;
        boolean isOut2 = true;
        int pikud1 = 0;
        int pikud2 = 0;
        int count = 0;
        int count2 = 0;
        if(index1 < 0 || index1 >= n){
            isOut1 = false;
            if(!isOut1){
                System.out.println("-1");
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(arr[i] == arr[index1]){
                    pikud1 = arr[index1];
                    count = 1;
                }
            }
            System.out.println(pikud1);
        }
        if(index2 < 0 || index2 >= n){
            isOut2 = false;
            if(!isOut2){
                System.out.println("-1");
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(arr[i] == arr[index2]){
                    pikud2 = arr[index2];
                    count2 = 1;
                }
            }
            System.out.println(pikud2);
        }
        int max = Math.max(pikud1, pikud2);
        if(max > 0){
            System.out.println(max);
        }
        if(max == 0){
            System.out.println("No");
        }
        sc.close();
    }
}
