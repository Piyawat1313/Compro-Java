import java.util.Scanner;

public class StringExtream2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        int max;
        if(number == 1){
            max = 0;
        }else {
            max = Integer.MAX_VALUE;
        }
        
        String text1 = sc.nextLine();   //สนใจ
        String text2 = sc.nextLine(); //สนใจ
        String T = "";
        int count = 0;
        String sumText = "";
        boolean check = true;
        while(true){
            T = sc.nextLine();
            if(T.isEmpty()){
                break;
            }
            if(T.contains(text1) || T.contains(text2)){ //ใช้เช็คข้อคามที่สนใจอยู่ในสตริงหรือไม่
                if(number == 1){
                    if(T.length() >= max){
                            max = T.length();
                            sumText = T;
                            check = false;
                        
                    }
                }
                else if((number == 2 && T.length() <= max)){
                    max = T.length();
                    sumText = T;
                    check = false;
                }
            }
        }
            System.out.println(max);
            System.out.println(sumText);
        sc.close();
    }
}
