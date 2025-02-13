import java.util.Scanner;

public class SimplePoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int[] arr = new int[5];     //แถวละ 5 ใบ
            int[] Ce = new int[14];     //ที่เอา14 เพราะว่าต้องการหาไพ่ที่ซ้ำกันทั้งหมด 
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
                Ce[arr[j]]++; // เพิ่มจำนวนไพ่ที่ปรากฎ และเก็บบันทึกไว้
            }
            int four = -1;
            int triple = -1;
            int pairOne = -1;
            int pairTwo = -1;
            for (int K = 1; K <= 13; K++) {
                if (Ce[K] == 4) { // ถ้ามี 4 ใบ
                    four = K; // เก็บค่านั้นไว้
                } else if (Ce[K] == 3) { // ถ้ามี 3 ใบ
                    triple = K;
                } else if (Ce[K] == 2) { // ถ้ามี 2 ใบ
                    if (pairOne == -1) { // ถ้าไม่มีไพ่คู่
                        pairOne = K; // เก็บค่านั้นไว้ก่อน
                    } else { // ถ้าเบิ้ล
                        pairTwo = K; // เก็บค่าเบิ้ลไว้
                    }
                }
            }
            if (four != -1) {
                System.out.println("Four of a Kind of" + " " + four);
            } else if (triple != -1) {
                System.out.println("Triple of " + triple);
            } else if (pairTwo != -1) {
                if (pairOne < pairTwo) {
                    System.out.println("Two Pair of " + pairTwo + " " + "and " + pairOne);
                } else if(pairOne >= pairTwo){
                    System.out.println("One Pair of " + pairOne + " " + "and " + pairTwo);
                }
            } else if (pairOne != -1) {
                System.out.println("One Pair of " + pairOne);
            } else {
                System.out.println("No Combination");

            }
        }
        sc.close();
    }
}
