import java.util.Collection;
import java.util.Scanner;

public class ThreeNumber {
    public static int median(int number1, int number2, int number3){
        int median = 0;
        //การหาค่ามัธยฐาน แบบ ตัวแปร 3 ตัว
        if((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)){
            median = number1;
        }
        else if((number2 > number1 && number2 < number3) || (number2 < number1 && number2 > number3)){
            median = number2;
        }
        else if((number3 > number2 && number3 < number1) || (number3 < number2 && number3 > number1)){
            median = number3;
        }
        return median;
    }
    public static int MAX(int number1, int number2, int number3){
        int max = Integer.MIN_VALUE;
        if(number1 > max){
            max = number1;
        }
        if(number2 > max){
            max = number2;
        }
        if(number3 > max){
            max = number3;
        }
        return max;
    }
    public static int MIN(int number1, int number2, int number3){
        int min = Integer.MAX_VALUE;
        if(number1 < min){
            min = number1;
        }
        if(number2 < min){
            min = number2;
        }
        if(number3 < min){
            min = number3;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int dictation = sc.nextInt();
        if(dictation == -1){    //เอาค่าน้อยที่สุด
            System.out.println(MIN(number1, number2, number3));
        }
        else if(dictation == 1){    //เอาค่าที่มากที่สุด
            System.out.println(MAX(number1, number2, number3));
        }
        else if(dictation == 0){    //เอาค่ากลาง
            System.out.println(median(number1, number2, number3));
        }
        sc.close();   
    }
}
