import java.util.Scanner;

class Theater {
    boolean is3D_movie;
    boolean isLuxuarly;
    int countseat;
    String title;
    int basePrice;
    boolean seat[];

    Theater(boolean threeD, boolean L, int countseat) {
        this.is3D_movie = threeD;
        this.isLuxuarly = L;
        this.countseat = countseat;
        this.seat = new boolean[this.countseat + 1];
    }

    void setTitle(String movie) {
        if (movie == null || movie.length() == 0) {
            System.out.println("invalid title");
        } else {
            this.title = movie;
        }
    }

    void setBasePrice(int LessPrice) {
        if (LessPrice <= 0) {
            System.out.println("invalid price");
        }
        this.basePrice = LessPrice;
    }

    int reserveOne(int seatNumber) {
        if (seatNumber <= 0 || seatNumber > countseat || seat[seatNumber - 1]) {        //เช็คว่าเกินขอบเขต
            System.out.println("sorry");
            return -1;
        }

        seat[seatNumber - 1] = true;    //ที่นั่งมีการจองแล้ว
        return basePrice;
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        if (numSeats <= 0 || seatNumber <= 0 || numSeats - 1 > countseat || seatNumber - 1 > countseat || numSeats + seatNumber - 1 > countseat) {        //ถ้าเกินขอบเขต
            System.out.println("sorry");
            return -1;
        }
        for (int i = 0; i < numSeats; i++) {
            if (seat[seatNumber - 1 + i]) {     //ถ้าที่นั่งถัดไปมีคนจอง
                System.out.println("sorry");
                return -1;
            }
        }

        for (int i = 0; i < numSeats; i++) {    //จองได้
            seat[seatNumber - 1 + i] = true;
        }
        return basePrice * numSeats;
    }

    void printInfo() {
        if (this.is3D_movie) {
            System.out.println("3D");
        }
        if (!this.is3D_movie) {
            System.out.println("No 3D");
        }
        if (this.isLuxuarly) {
            System.out.println("Luxury");
        }
        if (!this.isLuxuarly) {
            System.out.println("Standard");
        }
        System.out.println(countseat);
        if (title == null) {
            System.out.println("title is not set");
        } else {
            System.out.println(title);
        }

        if (basePrice <= 0) {
            System.out.println("price is not set");
        } else {
            System.out.println(basePrice);
        }
    }
}

public class Theater1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeD1 = sc.nextInt();
        int luxury1 = sc.nextInt();
        int numSeats = sc.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = sc.nextLine();
        String title = sc.nextLine();
        if (title.compareTo("-1") == 0)
            t.setTitle(null);
        else
            t.setTitle(title);

        int basePrice = sc.nextInt();
        t.setBasePrice(basePrice);
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = sc.nextInt();
            int seatNumber = sc.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
        }
        t.printInfo();
        sc.close();
    }
}
