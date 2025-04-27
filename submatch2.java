import java.util.Scanner;

public class submatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String msg = sc.nextLine();
        String arr[] = new String[msg.length() - 2];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            String word = msg.substring(i, i + 3);      //วิธีหา String แบบทีละ 3 ตัว
            arr[i] = word;
            System.out.println(word);
        } 
        for (int i = 0; i < arr.length; i++) {
            int index = str.indexOf(arr[i]);
            if(index == -1){
                System.out.println("No");
            }else{
                System.out.println(index + 1);
            }
        }
        sc.close();
    }
}
