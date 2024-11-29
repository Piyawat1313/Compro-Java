import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();
        if(n > 100 || n < 1){
            return;
        }
        int [] y = new int[n];
        System.out.print("Input Y: ");
        for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
        System.out.print("Input Start Year: ");
        int startYear = sc.nextInt();
        for(int i = 0; i < n; i++){
            y[i] += startYear - 1;
        }
        System.out.print("Input Year query: ");
        int queryYear = sc.nextInt();
        System.out.print("Input Year: ");
        int [] taget = new int[queryYear];  
        for(int i = 0; i < queryYear; i++){     //ถามว่า ปีที่กำลังจะถาม มีห้องไหนว่างบ้าง
            taget[i] = sc.nextInt();
            int count = 0;
            for(int j = 0; j < n; j++){
                if(taget[i] > y[j]){
                    System.out.print(j + 1 + " ");
                    count ++;
                }
        }
        if(count == 0){
            System.out.println("full");
        }else{
            System.out.println();
        }
        
    }
    }
}
