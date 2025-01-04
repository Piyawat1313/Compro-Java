import java.util.Scanner;

public class CharInRange2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1, ch2, ch3, ch4, ch5, ch6;
            ch1 = sc.next().charAt(0);
            ch2 = sc.next().charAt(0);
            ch3 = sc.next().charAt(0);
            ch4 = sc.next().charAt(0);
            ch5 = sc.next().charAt(0);
            ch6 = sc.next().charAt(0);
            if(ch1 > ch2){            //ตรงนี้เป็นเทคนิคสลับค่าหรือการเรียงลำดับ
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
        String text = sc.next();    //รับข้อความ
        char index = text.charAt(0);
        int countWin = 0; 
        int result = 0;
        int countLoss = 0;
        for(int  i = 0; i < text.length(); i++){
            index = text.charAt(i);  //เก็บอาเรย์ของ char
            int countString = 0;
            if(index >= ch1 && index <= ch2){       //เช็คอยู่ในช่วงทั้งสาม
                countString++; 
            }
            if(index >= ch3 && index <= ch4){
                countString++;
            }
            if(index >= ch5 && index <= ch6){
                countString++;
            }
            if(countString > 0){    //เช็ค สตริงที่อยู่ในช่วงมากกว่า 0
                countWin++;    //ชนะบวกไปทีละ1
                result += countString;  //ผลลัพธิ่ + จำนวนสตริงที่อยู่ในช่วง
            }
            else{  //ถ้าไม่ได้อยู่ในช่วง หรือ เช็คว่า countString == 0 ได้
                countLoss++;  //แพ้บวกไปทีละ 1 
                result -= 2;  //ผลลัพธิ์บวกไปทีละ 2 
            }
            

        } 
        System.out.println(countWin);
        System.out.println(countLoss);
        System.out.println(result);
        sc.close();
    }
}
