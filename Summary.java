import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R =sc.nextInt();
        int C =sc.nextInt();
        int arr[][] = new int[R + 1][C + 1];    //ตั้งอาเรย์ เริ่มต้นที่ 1
        int index = sc.nextInt();
        
       
      for(int j = 0; j < index; j++){
        int row = sc.nextInt();
        int col = sc.nextInt();
        int endrow =sc.nextInt();
        int endcol = sc.nextInt();
        boolean check = true;   //เอาไว้เช็คค่าในอาเรย์ว่าเจอแล้ว
        if(row < 1 || row > R|| col < 0 ||col > C||row + endrow - 1 > R || col + endcol - 1 > C){   //ถ้าเกินขอบเขต หรือ พื้นที่ย่อยเกิน
            continue;   //ให้ทำงานต่อ
        }
            for(int i = row; i < row + endrow; i++){        //ลูปนี้เริ่มต้นจากเลขที่รับมาจากผู้ใช้
                for(int k = col; k < col + endcol; k++){
                    if(arr[i][k] == 1){ //ถ้าเจอ 1 
                        check = false;  // เปลี่ยนสถานะ 
                    }
                }
            }
            if(check){  //ถ้าเป็น true
                for(int i = row; i < row + endrow; i++){
                    for(int l = col; l < col + endcol; l++){
                        arr[i][l] = 1; //เปลี่ยนเป็น 1
                        }
                    }
                }
            }  
        for(int i = 1; i <= R; i++){    //เริ่มต้นที่ 1 
            for(int m = 1; m <= C; m++){
                System.out.print(arr[i][m] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
