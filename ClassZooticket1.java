import java.util.ArrayList;
import java.util.Scanner;

class ZooTicket {
    String name;
    ArrayList<String> service = new ArrayList<>();
    int totalPrice;

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

public class ZooTicket1 {
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
        sc.close();
    }
}
