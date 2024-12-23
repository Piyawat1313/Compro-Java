import java.util.*;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // รับค่า K จากบรรทัดแรก
        int K = Integer.parseInt(sc.nextLine());
       int[] CharCount1 = new int[26];
       int count = 0;
       while(sc.hasNextLine()){
        String input = sc.nextLine();
        count++;
        for(Character num : input.toCharArray()){
            int index = num - 'A';  //แปลงอักขระให้เป็นindexในอาเรย์
            CharCount1[index]++;
            if(CharCount1[index] == K){
                System.out.println(num);
                System.out.println(count);
                return;
            }
        }
       }

        
    }
}
