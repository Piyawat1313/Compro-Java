package ArrayObject;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    public static int count = 0;
    public final int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if (minimum >= 0) {
            this.minimum = minimum;
        }
        if (quantity >= 0) {
            this.quantity = quantity;
        }
        count++;
        this.id = count;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int N) {
        if (N >= this.minimum) {
            this.quantity = N;
            return true;
        }
        this.quantity = 0;
        return false;
    }

    public boolean isAvailable() {
        if (quantity > minimum) {
            return true;
        }
        return false;
    }

    public void printInfo(boolean check) {
        if (check == true) {
            System.out.println(this.id + " " + this.name);
        } else {
            System.out.println(
                    this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + isAvailable());
        }
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pro = new ArrayList<>(10);
        boolean check = false;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product p = new Product(name, minimum, quantity);
                pro.add(p);
                System.out.print("add new product: ");
                check = false;
                p.printInfo(check);
            } else if (action == 2) {
                boolean found = false;
                int id = sc.nextInt();
                for (int i = 0; i < pro.size(); i++) { // loop หา id ในอาเรย์ลิสทั้งหมด
                    Product pp = pro.get(i);
                    if (id == pp.id) {
                        System.out.print("remove product: ");
                        pro.remove(pp);
                        check = true;
                        pp.printInfo(check);
                        found = true; // เช็คว่าเจอแล้ว
                    }
                }
                if (!found) { // ไม่เจอ
                    System.out.println("remove product: not found");
                }
            }

            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                Product m = pro.get(n - 1);
                if (m.id != id) {
                    System.out.println("decrease quantity: not found");
                } else if (n <= 0) {
                    System.out.println("decrease quantity: error n");
                } else {
                    pro.get(n - 1).setQuantity(n);
                    pro.get(n - 1).getQuantity();
                    System.out.print("decrease quantity: ");
                    check = false;
                    pro.get(n - 1).printInfo(check);
                }
            }
        }
        for (int i = 0; i < pro.size(); i++) {
            pro.get(i).printInfo(check);
        }
        sc.close();
    }
}
