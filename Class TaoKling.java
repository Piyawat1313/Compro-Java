import java.util.Scanner;
class TaoKlingOrder{
    int numMilk;
    int numJuice;
    int numMineralWater;
    int total;
    String PhoneNo = "";
    String code;
    boolean completed;
    TaoKlingOrder(String PhoneNo,int numMilk, int numJuice, int numMineralWater, String code){
        if(numMilk > 0){
            this.numMilk = numMilk;
        }
        else{
            numMilk = 0;
        }
        if(numJuice > 0){
            this.numJuice = numJuice;
        }
        else{
            numJuice = 0;
        }
        if(numMineralWater > 0){
            this.numMineralWater = numMineralWater;
        }
        else{
            numMineralWater = 0;
        }
            if(PhoneNo.startsWith("0") && PhoneNo.length() == 10){
                this.PhoneNo = PhoneNo;
             }else{
                 System.out.println("invalid phone number");
                 this.PhoneNo += "0#########";
             }
        this.code = code;
        this.total = (this.numMilk * 10) + (this.numJuice * 20) + (this.numMineralWater * 15);
    }
    boolean grabOrder(String PhoneNo, String code){
       if(this.PhoneNo.equals(PhoneNo) && this.code.equals(code)){
         this.completed = true;
        return true;
       }
       return false;
    }
    void printInfo(){
        if(completed){
             System.out.print(this.PhoneNo + " " + numMilk + " " + numJuice + " " + numMineralWater + " " + this.total + " " + "Y");
        } 
        if(!completed){
             System.out.print(this.PhoneNo + " " + numMilk + " " + numJuice + " " + numMineralWater + " " + this.total + " " + "N");
        }
    }
}
public class TaoKling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNo = sc.next();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        String code = sc.next();
        TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1, n2, n3, code);
        String phone = sc.next();
        String code1 = sc.next();
        boolean flag = t.grabOrder(phone, code1);
        System.out.println(flag);
        t.printInfo();
        sc.close();
    }
}
