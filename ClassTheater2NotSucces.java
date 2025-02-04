import java.util.Scanner;

class Theater {
    boolean threeD;
    boolean luxury;
    int countseat;
    boolean[] seats = new boolean[countseat + 1];
    int numSeats;
    String title;
    int basePrice = 0;

    Theater(boolean threeD, boolean luxury, int numSeats) {
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;

    }

    void setTitle(String dummy) {
        this.title = dummy;
        if (this.title == null || title == "-1" || this.title.isEmpty()) {
            System.out.println("invalid title");
        } else {
            this.title = dummy;
        }

    }

    void setBasePrice(int basePrice) {
        if (basePrice <= 0) {
            System.out.println("invalid price");
        }
        this.basePrice = basePrice;
    }

    int reserveOne(int seatNumber) {
        if (seatNumber <= 0 || this.seats.length <= seatNumber) {
            //System.out.println("sorry");
            return -1;
        }
        if (this.seats[seatNumber]) {
            System.out.println("sorry");
            return -1;
        }
        this.seats[seatNumber] = true;
        return this.basePrice;
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        int start = seatNumber;
        int stop = seatNumber + numSeats - 1;
        if (start <= 0 || this.seats.length <= start) {
            System.out.println("sorry");
            return -1;
        }
        if (stop <= 0 || this.seats.length <= stop) {
            //System.out.println("sorry");
            return -1;
        }
        for (int i = start; i < stop; i++) {
            if (this.seats[i]) {
                //System.out.println("sorry");
                return -1;
            }
        }
        for (int i = start; i < stop; i++) {
            this.seats[i] = true;
        }
        return this.basePrice * numSeats;
    }

    void printInfo() {
        if (this.threeD == true) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }
        if (this.luxury == true) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }
        System.out.println(this.numSeats);
        if (this.title == "-1" || this.title == null || this.title.isEmpty()) {
            System.out.println("title is not set");
        } else {
            System.out.println(this.title);
        }
        if (this.basePrice <= 0) {
            System.out.println("price is not set");
        } else {
            System.out.println(this.basePrice);
        }
        if()
    }
}

public class Theater2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
        }

        t.printInfo();
    }
}
