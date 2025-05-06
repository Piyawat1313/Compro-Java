import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        String str = "";
        int max[] = new int[26];
        int min[] = new int[26];
        for (int i = 0; i < n; i++) {
            str = sc.next();
            char idh = str.charAt(0);
            index = idh - 'A';
            //dic[index]++;
            if(str.length() > max[index]){
                max[index] = str.length();
            }
            if(str.length() <= min[index] || min[index] == 0){
                min[index] = str.length();
            }
        }
        for (int i = 0; i < 26; i++) {
            if(max[i] > 0 && min[i] > 0){
                System.out.println(((char)((char)(i + 'A'))) + " " + min[i] + " " + max[i]);
            }
        }
        sc.close();
    }
}
