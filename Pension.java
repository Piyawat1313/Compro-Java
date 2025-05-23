import java.util.Scanner;

public class Pension {

    static double calculateTime(int numYear, int numMonth, int numDays) {
        double totalYear = numYear + (numMonth / 12.0) + (numDays / 360.0);
        return totalYear;
    }

    static double calculatePension(int op, double lastSalary, double avgSalary, double totalYear) {
        double bumned = 0;
        if (op == 0) {
            bumned = (lastSalary * totalYear);
            return bumned;
        } else {
            double bumNan = (avgSalary * totalYear) / 50;
            double avg = (avgSalary * 0.70);
            return Math.min(bumNan, avg);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int options = scan.nextInt();
        double lastSalary = scan.nextDouble();
        double avgSalary = scan.nextDouble();
        int numYear = scan.nextInt();
        int numMonth = scan.nextInt();
        int numDays = scan.nextInt();
        double totalYear = calculateTime(numYear, numMonth, numDays);
        String ans1 = String.format("Time: %.2f years", totalYear);
        System.out.println(ans1);
        double totalMoney = calculatePension(options, lastSalary, avgSalary, totalYear);
        String ans2 = String.format("Pension is %,.2f", totalMoney);
        System.out.print(ans2);
        if (options == 1)
            System.out.print(" for each month.");
        System.out.println();
        scan.close();
    }
}
