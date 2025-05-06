import java.util.Scanner;

public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int round = sc.nextInt();
        int found = 0;
        boolean isspace = false;  //เช็คขึ้นบรรทัดใหม่
        boolean isdokjun = false;  //เช็คดอกจัน
        for (int i = 1; i <= round; i++) {
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();
           
            if (index1 <= 0 || index1 > r || index2 <= 0 || index2 > c) {    //เช็คเกินขอบเขต
                if(isspace){    //บรรทัดใหม่เป็นค่า true
                   System.out.println();
                }
                isspace = false;  // reset
                isdokjun = false;  //reset
            } else {
                    found = arr[index1][index2];  //เก็บค่าของอาเรย์ตัวนั้นไว้
                    if(found == arr[index1][index2] && isdokjun == true){    //เช็คว่า ค่าที่เก็บไว้ตรงกับค่าที่รับเข้ามาหรือป่าว และ isdokjun  เป็น true
                        System.out.print("*");
                        isspace = true;
                    }else{
                        System.out.print(arr[index1][index2]);
                        isspace = true;
                        isdokjun = true;
                    }
            }
        }
        sc.close();
    }
}
