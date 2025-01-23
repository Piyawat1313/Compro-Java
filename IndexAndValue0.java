import java.util.Scanner;

public class IndexAndValue0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =  new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int result = 0;
        boolean ch = false;
        for(int i = 0; i < n; i++){
            if(index > 1 && index < n){
                if(arr[i] == arr[index]){
                    result = arr[i];
                    ch = true;
                }
            }
        }
        if(!ch){
            System.out.println("-1");
        }else{
            System.out.println(result);
        }
        sc.close();
    }
}
