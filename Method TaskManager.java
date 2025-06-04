import java.util.Scanner;

public class TaskManager {
    static void reportLoad(int calMachine, int amountRAM, int calUse, int amountUseRAM){
        double CPU = 0;
        double CPU2 = 0;
        double result = 0;
        double RAM = 0;
        double RAM2 = 0;
        double resultR = 0;
        CPU = (calMachine * 100) / 100;
        CPU2 = (calUse * 100) / 100;
        result = ((CPU2 / CPU)) * 100.0;

        RAM = (amountUseRAM * 100) / 100;
        RAM2 = (amountRAM * 100) / 100;
        resultR = (RAM / RAM2) * 100;
        System.out.println("CPU: " + ((int)CPU2) + "/" + ((int)CPU) + " (" + ((int)result) + "%)");
        System.out.println("RAM: " + ((int)RAM) + "/" + ((int)RAM2) + " (" + ((int)resultR) + "%)");
        if(result >= 80){
            System.out.println("Limited CPU power");
        }
        if(resultR >= 80){
            System.out.println("Limited RAM availability");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calMachine = sc.nextInt();
        int amountRAM = sc.nextInt();
        int calUse = sc.nextInt();
        int amountUseRAM = sc.nextInt();
        reportLoad(calMachine, amountRAM, calUse, amountUseRAM);
        sc.close();
    }
}
