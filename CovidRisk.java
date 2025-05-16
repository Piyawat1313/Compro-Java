import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CovidRisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int covid = sc.nextInt();
        int boardCovid[][] = new int[R + 1][C + 1];
        int max = Integer.MIN_VALUE;
        int arrX[] = { -1, -1, -1, 0, 0, 1, 1, 1 };     //หาทิศทางทั้งแปด
        int arrY[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
        for (int i = 0; i < covid; i++) {
            int rowCo = sc.nextInt();
            int colCo = sc.nextInt();
            if ((rowCo >= 1 && rowCo <= R) && (colCo >= 1 && colCo <= C)) {
                boardCovid[rowCo][colCo] += 2;
                for (int j = 0; j < 8; j++) {       //ลูป 8 ทิศ
                    int row = rowCo + arrX[j];  //ตำแหน่งที่รับ มา บวกกับ ทิศทางแปด
                    int col = colCo + arrY[j];
                    if (row >= 1 && row <= R && col >= 1 && col <= C) {
                        boardCovid[row][col]++;     //พื้นที่บริเวณทั้งแปดทิศ จะตำเป็นความเสี่ยง
                    }
                }
            }
        }
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                System.out.print(boardCovid[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= R; i++) {      //หาคนเป็น โควิดที่มากที่สุด
            for (int j = 1; j <= C; j++) {
                if (boardCovid[i][j] > max) {
                    max = boardCovid[i][j];
                }
            }
        }
        System.out.println(max);
        for (int i = 1; i <= R; i++) {      //หาแถวคนที่เป็นโควิด
            for (int j = 1; j <= C; j++) {
                if(max == boardCovid[i][j]){
                    result.add(i);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {       //ลบค่าที่ซ้ำในอาเรลิสต์
            int sum = result.get(i);    //เก็บค่าล่าสุด
            for (int j = i + 1; j < result.size(); j++) {       //ลูป j = i + 1 เพราะจะเช็คส่วนถัดไป
                if(result.get(j) == sum){   //ถ้ามีเลขซ้ำกัน
                    result.remove(j);       //ลบช่องที่ซ้ำ
                    j--;        //ลดช่องลงมา
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        sc.close();
    }
}
