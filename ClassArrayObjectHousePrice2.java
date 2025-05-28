import java.util.Scanner;

class House {
    int landSize;
    int quality;
    int floors;
    int houseArea;
    int price = 0;

    public House(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = computePrice(landSize, quality, floors, houseArea);
    }

    int computePrice(int land, int quality, int floors, int area) {
        land = land * 10000;
        int total = 0;
        if (floors > 1) {
            total = (floors - 1) * 200000;
        }
        if (quality == 1)
            quality = 10000 * area;
        else if (quality == 2)
            quality = 8000 * area;
        else if (quality == 3)
            quality = 5000 * area;
        return land + total + quality;
    }
}

public class HousePrice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        House house[] = new House[n];
        for (int i = 0; i < n; i++) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int price = scan.nextInt();
        int area = scan.nextInt();
        boolean isNone = true;
        for (int i = 0; i < house.length; i++) {
            if(house[i].price <= price && house[i].houseArea >= area){
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " + house[i].houseArea + " " + house[i].price);
                isNone = false;
            }
        }
        if(isNone){
            System.out.println("none");
        }
        scan.close();
    }
}
