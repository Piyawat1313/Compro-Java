import java.util.Scanner;

public class NumTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int [][] number = new int[R][C];
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                number[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        StringBuilder result = new StringBuilder(); //ใช้สำหรับปรับแต่งสตริง หรือต้องการเปลี่ยนข้อความบ่อยๆ
        for(int i = 0; i < k; i++){
            int indexR = sc.nextInt();
            int indexC = sc.nextInt();
            if(indexR >= 1 && indexC >= 1 && indexR <= R && indexC <= C){   //เช็คว่าเกินขอบเขตที่รับมามั้ย
                   result.append(number[indexR - 1][indexC - 1]);   //แอดค่าลงตัวแปร result
                }
                else {
                    result.append("-");
                }  
        }
            System.out.print(result.toString());
            sc.close(); 
    }
}


