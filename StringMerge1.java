
import java.util.Scanner;

public class StringMerge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        int number = sc.nextInt();
        char ch1 = text1.charAt(0);
        char ch2 = text2.charAt(0);
        int length = Math.min(text1.length(), text2.length());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < length; i++){
            ch1 = text1.charAt(i);
            ch2 = text2.charAt(i);
                if(Character.isUpperCase(ch1) && Character.isLowerCase(ch2)){   //ตัวแรกเป็นพิมใหญ่ และสองเป็นพิมเล็ก
                    result.append(ch1); // แอดตัวใหญ่ลง

                }
                else if(Character.isLowerCase(ch1) && Character.isUpperCase(ch2)){  //ตัวที่ 1 เล็ก และตัวที่ 2 ใหญ่
                    result.append(ch2); //แอดค่าที่สองลงไป
                }else{
                    if(number == 1){    //เป็น 1 
                        result.append(ch1); //แอดค่าที่ 1
                    }
                    else if(number == 2){   //เป็น2
                        result.append(ch2); // แอดค่าที่สอง
                    }
                }
        }
        System.out.println(result);
        sc.close();
    }
}
