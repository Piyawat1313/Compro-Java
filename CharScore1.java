import java.util.Scanner;
public class CharScore1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int halfFirst = 0;
        int halfBack = 0;
        String text1 = "", text2 = "";
            int halfCut = str.length() / 2;
            text1 = str.substring( 0 ,halfCut);
            text2 = str.substring(halfCut);
         
            for(char c : text1.toCharArray()){      //วิธีกำหนดค่า ให้ A = 1 .... ไปเรื่อยๆ
            halfFirst += (c - 'A' + 1);
         } 
         for(char C : text2.toCharArray()){
            halfBack += (C - 'A' + 1);
         }  
        System.out.println(halfFirst);
        System.out.println(halfBack);
        sc.close();
    }
}
