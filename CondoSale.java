import java.util.Scanner;

public class CondoSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
       
        boolean saleFirst[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < k; i++) {
            int Class = sc.nextInt();
            if(Class >= p && Class < (p + n)){
                int sale = (Class - p);
                if(!saleFirst[sale]){
                    saleFirst[sale] = true;
                }
            }
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(saleFirst[i]){
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if(saleFirst[i]){
                System.out.println(p + i);
            }
        }
        sc.close();
    }
}
