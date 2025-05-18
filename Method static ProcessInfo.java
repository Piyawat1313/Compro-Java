import java.util.Scanner;

public class ProcessInfo {
   static int count = 0;
    static boolean listProcesses(String[] name, int[] RAM, int haveRAM) {
        for (int i = 0; i < RAM.length; i++) {
            if(RAM[i] >= 10){
                System.out.println(name[i] + "* " + RAM[i]);
            }
            else{
                System.out.println(name[i] + " " + RAM[i]);
            }
            count += RAM[i];
        }
        System.out.println("RAM used = " + count + " out of " + haveRAM);
        if(count > haveRAM){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] names = new String[N];
        int[] ramUses = new int[N];
        for (int i = 0; i < N; i++) {
            names[i] = sc.next();
            ramUses[i] = sc.nextInt();    
        }
        int ram = sc.nextInt();
        boolean check = listProcesses(names, ramUses, ram);
       
        if(check){
            System.out.println("Sufficient RAM");
        }
        if(!check){
            System.out.println("Not enough RAM");
        }
    }
}
