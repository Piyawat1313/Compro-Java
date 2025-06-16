import java.util.ArrayList;
import java.util.Scanner;

class HumanCharacters {
    String nameHuman;
    String ageHuman;
    boolean alive;
    String ability;
    String personality;
    String background;

    HumanCharacters(String name, String age, boolean alive, String ability, String person, String background) {
        this.nameHuman = name;
        this.ageHuman = age;
        this.alive = alive;
        this.ability = ability;
        this.personality = person;
        this.background = background;
    }
}

class GodCharacters {
    String nameGod;
    String legendGod;
    String ability;
    String personGod;
    String background;

    GodCharacters(Scanner sc) {
        String tmp = sc.nextLine();
        int index = tmp.indexOf("(");   //วิธีการตัดวงเล็บออก
        this.nameGod = tmp.substring(0, index - 1); //เอาแค่ตัวหนังสือตั้งแต่เริ่มจนห่อนถึง index นั้น
        this.legendGod = tmp.substring(index + 1, tmp.length() - 1);    //ตั้งแต่ หลังวงเล็บจนสุด
        this.ability = sc.nextLine();
        this.personGod = sc.nextLine();
        this.background = sc.nextLine();
    }
}

public class RecordofRagnarok {
    private static void battleROR(HumanCharacters human, GodCharacters god, int countBattle) {
        System.out.println("<>---------- Record of Ragnarok ----------<>");
        System.out.println("<< { --------- ROUND ( " + countBattle + " ) --------- } >>");
        System.out.println("<<==== GOD ====>>");
        System.out.println("Name : " + god.nameGod);
        System.out.println("Legend : [ " + god.legendGod + " ]");
        System.out.println("- Abilities: " + god.ability);
        System.out.println("- Personality: " + god.personGod);
        System.out.println("- Background: " + god.background);
        System.out.println("VS");
        System.out.println("<<==== HUMAN ====>>");
        System.out.println("Name : " + human.nameHuman);
        System.out.print("Age : " + human.ageHuman);
        if (human.alive) {
            System.out.println(" at death");
        } else {
            System.out.println("");
        }
        System.out.println("- Abilities: " + human.ability);
        System.out.println("- Personality: " + human.personality);
        System.out.println("- Background: " + human.background);
        System.out.println("<< { --------- ROUND ( " + countBattle + " ) --------- } >>");
        System.out.println("<>---------- Record of Ragnarok ----------<>");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        sc.nextLine();
        ArrayList<HumanCharacters> human = new ArrayList<>(round);
        ArrayList<GodCharacters> god = new ArrayList<>(round);
        for (int i = 0; i < round; i++) {
            String Age = null;
            boolean Death = false;
            String tmp1[] = sc.nextLine().split("Age: ");
            String Name = tmp1[0].substring(0, tmp1[0].length() - 2);
            if (tmp1[1].indexOf(" at death") > 0) {
                Death = true;
                Age = tmp1[1].substring(0, 2);
            } else if (tmp1[1].indexOf("Unknown") >= 0) {
                Age = "Unknown";
            } else {
                Age = tmp1[1].substring(0, 2);
            }
            String Abilities = sc.nextLine();
            String Personality = sc.nextLine();
            String Background = sc.nextLine();
            human.add(new HumanCharacters(Name, Age, Death, Abilities, Personality, Background));
        }
        for (int i = 0; i < round; i++) {
            god.add(new GodCharacters(sc));
        }
        int countBattle = 1;
        for (; ;) {
            int h = sc.nextInt();
            int g = sc.nextInt();
            boolean booH = true;
            boolean booG = true;
            if(h < 0 || h >= round){
                booH = false;
            }
            if(g < 0 || g >= round){
               booG = false; 
            }
            if(booH == true && booG == true){
                battleROR(human.get(h), god.get(g), countBattle);
                countBattle++;
            }
            else{
                break;
            }
        }
    }
}
