import java.util.Scanner;

class Theater {
    boolean movie_screening;
    boolean luxury;
    int seat;
    boolean[] seats = new boolean[seat + 1];
    String title;
    int basePrice;

    Theater(boolean movie_screening, boolean luxury, int seat) {
        this.seat = seat;
        this.movie_screening = movie_screening;
        this.luxury = luxury;
    }

    void setTitle(String dummy) {
        this.title = dummy;
        if(this.title == "-1" || title == null){
            System.out.println("invalid title");
        }else{
            this.title = dummy;
        }
    }
    void setBasePrice(int ticket) {
        this.basePrice = ticket;
        if (basePrice <= 0) {
            System.out.println("invalid price");
        }else {
            this.basePrice = ticket;
        }
    }

    void printInfo() {
        if(movie_screening == true){
            System.out.println("3D");
        }
        if(movie_screening == false){
            System.out.println("No 3D");
        }
        if(luxury == true){
            System.out.println("Luxury");
        }
        if(luxury == false){
            System.out.println("Standard");
        }
        if(seat >= 0 && seat <= 300){
            System.out.println(seat);
        }
        if(title == "-1" || title == null){
            System.out.println("title is not set");
        }
        else{
            System.out.println(this.title);
        }
        if(basePrice <= 0){
            System.out.println("price is not set");
        }else{
            System.out.println(basePrice);
        }
    }
}

public class Theater1 {
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

        String dummy = scan.nextLine();// throw away a new line character
        String title = scan.nextLine();
        if (title.compareTo("-1") == 0)
            t.setTitle(null);
        else
            t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();

    }
}
