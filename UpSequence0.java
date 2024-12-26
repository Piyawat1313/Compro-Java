import java.util.ArrayList;
import java.util.Scanner;

public class UpSequence0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int [] more_number = new int[round];
        ArrayList<Integer> moreOrequal = new ArrayList<>();
        for(int i = 0; i < round; i++){
            more_number[i] = sc.nextInt();
        }
        for(int i = 0; i < round - 1; i++){
            if(more_number[i] >= more_number[i + 1]){
                moreOrequal.add(more_number[i]);
            }
        }
        if(round > 0){  //ถ้ามากกว่า 0 
            moreOrequal.add(more_number[round - 1]);    //เพิ่มค่าตัวสุดท้าย
        }
        for(int num : moreOrequal){
            System.out.println(num);
        }
        sc.close();
    }
}
