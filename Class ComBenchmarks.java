import java.util.Scanner;

class ComAndBench {
    int calCPU;
    int amountRAM;
    int calGPU;
    int priceCPU;
    int priceRAM;
    int priceGPU;
    double totalPrice;
    double WindStrike;
    double PastMark;
    double Soreal;
    double SiSandro;

    ComAndBench(int calCPU, int calGPU, int amountRAM, int priceCPU, int priceRAM, int priceGPU) {
        this.calCPU = calCPU;
        this.amountRAM = amountRAM;
        this.calGPU = calGPU;
        this.priceCPU = priceCPU;
        this.priceRAM = priceRAM;
        this.priceGPU = priceGPU;
    }

    void runWindStrike() {
        WindStrike = calCPU + calGPU;
        if (amountRAM <= 4) {
            WindStrike = WindStrike / 2;
        }
        if (amountRAM > 8) {
            WindStrike = WindStrike * 2;
        }
        System.out.println("WindStrike: " + ((int) WindStrike));
    }

    void runPastMark() {
        PastMark = Math.max(calCPU, calGPU);
        if (PastMark <= 200) {
            PastMark = 300;
        }
        System.out.println("PastMark: " + ((int) PastMark));
    }

    void runSoreal() {
        Soreal = calGPU + (calCPU / 2);
        if (PastMark < 300) {
            Soreal = Soreal / 2;
        }
        System.out.println("Soreal: " + ((int) Soreal));
    }

    boolean runSiSandro() {
        if (amountRAM < 4) {
            System.out.println("SiSandro Failed");
            return false;
        }
        SiSandro = (amountRAM * 100) + calCPU;
        return true;
    }

    void runAllBenches() {
        boolean checkSisandro = runSiSandro();
        runWindStrike();
        runPastMark();
        runSoreal();
        if (!checkSisandro) {
            System.out.println("SiSandro: Failed");
        } else {
            System.out.println("SiSandro: " + ((int) SiSandro));
        }
    }

    void reportPerfPerPrice() {
        double result = (WindStrike + PastMark + Soreal);
        totalPrice = (priceCPU + priceGPU + priceRAM);
         result = result / totalPrice;
        System.out.println("Performance per Price = " + ((int) result));
    }
}

public class ComBenchmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cpuPow = sc.nextInt();
        int gpuPow = sc.nextInt();
        int ramAmt = sc.nextInt();
        int cpuPrc = sc.nextInt();
        int gpuPrc = sc.nextInt();
        int ramPrc = sc.nextInt();
        ComAndBench comb = new ComAndBench(cpuPow, gpuPow, ramAmt, cpuPrc, gpuPrc, ramPrc);
        comb.runAllBenches();
        comb.reportPerfPerPrice();
        sc.close();
    }
}
