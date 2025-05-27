import java.util.Scanner;
class Tumbol{
    String Name;
    int loRainbow;
    int wang;
    int countPer;
    int availBudget;
    Tumbol(String name, int R, int w, int person){
        this.Name = name;
        this.loRainbow = R;
        this.wang = w;
        this.countPer = person;
        this.availBudget = (countPer * 5000);
    }
    void allocateBudget(int[] budget){
        boolean check = false;
        for (int i = 0; i < budget.length; i++) {
            if(availBudget > budget[i]){
                System.out.print((i + 1) + " ");
                check = true;
                availBudget -= budget[i];
            }
            
        }
        if(!check){
            System.out.println("none");
        }
    }
}
public class Tumbol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int Location1 = sc.nextInt();
        int Location2 = sc.nextInt();
        int countPerson = sc.nextInt();
       Tumbol tumbol = new Tumbol(name, Location1, Location2, countPerson);
       int n = sc.nextInt();
       int budget[] = new int[n];
       for (int i = 0; i < n; i++) {
            budget[i] = sc.nextInt();
        }
        tumbol.allocateBudget(budget);
        sc.close();
    }
}
