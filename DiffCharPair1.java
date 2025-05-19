import java.util.Scanner;

public class DiffCharPair1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tex = sc.nextLine();
        char w1 = sc.next().charAt(0);
        char w2 = sc.next().charAt(0);
        int index[] = new int[tex.length()];
        int count = 0;
        for (int i = 0; i < tex.length() - 1;) {
            char a = tex.charAt(i);
            char b = tex.charAt(i + 1);
            if ((a == w1 && b == w2) || (a == w2 && b == w1)) {     //เช็คว่า มันตรงกัน และสลับกันมั้ย
                index[count] = i + 1;   //เก็บตำแหน่งที่มีอักษรตัวนั้นคู่กัน
                count++;
                i += 2;     //ข้ามคู่นั้นไป
            }
            else{
                i += 1;     //ไปคู่ถัดไป
            }
        }
        for (int i = 0; i < count; i++) {
                System.out.print(index[i] + " ");
        }
        sc.close();
    }
}
