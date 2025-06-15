package Compositionjava;
import java.util.Scanner;
class Content{
    String name; 
    int price;
    Content(String name, int price){
        this.name = name;
        this.price = price;
    }
    void updatePrice(int newPrice){
        if(newPrice > 0){
            this.price = newPrice;
        }
    }
    void printSummary(){
        System.out.println(this.name + " " + this.price);
    }
}
class Food{
    String name;
    Content[] contents;
    int totalPAF = 0;
    Food(String name, Content[] contents){
        this.name = name;
        this.contents = new Content[contents.length];
        this.contents = contents.clone();
    }
    void printSummary(){
        for (int i = 0; i < contents.length; i++) {
            if(contents[i] != null){
                totalPAF += contents[i].price;
            }
        }
        System.out.println(this.name + " " +  totalPAF);
    }
}
public class FoodMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcontence = sc.nextInt();
        Content c[] = new Content[numcontence];
        for (int i = 0; i < c.length; i++) {
            String name = sc.next();
            int price = sc.nextInt();
            c[i] = new Content(name, price);
        }
        int numfoods = sc.nextInt();
        Food[] f = new Food[numfoods];
        for (int i = 0; i < f.length; i++) {
            String name = sc.next();
            int numfoodcontence = sc.nextInt();
            sc.nextLine();
            Content[] fooContent = new Content[numfoodcontence];
            for (int j = 0; j < fooContent.length; j++) {
                int contentld = sc.nextInt();
                fooContent[j] = c[contentld];
            }
            f[i] = new Food(name, fooContent);
        }
        while (true) {
            int index = sc.nextInt();
            if(index == -1){
                break;
            }
            int newPrice = sc.nextInt();
            c[index].updatePrice(newPrice);
            c[index].printSummary();
        }
        for (int i = 0; i < f.length; i++) {
            f[i].printSummary();
        }
        sc.close();
    }
}
