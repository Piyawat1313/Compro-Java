import java.util.Scanner;

class Dept {
    int n;
    int k;
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int totalIncome = 0;
    int salary;
    int elec;
    int eduCost;
    int totalExpen;
    int results;
    Dept(int n, int k){
        this.n = n;
        this.k = k;
    }
    int computeIncome(){   //รายได้
        this.ministryBudget = (n * 500000) + (k * 3000);
        this.eduFee = (k * 5000);
        this.serviceFee = 300000;
        this.donation = 100000;
       return this.totalIncome = this.eduFee + this.serviceFee + this.donation + this.ministryBudget;
    }
    int computeExpense(int n, int k){   //รายจ่าย
        this.salary = n * 600000;
        this.elec = (n + k) * 2000;
        this.eduCost = k * 4000;
        return this.totalExpen = this.salary + this.elec + this.eduCost;
    }
    void printReport(){
        System.out.println("total income = " + this.totalIncome);
        System.out.println("total expense = " + this.totalExpen);
        this.results = this.totalIncome - this.totalExpen;
        System.out.println("income - expense = " + this.results);
        System.out.println("ministry budget = " +  this.ministryBudget);
        System.out.println("education fee = " +  this.eduFee);
        System.out.println("service fee = " +  this.serviceFee);
        System.out.println("donation = " +  this.donation);
        System.out.println("salary = " + this.salary);
        System.out.println("electricity = " + this.elec);
        System.out.println("educational cost = " + this.eduCost);
    }
    
}

public class Department2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();    //บุคลากร
       int k = sc.nextInt();    //นักศึกษา
        Dept D = new Dept(n, k);
        D.computeExpense(n, k);
        D.computeIncome();
        D.printReport();
        sc.close();
    }
}
