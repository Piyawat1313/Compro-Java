import java.util.Scanner;

class Character {
    String say[];
    int index = 0;

    Character(String[] speak) {
        this.say = new String[speak.length];
        for (int i = 0; i < say.length; i++) {
            this.say[i] = speak[i];
        }
    }

    void speak() {
        System.out.println(this.say[index]);
        index = (index + 1) % say.length;
    }
}

public class CharVoice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        Character character[] = new Character[C];
        for (int i = 0; i < C; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] tex = new String[n];
            for (int j = 0; j < n; j++) {
                tex[j] = sc.nextLine();
            }
            character[i] = new Character(tex);
        }
        int k = sc.nextInt();
        int num = 0;
        for (int i = 0; i < k; i++) {
            num = sc.nextInt();
            character[num - 1].speak();
        }
        sc.close();
    }
}
