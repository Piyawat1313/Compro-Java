import java.util.ArrayList;
import java.util.Scanner;

class Kaiju {
    private String nameKaiju;
    private String levelpower;
    private int tallKaiju;
    private int wageKaiju;
    private ArrayList<String> ability = new ArrayList<>();
    private String detail;

    Kaiju() {

    }

    Kaiju(String name) {
        this.nameKaiju = name;
    }

    Kaiju(String name, String power, int tall, int wage, String[] A, String De) {
        this.nameKaiju = name;
        this.levelpower = power;
        this.tallKaiju = tall;
        this.wageKaiju = wage;
        for (int i = 0; i < A.length; i++) {
            String space = A[i].trim();
            if(!space.isEmpty()){
                this.ability.add(space);
            }
        }
        this.detail = De;
    }

    void PrintDetail() {
        if (this.nameKaiju == null || this.nameKaiju.isEmpty()){
            System.out.println("Kaiju : Unknown");
        }
        else{
            System.out.println("Kaiju : " + this.nameKaiju);
        }

        if (this.levelpower == null || this.levelpower.isEmpty()){
            System.out.println("< Category: Category Unknown >");
        }
        else{
            System.out.println("< Category: Category " + this.levelpower + " >");
        }

        if (this.tallKaiju == 0){
            System.out.println("Height: Unknown");
        }
        else{
            double meters = (this.tallKaiju / 3.2808);
                System.out.printf("Height: %d feet (%.14f meters)\n", this.tallKaiju, meters);
            
        }

        if (this.wageKaiju == 0){
            System.out.println("Weight: Unknown");
        }
        else{
            System.out.println("Weight: " + this.wageKaiju + " tons");
        }
        if (this.ability == null || this.ability.isEmpty()){
            System.out.println("Power: Unknown");
        }else{
            System.out.println("Power: [" + this.ability.size() + "] :");
            for (String ab : this.ability) {
                System.out.println(ab);
            }
        }
        if (this.detail == null || this.detail.isEmpty()){
            System.out.print("Description: Unknown");
            System.out.println();
        }else{
            System.out.print("Description: " + this.detail);
            System.out.println();
        }
    }

}

class Jaeger {
    private String matchine;
    private String Ycountry;
    private int modelID;
    private double tallmatchine;
    private ArrayList<String> driver = new ArrayList<>();
    private ArrayList<String> weapon = new ArrayList<>();

    Jaeger() {
        
    }

    Jaeger(String name) {
        this.matchine = name;
    }

    Jaeger(String name, String country, int id, double tall, String[] driver, String[] wea) {
        this.matchine = name;
        this.Ycountry = country;
        this.modelID = id;
        this.tallmatchine = tall;
        for (int i = 0; i < driver.length; i++) {
            String dd = driver[i].trim();
            if(!dd.isEmpty()){
                this.driver.add(dd);
            }
        }
        for (int i = 0; i < wea.length; i++) {
            String ww = wea[i].trim();
            if(!ww.isEmpty()){
                this.weapon.add(ww);
            }
        }
    }

    void PrintDetail() {
        if (this.matchine == null || this.matchine.isEmpty()){
            System.out.println("Jaegers : Unknown");
        }
        else{
            System.out.println("Jaegers : " + this.matchine);
        }

        if (this.Ycountry == null || this.Ycountry.isEmpty()){
            System.out.println("< Country of Origin: Unknown >");
        }
        else{
            System.out.println("< Country of Origin: " + this.Ycountry + " >");
        }

        if (this.modelID == 0){
            System.out.println("< Mark: Unknown >");
        }
        else{
            System.out.println("< Mark: Mark-" + this.modelID + " >");
        }

        if (this.tallmatchine == 0){
            System.out.println("Height: Unknown");
        }else{
                System.out.printf("Height: %.1f meters\n", this.tallmatchine);
        }

        if (this.driver == null || this.driver.isEmpty()){
            System.out.println("Pilots: Unknown");
        }else {
            System.out.println("Pilots: [" + this.driver.size() + "] :");
            for (String d : driver) {
                System.out.println(d);
            }
        }
        if (this.weapon == null || this.weapon.isEmpty()){
            System.out.println("Weapons: Unknown");
        }else {
            System.out.println("Weapons: [" + this.weapon.size() + "] :");
            for (int i = 0; i < weapon.size(); i++) {
                System.out.println(weapon.get(i));
            }
        }
    }
}

public class PacificRim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;

        int typeK = sc.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = sc.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = sc.next();
            String Category = sc.next();
            int Height = sc.nextInt();
            int Weight = sc.nextInt();
            String strp = sc.nextLine();
            strp = sc.nextLine();
            String Power[] = strp.split(",");
            String Description = sc.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }

        int typeJ = sc.nextInt();

        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = sc.nextLine();
            String name = sc.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = sc.nextLine();
            String name = sc.nextLine();
            String CoO = sc.nextLine();
            int mark = sc.nextInt();
            double h = sc.nextDouble();
            temp = sc.nextLine();
            String str = sc.nextLine();
            String strp[] = str.split(",");
            String str2 = sc.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }

        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");
        sc.close();
    }
}

