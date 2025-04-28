import java.util.Scanner;

public class Labor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
 	    int labor[] = new int[n + 1];
        
	    for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
       
        for (int i = 1; i <= n; i++) {
            labor[i] = sc.nextInt();    //จำนวนแรงงานที่ดินแต่ละแปลง
        }
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int pos1 = sc.nextInt();
            int pos2 = sc.nextInt();
            int left = pos2 - pos1 / 2;
            int right = pos2 + pos1 / 2;
            System.out.println("Left Cal: " + left + " " + "Right Cal: " + right);
            boolean isOut = (left < 1 || n < right);
            System.out.println("Boolean: " + isOut);
            if(isOut){
                System.out.print("no ");
            }
            if(left < 1){
                left = 1;
                System.out.println("left: " + left);
            }
            if(n < right){
                right = n;
                System.out.println("Right: " + right);
            }
            boolean ch = true;      //เช็คว่า แรงงาน เกิน 5 คน
            int sum_labor = 0;
                for (int j = left; j <= right; j++) {
                    sum_labor += arr[j];
                    if(labor[j] < 5){   //ถ้าไม่เกิน 
                        ch = false;     //เปลี่ยนสถานะ
                    }
                }
                if(ch && isOut == false){   //ถ้าเป็น true ทั้งคู่
                    System.out.println(sum_labor + " " + "labor");
                }else{
                    System.out.println(sum_labor);
                }
        }
        sc.close();
    }
}
