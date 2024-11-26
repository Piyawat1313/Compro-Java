import java.util.Scanner;

public class VoteSU {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int score1 = 0; 
    int score2 = 0;
    int gender = 0;
    int count1 = 0 , count2 = 0;
        for(int i = 1; i <= n; i++){
            gender =sc.nextInt();
            score1 = sc.nextInt();
            score2 = sc.nextInt();
            if(count1 < k && score1 >= 9 && gender == 1){
                System.out.print(i + " " + 1 + "\n");
                count1 ++;
            }
            else if(count2 < k && score2 >= 9 && gender == 2){
                System.out.print(i + " " + 2 + "\n");
                count2 ++;
            }
            else if(count1 < k && score1 >= 9){
                System.out.print(i + " " + 1 + "\n");
                count1 ++;
            }
            else if(count2 < k && score2 >= 9){
                System.out.print(i + " " + 2 + "\n");
                count2 ++;
            }
        }
    }        
}
