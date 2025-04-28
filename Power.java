import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int land[] = new int[n];
        int labor[] = new int[n];
        int power[] = new int[n];
        for (int i = 0; i < n; i++) {
            land[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            labor[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            power[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            int left = m - (k - 1) / 2;
            int right = m + (k - 1) / 2;
            boolean ch = (left < 1 || n < right);
            if(ch){
                System.out.print("no ");
            }
            if(left < 1){
                left = 1;
            }
            if(n < right){
                right = n;
            }
            boolean isenough = true;
            boolean Electric = false;
            int sum = 0;
            for (int j = left - 1; j < right; j++) {
                sum += land[j];
                if(labor[j] < 5){
                    isenough = false;
                }
                if(power[j] > 0){
                    Electric = true;
                }
            }
            if(!ch){
                System.out.print(sum);
                if(isenough){
                    System.out.print(" labor");
                }
                if(Electric){
                    System.out.print(" power");
                }
                System.out.println();
            }
            else{
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
