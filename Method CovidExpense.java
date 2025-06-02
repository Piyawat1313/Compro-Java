import java.util.Scanner;

public class CovidExpense {
    static int[] calCovidExpense(int[] rtpcr, int[] med, int[] inpat, int[] breath){
        int[] arr = new int[5];
        for (int i = 0; i < rtpcr.length; i++) {
            if(rtpcr[i] == 1){
                arr[0] += 1500;
            }
            if(med[i] == 0){
               arr[1] += 80;
            }
            if(med[i] == 1){
               arr[1] += 130;
            }
            if(inpat[i] == 1){
                arr[2] += 800;
            }
            if(breath[i] == 1){
                arr[3] += 2000;   
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] rtpcr = new int[N];
        int[] med = new int[N];
        int[] inpat = new int[N];
        int[] breath = new int[N];
        int[] arr = new int[5];
        for (int i = 0; i < N; i++) {
            rtpcr[i] = sc.nextInt();
            med[i] = sc.nextInt();
            inpat[i] = sc.nextInt();
            breath[i] = sc.nextInt();
        }
        arr = calCovidExpense(rtpcr, med, inpat, breath);
        System.out.println("RT-PCR cost = " + arr[0]);
        System.out.println("Medicine cost = " + arr[1]);
        System.out.println("Inpatient cost = " + arr[2]);
        System.out.println("Breath-aid equipment cost = " + arr[3]);
        sc.close();
    }
}
