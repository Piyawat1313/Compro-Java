import java.util.Scanner;

class Food {

    String foodName;
    String content;
    int w1;
    String[] kai = new String[3];
    int[] nab = new int[3];
    int count =0;
    int sumcal=0;
    int cal;
    int[] dal = new int[3];


    Food(String foodName, String content, int w1, int cal){
        this.foodName=foodName;
        this.kai[count]=content;
        this.nab[count]=w1;
        this.cal=cal;
        sumcal=cal*w1;
        count++;
    }

    public void addContent(String content, int w1, int cal){
        kai[count] = content;
        nab[count] = w1;
        sumcal+=w1*cal;
        count++;
    }

    public void printInfo(){
        int sum = 0;
        System.out.println(this.foodName);
        for(int i=0;i<count;i++){
            sum += nab[i];
        }
        System.out.println(sum+" "+sumcal);
        for(int i=0;i<count;i++){
            System.out.print(kai[i]+" ");
        }
        System.out.println();
    }

}
public class FoodContents1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        int cal = scan.nextInt();
        Food F1 = new Food(foodName,content1,w1,cal);
            // สร้างวัตถุ Food ตรงนี้ ฮวงจุ้ยดี ชีวิตจะง่าย
        int q = scan.nextInt();
            
        while(q != 0) {
            
            if(q == 1) {
                // เรียกเมธอด printInfo ให้หน่อย
                F1.printInfo();
            }
            else if(q == 2) {
                // ทาอะไรสักอย่าง ที่แน่ ๆ ต้องมีการเรียก addContent
                String add1 = scan.next();
                int add2 = scan.nextInt();
                int add3 = scan.nextInt();
                F1.addContent(add1, add2, add3);
            }
            q = scan.nextInt();
        }
    }
}
