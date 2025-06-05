import java.util.Scanner;
class CPU{
    String model;
    int signalClock;
    int typeSocket;
    int typeRAM;
    boolean valid;
    CPU(String model, int signalClock, int typeSocket, int typeRAM){
        this.model = model;
        this.signalClock = signalClock;
        this.typeSocket = typeSocket;
        this.typeRAM = typeRAM;
        this.valid = isValidSpec(model, signalClock, typeSocket, typeRAM);
    }
    boolean isValidSpec(String model, int signalClock, int typeSocket, int typeRAM){
        if(model != null && model.length() != 0 && signalClock > 0 && typeSocket > 0 && typeRAM > 0 && typeRAM <= 10){
            return true;
        }
        return false;
    }
    void printInfo(){
        System.out.println(this.model);
        System.out.println(this.signalClock);
        System.out.println(typeSocket);
        System.out.println(typeRAM);
        System.out.println(valid);
    }
}
public class ComSpec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clock = sc.nextInt();
        int socket = sc.nextInt();
        int memtype = sc.nextInt();
        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        CPU cpu = new CPU(model, clock, socket, memtype);
        cpu.printInfo();
        sc.close();
    }
}
