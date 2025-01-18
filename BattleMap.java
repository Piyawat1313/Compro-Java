import java.util.Scanner;

public class BattleMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int hit = 0;
        int not_hit = 0;
        int hit_agian = 0;
        int hitAgianNot_ship = 0;
        int outArea = 0;
        
        for(int i = 0; i < k; i++){
            int shot_k = sc.nextInt();
            int shot_fight = sc.nextInt();
            
            if(shot_k > 0 && shot_k <= r && shot_fight > 0 && shot_fight <= c){
                int index_K = shot_k - 1;
                int index_fight = shot_fight - 1; 
                
                if(arr[index_K][index_fight] == 1){
                    hit++;
                   arr[index_K][index_fight] = -1; //แทนการเปลี่ยนสถานะว่าโดนยิง
                }
                else if(arr[index_K][index_fight] == 0){
                    not_hit++;
                    arr[index_K][index_fight] = -2; //แทนสถานะว่ายิงไม่โดน
                }
                else if(arr[index_K][index_fight] == -1){
                    hit_agian++;
                }
                else if(arr[index_K][index_fight] == -2){
                    hitAgianNot_ship++;
                }
            }
            else if(shot_k < 1 || shot_k > r || shot_fight < 1 || shot_fight > c){
                outArea++;
            }
        }
        System.out.println(hit);
        System.out.println(not_hit);
        System.out.println(hit_agian);
        System.out.println(hitAgianNot_ship);
        System.out.println(outArea);
        sc.close();
    }
}
