import java.util.Scanner;

class Food {
    String foodName;
    String content1;
    int  w1;
    int sum = 0;
     public Food(String foodName, String content1, int w1){
        this.foodName = foodName;
        this.content1 = content1;
        this.w1 = w1;
    }
    public void addContent(String content1, int add){
           this.w1 += add;
           this.content1 += " " + content1;
    }
    public void printInfo(){
        System.out.println(this.foodName);
        System.out.println(this.w1);
        System.out.println(this.content1);
    }
}

public class Foodcontence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();

        Food F = new Food(foodName, content1, w1);
        while (true) {
            int q = scan.nextInt();
            if(q == 0){
                break;
            }
            else if (q == 1) {
                // เรียกเมธอด printInfo ให้หน่อย
                F.printInfo();
            } 
            else if (q == 2) {
                content1 = scan.next();
                 w1 = scan.nextInt();
                F.addContent(content1, w1);
            }
        }
    }
}
