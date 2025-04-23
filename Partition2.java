import java.util.ArrayList;
import java.util.Scanner;

public class Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int partiton[] = new int[n];
        int index = (n / 2);
        for(int i = 0; i < n; i++){
            partiton[i] = arr[index];
        }
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] <= partiton[i]){
                count.add(arr[i]);
            }
        }
        int index1 = (count.size() / 2);
        for(int i = 0; i < count.size(); i++){
            if(count.get(i) <= count.get(index1)){
                System.out.print(count.get(i) + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < count.size(); i++){
            if(count.get(i) > count.get(index1)){
                System.out.print(count.get(i) + " ");
            }
        }
        sc.close();
    }
}
