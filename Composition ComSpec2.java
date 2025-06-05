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
class MainBoard{
    String modleM;
    int typeSocket;
    int typeRAM;
    boolean valid;
    MainBoard(String modleM, int typeSocket, int typeRAM){
        this.modleM = modleM;
        this.typeSocket = typeSocket;
        this.typeRAM = typeRAM;
        valid = isValidSpec(modleM, typeSocket, typeRAM);
    }
    boolean isValidSpec(String modleM, int typeSocket, int typeRAM){
        if(modleM != null && modleM.length() != 0 && typeSocket > 0 && typeRAM > 0 && typeRAM <= 10){
            return true;
        }
        return false;
    }
    void printInfo(){
        System.out.println(this.modleM);
        System.out.println(typeSocket);
        System.out.println(typeRAM);
        System.out.println(valid);
    }
}
class Computer{
    CPU cpu;
    MainBoard mainBoard;
    boolean valid;
    Computer(CPU cpu, MainBoard mainBoard){
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.valid = isValidCom(mainBoard, cpu);
    }
    boolean isValidCom(MainBoard mainBoard, CPU cpu){
        if(cpu.typeSocket == mainBoard.typeSocket && cpu.typeRAM == mainBoard.typeRAM){
            return true;
        }
        return false;
    }
    void printInfo(){
        if(valid && cpu.valid && mainBoard.valid){
            System.out.println(cpu.model);
            System.out.println(cpu.signalClock);
            System.out.println(mainBoard.modleM);
            System.out.println(mainBoard.typeSocket);
            System.out.println(mainBoard.typeRAM);
        }
        else{
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mainBoard.printInfo();
        }
    }
}
public class ComSpec2 {
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
        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        memtype = sc.nextInt();
        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        MainBoard mainBoard = new MainBoard(model, socket, memtype);
        Computer com = new Computer(cpu, mainBoard);
        com.printInfo();
        sc.close();
    }
}
