import java.util.Scanner;

public class ABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char idx = 0;
        char idx2 = 0;
        char idx3 = 0;
        int result = 0;
        int index = -1;
        boolean check = false;
        for (int i = 0; i <= word.length() - 3; i++) {
            idx = word.charAt(i);
            idx2 = word.charAt(i + 1);
            idx3 = word.charAt(i + 2);
            if(idx2 == idx + 1 && idx3 == idx2 + 1){
                result++;
                check = true;    //เจอการติดกัน
            }
            if(check == true && result == 1){
                index = i + 1;    //เก็บตำแหน่งที่พบอักษรเรียงติดกัน
            }
            check = false;    //reset ทุกๆรอบของการเก็บตำแหน่ง
        }
        System.out.println(result);
        if(index != -1){
            System.out.println(index);
        }
        else{
            System.out.println(index);
        }
        sc.close();
    }
}
