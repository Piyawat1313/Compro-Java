import java.util.Scanner;

class Wardrobe{
    String name;
    String[] brand = new String[20];
    int [] countCloth = new int[20];
    int countN = 0;
    public Wardrobe(String Name){
        this.name = Name;
        System.out.println(this.name + " " + "is created");
    }
    void addProduct(String brandType, int k){
        this.brand[this.countN] = brandType;    //วิะีการแอดค่าลงในอาเรย์ 
        this.countCloth[this.countN] = k;
        this.countN++;  //โดยให้ตัวแปรนับขยับเพิ่มไปเรื่อยๆ
    }
    void summary(){
        System.out.println("Name: " + this.name);
        for(int i = 0; i < countN; i++){    //แอดค่าเสด ปริ้นค่าในอาเรย์โดยใช้Loop เพื่อที่ได้ค่าที่แอดออกมา loop จะวนเท่ากับ จำนวนที่เราแอดค่าลงไป
            System.out.println(this.brand[i] + " " + this.countCloth[i]);
        }
    }
    int computeValue(){
       int Price = 0;   //ใช้ตัวนี้เก็บราคาของแต่ละสินค้าไว้
        int total = 0;
        for(int i = 0; i < countN; i++){    //loop นี้ใช้เพื่อหาสิ้นค้าที่ตรงกับผู้ใช้เลือก
            if(brand[i].contains("shirt")) Price = 1200;
           else if(brand[i].contains("pants")) Price = 900;
            else if(brand[i].contains("trouser")) Price = 1500;
            else Price = 500;
             total += Price * countCloth[i];    //เอาราคาที่ตรงกับเงื่อนไขมาคูณกับจำนวนที่ลูกค้าสั่ง และบวกราคาของทั้งหมด
        }
        return total;   //คืนค่าราคาทั้งหมด
    }
}
public class ClothingShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        Wardrobe W = new Wardrobe(Name);
        while (true) {
            int q = sc.nextInt();
            if(q == 0){
                break;
            }
            else if(q == 1){
                String brandType = sc.next(); 
                int k = sc.nextInt();
                W.addProduct(brandType, k);
            }
            else if(q == 2){
                W.summary();
            }
            else if(q == 3){
                System.out.println(W.computeValue());
            }
        }
        sc.close();
    }
}
