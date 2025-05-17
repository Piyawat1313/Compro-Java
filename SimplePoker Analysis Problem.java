import java.util.Scanner;

public class SimplePoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {   //loop แถว
            int card[] = new int[10];   //สร้างอาเรย์ขนาด 10 เพื่อเช็ค 0 - 9
            int input[] = new int[5];   //เช็ค 5 แถวที่เข้ามา
            for (int j = 0; j < 5; j++) {
                input[j] = sc.nextInt();
                card[input[j]]++;   //อัปเดตค่าที่รับเข้ามา
            }
            int maxCard = input[0];     //เก็บค่าแรกที่รับ
            int max = card[input[0]];       //เก็บค่าแรกที่อัปเดตเข้ามา
            int card2 = 0;
            for (int j = 1; j < 10; j++) {      //ลูป 10 ครั้ง เพื่อเช็ค 0 - 9
                if(card[j] > max){      //หาค่ามากสุด
                    max = card[input[j]];   //เก็บค่าที่อัปเดตเข้ามา
                    maxCard = input[j];     //เก็บเลขที่รับเข้ามา
                    card2 = -1;     // reset
                }
                else if(card[input[j]] == max && maxCard != input[j]){      //เลขที่อัปเดตเข้ามามีค่าเท่ากัน และ เลขที่เก็บเข้ามา ไม่ตรงกับเลขที่รับมา
                    maxCard = input[i];     //เก็บลงไป
                }
            }
            if(max == 1){   //ถ้ามี 1
                System.out.println("........");
            }
            else if(max == 2){      //ถ้าเป็น 2 
                if(maxCard == -1){      //ถ้าไม่มีซ้ำ
                    System.out.println("....." + maxCard);
                }
                else{       ///มีซ้ำเกิน 1 คู่
                    System.out.println("......" + maxCard + " ...... " + card2);
                }
            }
            else if(max == 3){  //เป็น 3
                System.out.println("......" + maxCard);
            }   
            else if(max == 4){      //เป็น 4 
                System.out.println("........" + maxCard);
            }
        }
        sc.close();
    }
}
