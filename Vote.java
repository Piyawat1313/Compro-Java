import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();
            System.out.print("Input K: ");   
        int k = sc.nextInt();
            int[] vote = new int[n];
            int[] sum_vote = new int[k + 1];
            System.out.print("Input Vote: ");
            for(int i = 0; i < n; i++){
                    vote[i] = sc.nextInt();
                    if(vote[i] >= 1 && vote[i] <= k){
                        sum_vote[vote[i]]++;
                    }   
            }
            int max_vote = 0;
            int max_canidate = 0;
            for(int i = 1; i <= k; i++){
                if(sum_vote[i] > max_vote){
                    max_vote = sum_vote[i];
                    max_canidate = i;
                }
            }
            System.out.println("Max_vote: "+ max_vote);
            System.out.println("Canidate : " + max_canidate);
    }
}
