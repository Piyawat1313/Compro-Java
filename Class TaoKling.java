import java.util.Scanner;

class TaoKlingOrder {
    int numMilk;
    int numJuice;
    int numMineralWater;
    int total = 0;
    String phoneNo = "";
    String code;
    boolean completed;

    public TaoKlingOrder(String phoneNo, int n1, int n2, int n3,  String code){
        this.numMilk = n1;
        this.numJuice = n2;
        this.numMineralWater = n3;
        this.code = code;
        this.completed = false;
        try {
            if(phoneNo.startsWith("0") && phoneNo.length() == 10){
                this.phoneNo = phoneNo;
             }else{
                 System.out.println("invalid phone number");
                 this.phoneNo += "0#########";
             }
        } catch (Exception e) {

        }
        
        if(numMilk >= 0 && numJuice >= 0 && numMineralWater >= 0){
            this.total += (numMilk * 10) +  (numJuice * 20) + (numMineralWater * 15);
        }
    }
    boolean grabOrder(String phoneNo, String code){
       if(this.phoneNo.equals(phoneNo) && this.code.equals(code)){
         this.completed = true;
        return true;
       }
       return false;
    }
    void printInfo(){
        System.out.print(phoneNo + " ");
        System.out.print(this.numMilk + " ");
        System.out.print(this.numJuice + " ");
        System.out.print(this.numMineralWater + " ");
        System.out.print(this.total + " ");
        if(completed) System.out.print("Y");
        if(!completed) System.out.print("N");
    }
}

public class TaoKling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNo = sc.next();
        int n1 = sc.nextInt();  //นม
        int n2 = sc.nextInt();  //นำ้ผลไม้
        int n3 = sc.nextInt();  //น้ำแร่
        String code = sc.next();    //code คนแรก
        TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1, n2, n3, code);
        String phone = sc.next();   //เบอร์โทรรอบสอง
        String code1 = sc.next();   //code รอบที่ 2 
        boolean flag = t.grabOrder(phone, code1);   
        System.out.println(flag);
        t.printInfo();
        sc.close();
    }
}
