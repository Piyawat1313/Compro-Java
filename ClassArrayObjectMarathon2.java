
import java.util.Scanner;

class Runner {
    String name;
    String BIB;
    static int number = 0;
    int type;

    Runner(String name, int type) {
        this.name = name;
        this.type = type;
        Runner.number++;
        this.BIB = String.format("%c%03d", type - 1 + 'A', Runner.number);
    }
}

public class Marathon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Runner runner[] = new Runner[n];
        int[] counts = new int[n + 1];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int type = sc.nextInt();
            if (type <= 0 || type > 4) {
               
            } else {
                runner[i] = new Runner(name, type);
                counts[type]++;
            }
        }
        for (int type = 1; type <= 4; type++) {
                System.out.println(counts[type]);
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (runner[i] != null && runner[i].type == type) {
                    System.out.print(runner[i].BIB + " ");
                    found = true;
                }
            }
            if(!found){
                System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }
}
