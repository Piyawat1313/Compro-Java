import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] NumberTable = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                NumberTable[i][j] = sc.nextInt();
            }
        }
        int index = sc.nextInt();
        int row = 0; 
        int col = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < index; i++){
            row = sc.nextInt();
            col = sc.nextInt();
            if((row >= 1 && row <= r ) && (col >= 1 && col <= c)){
                if(row >= 0 && row <= 9 && col >= 0 && col <= 9){
                    result.append(NumberTable[row - 1][col - 1]);
                }
            }
            else{
                result.append("-");
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
