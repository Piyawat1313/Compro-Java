import java.util.Scanner;
class Dept{
    int minitryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int totalCompute;
    int salary;
    int elec;
    int eduCost;
    int totalExpen;
    Dept(int countPerson, int countStudent){
        this.totalCompute = computeIncome(countPerson, countStudent);
        this.totalExpen = computeExpense(countPerson, countStudent);
        System.out.println("total income = " + totalExpen);
        System.out.println("total expense = " + totalExpen);
        System.out.println("income - expense = " + (totalCompute - totalExpen));
    }
    int computeIncome(int countPerson, int countStudent){
        this.minitryBudget = (countPerson * 500000) + (countStudent * 3000);
        this.eduFee = (countStudent * 5000);
        this.serviceFee = 300000;
        this.donation = 100000;
        return (this.minitryBudget + this.eduFee + this.serviceFee + this.donation);
    }
    int computeExpense(int countPerson, int countStudent){
        this.salary = (countPerson * 600000);
        this.elec = (countPerson + countStudent) * 2000;
        this.eduCost = (countStudent * 4000);
        return (this.salary + this.elec + this.eduCost);
    
    }
    void printReport(){
        System.out.println("ministry budget = " + this.minitryBudget);
        System.out.println("education fee = " + this.eduFee);
        System.out.println("service fee = " + this.serviceFee);
        System.out.println("donation = " + this.donation);
        System.out.println("salary = " + this.salary);
        System.out.println("electricity = " + this.elec);
        System.out.println("educational cost = " + this.eduCost);
    }
}
public class Department {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Dept dept = new Dept(n, k);
        dept.printReport();
        sc.close();
    }
}
