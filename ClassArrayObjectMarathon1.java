import java.util.Scanner;
class Runner{
    String name;
    String ID;
    static int number = 0;
    Runner(String Name, int type){
        this.name = Name; 
        if(type == 1){
            this.ID = "A";
        }
       else if(type == 2){
            ID = "B";
        }
        else if(type == 3){
            ID = "C";
        }
        else if(type == 4){
            ID = "D";
        }
    }
    void printInfo(){
        number++;
       System.out.println(ID + String.format("%03d", number) + " " + this.name);
    }
}
public class Marathon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Runner runner[] = new Runner[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int type = sc.nextInt();
            if(type <= 0 || type > 4){
                System.out.println("INVALID");
            }
            else{
                runner[i] = new Runner(name, type);
                runner[i].printInfo();
            }
        }
        sc.close();
    }
}
