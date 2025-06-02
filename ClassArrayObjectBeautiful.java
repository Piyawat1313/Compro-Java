import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Audience {
    String say[];
    boolean disconnected;
    int N;
    int currentIndex = 0;

    Audience(String[] say) {
        this.say = say;
    }

    boolean isBeautiful() {
        if(disconnected) return false;
       
        String next = say[currentIndex];
        currentIndex = (currentIndex + 1) % say.length;
        return next.equals("beautiful");
    }
}

public class Beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String[] phrases = new String[K];
        sc.nextLine();
        for (int i = 0; i < K; ++i) {
            phrases[i] = sc.nextLine();
        }

        final int C = sc.nextInt();
        Audience[] Cs = new Audience[C + 1];
        for (int p = 1; p <= C; ++p) {
            final int N = sc.nextInt();
            String[] msg = new String[N];
            sc.nextLine();
            for (int i = 0; i < N; ++i) {
                msg[i] = sc.nextLine();
            }
            Cs[p] = new Audience(msg);
        }
        for (int i = 0; i < K; i++) {
            if(phrases[i].equals("crack")){
                ArrayList<Integer> index = new ArrayList<>();
                for (int j = 1; j <= C; j++) {
                    if(!Cs[j].disconnected && !Cs[j].isBeautiful()){
                        Cs[j].disconnected = true;
                        index.add(j);
                    }
                }
                if(index.isEmpty()){
                    System.out.println("x");
                }
                else{
                    Collections.sort(index);
                    for (int j = 0; j < index.size(); j++) {
                        System.out.print(index.get(j) + " ");
                    }
                    System.out.println();
                }
            }
            else{
                for (int j = 1; j <= C; j++) {
                    if(!Cs[j].disconnected){
                        Cs[j].isBeautiful();
                    }
                }
            }
        }
        sc.close();
    }
}
