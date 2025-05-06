import java.util.Scanner;

public class NumTable3 {
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
        boolean isspace = false;
        boolean isdokjun = false;
        int arr2[] = new int[round + 1];
        int max = 0;
        for (int i = 1; i <= round; i++) {
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();
           
            if (index1 <= 0 || index1 > r || index2 <= 0 || index2 > c) {
                if(isspace){
                    arr2[i] = max;
                    max = 0;
                }
                isspace = false;
                isdokjun = false;
            } else {
                    if(found == arr[index1][index2] && isdokjun == true){
                        isspace = true;
                        max++;
                    }else{
                        isspace = true;
                        isdokjun = true;
                        max ++;
                    }
                    found = arr[index1][index2];
            }
        }
        int maxed = 0;
        int Count = 0;
        for (int i = 0; i < round; i++) {    //เช็คค่ามากที่สุด
            if(arr2[i] > maxed){
                maxed = arr2[i];
            }   
        }
        for (int i = 0; i < arr2.length; i++) {    //เช็คความเท่ากัน
            if(arr2[i] == maxed){  
                Count++;
            }
        }
        System.out.println(maxed);
        System.out.println(Count);
        sc.close();
    }
}
