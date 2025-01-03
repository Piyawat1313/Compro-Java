import java.util.Scanner;

public class CharInRange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1, ch2, ch3, ch4, ch5, ch6;
            ch1 = sc.next().charAt(0);
            ch2 = sc.next().charAt(0);
            ch3 = sc.next().charAt(0);
            ch4 = sc.next().charAt(0);
            ch5 = sc.next().charAt(0);
            ch6 = sc.next().charAt(0);
            if(ch1 > ch2){      //เรียงจากน้อยไปหามาก
                char temp = ch1;
                ch1 = ch2;
                ch2 = temp;
            }
            if(ch3 > ch4){
                char temp = ch3;
                ch3 = ch4;
                ch4 = temp;
            }
            if(ch5 > ch6){
                char temp = ch5;
                ch5 = ch6;
                ch6 = temp;
            }
        char chTaget1 = sc.next().charAt(0);
        char chTaget2 = sc.next().charAt(0);
        char chTaget3 = sc.next().charAt(0);
        {
            //เช็คช่วงแรกของตัวอักษรตัวที่ 1 
            StringBuilder result = new StringBuilder();
            boolean check = false; 
            if(chTaget1 >= ch1 && chTaget1 <= ch2){
                result.append("1 ");
                check = true;
            }
            if(chTaget1 >= ch3 && chTaget1 <= ch4){
                result.append("2 ");
                check = true;
            }
            if(chTaget1 >= ch5 && chTaget1 <= ch6){
                result.append("3");
                check = true;
            }
            if(!check){
                System.out.println("0");
            }else{
                System.out.println(result.toString().trim());
            }
            
        }

        {
            //เช็คช่วงตัวที่ 2 
            StringBuilder result = new StringBuilder();
            boolean check = false;
            if(chTaget2 >= ch1 && chTaget2 <= ch2){
                    result.append("1 ");
                    check = true;
                }
                if(chTaget2 >= ch3 && chTaget2 <= ch4){
                    result.append("2 ");
                    check = true;
                }
                if(chTaget2 >= ch5 && chTaget2 <= ch6){
                    result.append("3");
                    check = true;
                }
                if(!check){
                    System.out.println("0");
                }else {
                    System.out.println(result.toString().trim());
                }
                     
        }

        {
            //เช็คช่วงตัวที่ 3 
            StringBuilder result = new StringBuilder();
        boolean check = false;
            if(chTaget3 >= ch1 && chTaget3 <= ch2){
                    result.append("1 ");
                    check = true;
                }
                if(chTaget3 >= ch3 && chTaget3 <= ch4){
                    result.append("2 ");
                    check = true;
                }
                if(chTaget3 >= ch5 && chTaget3 <= ch6){
                    result.append("3");
                    check = true;
                }
                if(!check){
                    System.out.println("0");
                }else{
                    System.out.println(result.toString().trim());
                }
        }
        sc.close();
    }
}
