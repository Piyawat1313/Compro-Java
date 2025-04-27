import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String str = sc.nextLine();
        int index = text.indexOf(str);
        if(index == -1){
            System.out.println("no target character found");
            sc.close();
            return;
        }
        int start = 0;
        int stop = 0;
        while (index != -1) {
            String word = text.substring(start, index);
            if(word.length() > 0){
                System.out.println(word);
                stop++;
            }
            start = index + 1;
            index = text.indexOf(str, start);
        }
        String word = text.substring(start, text.length());
        if(word.length() > 0){
            System.out.println(word);
            stop++;
        }
        if(stop == 0){
            System.out.println("no output");
        }
        sc.close();
    }
}
