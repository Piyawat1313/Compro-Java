import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] code = new int[n];
        for(int i = 0; i < n; i++){
            code[i] = sc.nextInt();
        }
        int indexCheck = sc.nextInt();
        int key = sc.nextInt();
        int v1 = 0, v2 = 0, v3 = 0, v4 = 0;
        boolean ch = false;
        boolean ch1 = false;
            v1 = code[indexCheck] + key;        //ที่บวก1 2 3 คือเป็นการหาตำแหน่งถัดไปมาคำนวน
            v2 = code[indexCheck + 1] - key;
            v3 = code[indexCheck + 2] - key;
            v4 = code[indexCheck + 3] + key;
        
        if(v1 <= 51743 || v2 > 7832){
            System.out.println("pass");  
            ch = true;     
        }
        else{
            System.out.println("fail");
        }
        if(v3 <= 2394 || v4 > 9213){
            System.out.println("pass");
            ch1 = true;
        }
        else {
            System.out.println("fail");
        }
        if(ch && ch1){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}
