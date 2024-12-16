import java.util.Scanner;

public class Teamcompition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] team1 = new int[n];
        int [] team2 = new int[n];
        for(int i = 0; i < n; i++){
            team1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            team2[i] = sc.nextInt();
        }
        int team1_win = 0;
        int team2_win = 0;
        for(int i = 0; i < n; i++){
            if(team1[i] > team2[i]){
                team1_win += 2;
            }
            else if(team2[i] > team1[i]){
                team2_win += 2;
            }
            else if(team1[i] == team2[i]){
                team1_win++;
                team2_win++;
            }
        }
        if(team1_win > team2_win){
            System.out.print("Team 1 wins\n");
            System.out.print("Score" + " " + team1_win + " " + "to" + " " + team2_win);
        }
        else if(team2_win > team1_win){
            System.out.print("Team 2 wins\n");
            System.out.print("Score" + " " + team2_win + " " + "to" + " " + team1_win);
        }
        else{
            System.out.print("Draw game\n");
            System.out.print("Score" + " " + team1_win + " " + "to" + " " + team2_win);
        }
        sc.close();
    }
}
