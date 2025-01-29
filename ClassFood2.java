import java.util.Scanner;

class Food {
    String foodName;
    String content1;
    int  w1;
    int cal ;
     public Food(String foodName, String content1, int w1, int cal){
        this.foodName = foodName;
        this.content1 = content1;
        this.w1 = w1;
        this.cal = cal;
    }
    public void addContent(String content1, int add, int cal){
        this.cal += add * cal; 
           this.w1 += add;
           this.content1 += " " + content1;
    }
    public void printInfo(){
        System.out.println(this.foodName);
        System.out.println(this.w1 + " " +  this.cal);
        System.out.println(this.content1);
    }
}

public class Foodcontence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        int cal = scan.nextInt();
        cal = cal * w1;
        Food F = new Food(foodName, content1, w1,cal);
        while (true) {
            int q = scan.nextInt();
            if(q == 0){
                break;
            }
            else if (q == 1) {
                
                F.printInfo();
            } 
            else if (q == 2) {
                content1 = scan.next();
                 w1 = scan.nextInt();
                 cal = scan.nextInt();
                F.addContent(content1, w1,cal);
            }
        }
    }
}
