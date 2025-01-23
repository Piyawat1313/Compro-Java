
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n + 1];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int numberInteview = sc.nextInt();
        ArrayList<Integer> interview = new ArrayList<>();
        boolean check = false;
        for(int i = 1; i <= n; i++){
            if(arr[i] == numberInteview){
                interview.add(i);
                check = true;
            }
        }
        if(!check){
            interview.add(0);
        }
        for(int i : interview){
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}
