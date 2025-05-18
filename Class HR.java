import java.util.Scanner;

class Employee {
    String person;
    String id;
    int typePer;
    int compen;
    int exWork = 0; // งานบริหาร
    int opWork = 0; // ปฎิบัติการ
    int totalex = 0;
    int totalOp = 0;
    int result = 0;

    Employee(String p, String I, int t, int c) {
        this.person = p;
        this.id = I;
        this.typePer = t;
        this.compen = c;
    }

    boolean workExecutive(int countH) {
        if (countH > 0) {
            exWork += countH;
            return true;
        } else {
            System.out.println("Invalid hour for executive work");
            return false;
        }
    }

    boolean workOperation(int num) {
        if (num > 0) {
            opWork += num;
            return true;
        } else {
            System.out.println("Invalid hour for operation work");
            return false;
        }
    }

    int calPayment() {
        if(typePer == 1){    //ถ้าทำงานบริหาร จะได้ค่าจ้าง * 2
            return (exWork * compen) + (opWork * compen * 2);
        }
        else{    //ถ้าทำงานปฏิบัติจะได้ค่าจ้าง * 2
            return (exWork * compen * 2) + (opWork * compen);
        }
    }

    void printStats() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + person);
        if (typePer == 1)
            System.out.println("Position: Executive");
        if (typePer == 2)
            System.out.println("Position: Operation");
        System.out.println("Ex Hour: " + exWork);
        System.out.println("Op Hour: " + opWork);
        System.out.println("Wage: " + compen);
        System.out.println("Payment: " + calPayment());
    }
}

public class HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();
        int type = sc.nextInt();
        int wage = sc.nextInt();
        Employee employee = new Employee(name, id, type, wage);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int workType = sc.nextInt();
            int hour = sc.nextInt();
            if (workType == 1) {
                System.out.print(employee.workExecutive(hour) + " ");
                System.out.println(employee.calPayment());
            }
            if (workType == 2) {
                System.out.print(employee.workOperation(hour) + " ");
                System.out.println(employee.calPayment());
            }
        }
        employee.printStats();
        sc.close();
    }
}
