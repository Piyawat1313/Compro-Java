
import java.util.Scanner;

public class IndexOf 2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        String searchString = sc.nextLine(); 
        findOccurences(mainString, searchString);
        sc.close();
    }
    public static void findOccurences(String mainString, String searchString){
        int index = mainString.indexOf(searchString);
        boolean check = false;
        while(index != -1){     //ใช้เพื่อตรวจสอบว่าข้อความยังอยู่ในสตริงเป้าหมายหรือไม่
                System.out.print(index + 1 + " ");
                check = true;
                index = mainString.indexOf(searchString,index + 1);
        }
        if(!check){
            System.out.println("string not found");
        }
    }
}

