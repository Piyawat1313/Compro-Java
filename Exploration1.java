import java.util.Scanner;

public class Exploration1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] survay = new int[r+1][c+1];
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                survay[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int resultplus = 0;
        int resultminus = 0;
        int resultEven = 0;
        int resultOdd = 0;
        for(int i = 1; i <= k; i++){
            int indexR = sc.nextInt() ;
            int indexC = sc.nextInt() ;
            if(indexR >= 1 && indexC >= 1 && indexR <= r && indexC <= c){
                if(survay[indexR][indexC] < 0){ //เช็คว่าติดลบ
                    resultminus++;
                }
                if(survay[indexR][indexC] > 0){     //เช็คเป็นบวก
                    resultplus++;
                }
                if(survay[indexR][indexC] % 2 == 0){    //เช็คว่าเป็นเลขคู่
                    resultEven++;
                }
                if(survay[indexR][indexC] % 2 != 0){    //เช็คเลขคี่
                    resultOdd++;
                }
            }
        }
        System.out.print(resultplus + " " + resultminus + " " + resultEven + " " + resultOdd);
    }
}
