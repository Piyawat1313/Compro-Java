import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[101];
        for(int i = 0; i < k; i++){
            int vote = sc.nextInt();
            arr[vote]++;     //บันทึกว่าช่องนี้มีคนเลือกและนับคะแนน
            //System.out.println(vote + " " + arr[vote]);
        }
        int max = 0;
        int canidate = 0;
        for(int i = 1; i <= n; i++){
            if(arr[i] > max){
                max = arr[i];
                canidate = i;   //ช่องที่มีคนเลือกมากที่สุด
            }
        }
        System.out.println(canidate);
        System.out.println(max);
        sc.close();
    }
}
