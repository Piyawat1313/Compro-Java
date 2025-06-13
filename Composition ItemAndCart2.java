package Compositionjava;

import java.util.Scanner;
class Cart{
    int sizebox;
    Item2 item2;
    int trolley;
    Cart(int sizebox , Item2 item2){
        this.sizebox = sizebox;
        this.item2 = item2;
    }
    public boolean adjustQuan(int add){
        if(add > 0){
            if(item2.cutStock(add)){
                this.trolley += add;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(Math.abs(add) > this.trolley){
                return false;
            }
            else{
                this.trolley -= Math.abs(add);
                item2.amount += Math.abs(add);
                return true;
            }
        }
    }
    public void printStats(){
        int totalsum = 0;
        int totalP = (this.trolley * item2.cost);  //ค่าส่งรวม
        totalsum += item2.price * trolley;        //ราคารวมสินค้า
        int totalExpen = (item2.price * trolley + totalP);    //ค่าใช้จ่านทั้งหมด
        System.out.print(trolley + " " + totalsum + " " +  totalP +  " " + totalExpen + " ");
        int totalvolume = (this.trolley * item2.volume);    //หาปริมาณการใช้กล่อง
        if(this.trolley == 0){
            System.out.println("0");
        }
        else if(totalvolume <= this.sizebox){
            System.out.println("1");
        }
        else{
            System.out.println("2+");
        }
    }
}
class Item2{
    String name;
    String id;
    int price;
    int cost;
    int volume;
    int amount;
    boolean isvalid;
    Item2(String name, String id, int price, int cost, int volume, int amount){
        this.name = name;
        this.id = id;
        this.price = price;
        this.cost = cost;
        this.volume = volume;
        this.amount = amount;
        if(basicCheck(name, id, price, cost, volume)){
            this.isvalid = true;
        }
        else{
            this.isvalid = false;
        }
    }
    public boolean basicCheck(String name, String id, int price, int cost, int volume){
        if(name != null && name.length() >= 3 && id != null && id.length() >= 3 && price > 0 && volume > 0 && cost >= 0){
            return true;
        }
        return false;
    }
    public boolean cutStock(int N){
        if(N > amount){
            return false;
        }
        else{
            amount -= N;
            return true;
        }
    }
   public void printInfo(){
        System.out.println(this.name + " " + this.id + " " + this.price);
        System.out.println(this.cost + " " + this.volume + " " + this.amount + " " + this.isvalid);
    }
}
public class ItemAndCart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();
        int price = sc.nextInt();
        int shipping = sc.nextInt();
        int volume = sc.nextInt();
        int quan = sc.nextInt();
        Item2 item2 = new Item2(name, id, price, shipping, volume, quan);
        int cap = sc.nextInt();
        Cart cart = new Cart(cap, item2);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int q = sc.nextInt();
            System.out.println(cart.adjustQuan(q));
            cart.printStats();
        }
        sc.close();
    }
}
