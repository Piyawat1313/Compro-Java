import java.util.Scanner;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
      
        boolean ladders = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cell = i * n + j + 1;   //แปลงเป็นช่อง ธรรมดา
                int board = arr[i][j];      //เก็บค่าในอาเรย์ทั้งหมด
                if (board > 1) {
                    if (!ladders) {
                        System.out.println("Ladders");
                        ladders = true;
                    }
                    int taget = cell + board;   //เป้าหมายการเดิน ช่อง + ค่าที่เก็บมา
                    if (taget < 1 || taget > n * n) {
                        System.out.println(cell + " " + "goto " + taget + " error");
                    }
                    else{
                        System.out.println(cell + " goto " + taget);
                    }
                }
            }
        }
        boolean snake = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cellNa = i * n + j + 1; //วิธีแปลงเป็นช่องธรรมดา
                int board = arr[i][j];
                if(board < 0){
                    if(!snake){
                        System.out.println("Snakes");
                        snake = true;
                    }
                    int taget = cellNa + board;
                    if(taget < 1 || taget > n * n){
                        System.out.println(cellNa + " goto " + taget + " error");
                    }
                    else{
                        System.out.println(cellNa + " goto " + taget);
                    }
                }
            }
        }
        sc.close();
    }
}
