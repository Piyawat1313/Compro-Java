import java.util.Scanner;

public class Inbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Inbound = new int[n];
        for(int i = 0; i < n; i++){
            Inbound[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        if(index1 >= index2){
            System.out.println("no data"); 
        }
        boolean data = false;
        for(int i = 0; i < n; i++){
            if(Inbound[i] >= index1 && Inbound[i] <= index2){
                System.out.print(Inbound[i] + " ");
                data = true;
            }
        }
        if(!data){
            System.out.println("no data"); 
        }
        sc.close();
    }
}
