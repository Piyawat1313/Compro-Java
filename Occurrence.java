import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int NumberOccurrence = sc.nextInt();
        boolean ch = false;
        for(int i = 1; i <= n; i++){
            if(arr[i] == NumberOccurrence){
                System.out.print(i + " ");        //ปริ้นตำแหน่งของเลขที่ตรงกับความต้องการ
                ch = true;
            }
        }
        if(!ch){
            System.out.println(0);
        }
        sc.close();
    }
    
}
