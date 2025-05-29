import java.util.ArrayList;
import java.util.Scanner;

class ZooTicket {
    String name;
    ArrayList<String> service = new ArrayList<>();
    int totalPrice;
    boolean use = false;
    int count = 0;
    boolean useSeal = false;
    int countseal = 0;
    boolean usetiger = false;
    int countTiger = 0;
    ZooTicket(String name) {
        this.name = name;
        this.totalPrice = 100;
    }

    void bookRide() {
        service.add("Ride");
        totalPrice += 40;
    }

    void bookSealShow() {
        service.add("Seal");
        totalPrice += 50;
    }

    void bookTigerShow() {
        service.add("Tiger");
        totalPrice += 65;
    }
    boolean useRide(){
       
        for (int i = 0; i < service.size(); i++) {
            if(service.get(i).contains("Ride")){
                use = true;
                count++;
            }
        }
        if(use && count == 1){
            System.out.println("okay");
            return true;
        }
            System.out.println("no");
            return false;
    }
    boolean enterSealShow(){
        for (int i = 0; i < service.size(); i++) {
            if(service.get(i).contains("Seal")){
                useSeal = true;
                countseal++;
            }
        }
        if(useSeal && countseal == 1){
            System.out.println("okay");
            return true;
        }
            System.out.println("no");
            return false;
    }
    boolean enterTigerShow(){
        for (int i = 0; i < service.size(); i++) {
            if(service.get(i).contains("Tiger")){
                usetiger = true;
                countTiger++;
            }
        }
        if(usetiger && countTiger == 1){
            System.out.println("okay");
            return true;
        }
        System.out.println("no");
        return false;
    }
    void summarize() {
        System.out.println(this.name);
        for (int i = 0; i < service.size(); i++) {
            if (service.get(i).contains("Ride")) {
                System.out.println(service.get(i));
            }
        }
        for (int i = 0; i < service.size(); i++) {
            if (service.get(i).contains("Seal")) {
                System.out.println(service.get(i));
            }
        }
        for (int i = 0; i < service.size(); i++) {
            if (service.get(i).contains("Tiger")) {
                System.out.println(service.get(i));
            }
        }
        System.out.println(totalPrice);
    }
}

public class ZooTicket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        ZooTicket ticket = new ZooTicket(name);
        while (true) {
            int service = sc.nextInt();
            if (service == 0) {
                break;
            } else if (service == 1) {
                ticket.bookRide();
            } else if (service == 2) {
                ticket.bookSealShow();
            } else if (service == 3) {
                ticket.bookTigerShow();
            }
        }
        ticket.summarize();
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int num = sc.nextInt();
            if(num == 1){
                System.out.println(ticket.useRide());
            }
            else if(num == 2){
                 System.out.println(ticket.enterSealShow());
            }
            else if(num == 3){
                System.out.println(ticket.enterTigerShow());
            }
        }
        sc.close();
    }
}
