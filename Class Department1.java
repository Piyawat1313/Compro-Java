import java.util.Scanner;

class Dept {
    int n;
    int k;
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    Dept(int n, int k){
        this.n = n;
        this.k = k;
    }
    void computeIncome(){
        this.ministryBudget = (n * 500000) + (k * 3000);
        this.eduFee = (k * 5000);
        this.serviceFee = 300000;
        this.donation = 100000;
    }
    void printReport(){
        System.out.println("ministry budget = " +  this.ministryBudget);
        System.out.println("education fee = " +  this.eduFee);
        System.out.println("service fee = " +  this.serviceFee);
        System.out.println("donation = " +  this.donation);
    }
    
}

public class Department1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();    //บุคลากร
       int k = sc.nextInt();    //นักศึกษา
        Dept D = new Dept(n, k);
        D.computeIncome();
        D.printReport();
    }
}
