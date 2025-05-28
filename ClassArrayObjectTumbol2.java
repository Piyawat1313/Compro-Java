import java.util.Scanner;

class Tumbol {
    String Name;
    int loRainbow;
    int wang;
    int countPer;
    int availBudget;

    Tumbol(String name, int R, int w, int person) {
        this.Name = name;
        this.loRainbow = R;
        this.wang = w;
        this.countPer = person;
        this.availBudget = (countPer * 5000);
    }

    int allocateBudget(int[] budget) {
        boolean check = false;
        int current = this.availBudget;
        for (int i = 0; i < budget.length; i++) {
            if(availBudget > budget[i]){
                System.out.print((i + 1) + " ");
                availBudget -= budget[i];
                check = true;
            }
        }
        if(!check){
            System.out.println("none");
        }
        else{
            System.out.println();
        }
        return current - availBudget;
    }
}

public class Tumbol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Tumbol tumbol[] = new Tumbol[k];
        for (int i = 0; i < k; i++) {
            String name = sc.next();
            int Location1 = sc.nextInt();
            int Location2 = sc.nextInt();
            int countPerson = sc.nextInt();
            tumbol[i] = new Tumbol(name, Location1, Location2, countPerson);
        }
        int total = 0;
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int budget[] = new int[n];
            for (int j = 0; j < n; j++) {
                budget[j] = sc.nextInt();
            }
            total += tumbol[i].allocateBudget(budget);
        }
        System.out.println(total);
        sc.close();
    }
}
