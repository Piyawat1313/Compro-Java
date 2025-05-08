import java.util.Scanner;
public class PrayukQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dic[] = new int[26];
        int num[] = new int[10];
        int small[] = new int[26];
        String tex = "";
        for (int i = 0; i < n; i++) {
            tex = sc.next();
            sc.nextLine();
            for (int j = 0; j < tex.length(); j++) {
                char ch = tex.charAt(j);
                if(Character.isDigit(ch)){
                    int number = (ch - 48);
                    num[number]++;
                    //System.out.println("number: " + ch);
                   
                }
                if(Character.isUpperCase(ch)){
                    int idx = ch - 'A';
                    dic[idx]++;
                }
                if(Character.isLowerCase(ch)){
                    int idx = ch - 'a';
                    small[idx]++;
                }
                
            }
        }
        System.out.println("UPPER");
        for (int i = 0; i < dic.length; i++) {
            if(dic[i] > 0){
                System.out.println(dic[i] + " " + ((char)((char)(i + 'A'))));
            }
        }
        System.out.println("NUMBER");
        for (int i = 0; i < num.length; i++) {
            if(num[i] > 0){
                System.out.print(num[i] + " ");
            }
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("LOWER");
        for (int i = 0; i < small.length; i++) {
            if(small[i] > 0){
                System.out.println(small[i] + " " + ((char)((char)(i + 'a'))));
            }
        }
        sc.close();

    }
}
