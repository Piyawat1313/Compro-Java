import java.util.ArrayList;
import java.util.Scanner;

public class Bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int[]arr = new int[round];
        for(int i = 0; i < round; i++){
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        boolean ch = false;
        for(int i = 0; i < round; i++){
            if(arr[i] >= r && arr[i] <= c){
               continue;
            }else{
                List.add(arr[i]);
                ch = true;
            }
        }
        if(!ch){
            System.out.println("no data");
        }
        for(int num : List){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
