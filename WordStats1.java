import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dic[] = new int[26];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char ch = str.charAt(str.length() - str.length());
            int index = ch - 'A';
            //System.out.println(index);
            dic[index]++;
        }
        for (int i = 0; i < dic.length; i++) {
            if(dic[i] > 0){
                System.out.println(((char)((char)(i + 'A'))) + " " + dic[i]);
            }
        }
        sc.close();
     }
}
