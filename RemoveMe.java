import java.util.Scanner;

public class RemoveMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int index = 0;
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            String s2 = sc.next();
            sc.nextLine();
            if (number == 1) {
                index = s.indexOf(s2);
            }
            else{
                index = s.lastIndexOf(s2);
            }
            if(index != -1){
               String s4 = s.substring(0, index);
               String s5 = s.substring(index + s2.length());
                s = s4 + s5;
            }
            System.out.println(s);
        }

        sc.close();
    }
}

