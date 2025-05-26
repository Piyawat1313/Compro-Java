import java.util.Scanner;
class Character{
    String say[];
    int index = 0;
    Character(String[] speak){
        this.say = new String[speak.length];
        for (int i = 0; i < say.length; i++) {
            this.say[i] = speak[i];
        }
    }
    void speak(){
        System.out.println(this.say[index]);
        index = (index + 1) % say.length;
    }
}
public class CharVoice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] tex = new String[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            tex[i] = sc.nextLine();
        }
        Character character = new Character(tex);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            character.speak();
        }
        sc.close();
    }
}
