import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  //รับเลขมา ว่าเป็น 1 หรือ 2
        sc.nextLine();  //รับค่าทิ้งไป
        int countString = 0;
        String text = "";  
        int max;    
        if(number == 1){    //ถ้าเป็น 1
            max = 0;    //reset max = 0
        }else{  //ถ้าเป็น 2 
            max = Integer.MAX_VALUE;    //max เป็นค่ามากที่สุด
        }
        String space = "";  //สตริงว่างๆ
       while(true){
         text = sc.nextLine();  //รับสตริง
            if(text.isEmpty()){ //isEmpty คือ ถ้าว่าง
                break;  //หยุด
            }
            countString = text.length();    //เก็บขนาดของข้อความ
             if(number == 1){   //ถ้าเป็น 1
                if(countString  >= max){ //ขนาดข้อความมาก max   
                    max = countString; // max เก็บ ขนาดตัวอักษรไว้
                    space = text;   //เก็บข้อความ
                }
            }
            else if(number == 2){   //ถ้าเป็น 2
                if(countString <= max){ //ขนาดของข้อความน้อยกว่า max 
                    max = countString;  //max เก็บ ขนาดของข้อความ
                    space = text;   //เก็บข้อความ
                }
            }
        }
        System.out.println(max);
        System.out.println(space);
    }
}

