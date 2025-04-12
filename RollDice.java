import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] board = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            board[i] = sc.nextInt();
        }
        int toy = sc.nextInt();
        int point = 0;
        int score = 0;
        int index = 0;
        for(int i = 0; i < toy; i++){
            point = sc.nextInt();
            index = (index + point) % n;    // เอาอินเด็กเก็บไว้เพื่อเป็นตำแหน่งอ้างอิงถึง
           score += arr[index]; //บวกแต้มช่องที่เราอยู่
            if(board[index] != 0){         //ถ้าช่องนี้มีการเดิมต่อ         
                index = (index + board[index]) % n;     //อินเด็กเดิม + อาเรย์ช่องที่เราหยุดอยู่  % n 
                if(index < 0){  //เช็คว่าindex ที่เก็บมาติดลบ
                    index += n;     // ไปบวกกับความจุของอาเรย์
                    score += arr[index];    //เอาแต้ม + ช่องที่เราอยู่
                }else{      //ถ้าไม่ติด 0 
                    score += arr[index];    //บวกันได้เลย
                }
            }
                System.out.println(index + " " + score);
        }
        sc.close();
    }
}
