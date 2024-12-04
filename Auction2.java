import java.util.Scanner;

public class Auction2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] product = new int[n];
        for(int i = 0; i < n; i++){
            product[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int price;
        boolean[] count_price = new boolean[n];
        int[] count = new int[n];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < n; j++){
                price = sc.nextInt();
                if(count_price[j]){
                    continue;
                }
                if(price < 0){
                    count[j]++;
                }
                else if(price > product[j]){
                    product[j] = price;
                    count[j] = 0; //รีเซ็ทรอบที่ไม่มีการเปลี่ยนแปลง
                }
                else {
                    count[j]++;
                }
                if(count[j] == 3){
                    count_price[j] = true;
                }
            }
            for(int l = 0; l < n; l++){
               System.out.print(product[l] + " "); 
            }
            System.out.println();
        }
    }
}
