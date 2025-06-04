import java.util.Scanner;

public class EncodingAlphabetwithNumber {
    static void encode(int[]arr, String str){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = str.charAt(i);
            num = ((ch - 'A' + arr[i]) % 26) + 'A'; // ch - 'A' ต้องการให้มันอยู่ในตำแหน่ง 0 - 25 
            //  + arr[i] บวกตำแหน่งถัดไปของตัวอักษร มันคือการเลื่อนตำแหน่ง ใน  0 - 25
            // % 26 ต้องการให้มันอยู่ในตำแหน่ง 0 - 25 ไม่เกินจากนี้
            // + 'A' ต้องการให้ตำแหน่งวนอยู่ในช่วงนั้น 
            System.out.print(((char)num));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr[] = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        encode(arr, str);
        sc.close();
    }
}
