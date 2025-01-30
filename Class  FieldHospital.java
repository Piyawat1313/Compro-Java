import java.util.Scanner;

class FieldManager{
   private boolean[] count;
   private int bed = 0;
    public FieldManager(int n){
        this.count = new boolean [n + 1];
        this.bed = 0;
    }
    int reserveBed(){  //หาเตียง
        for(int i = 1; i < count.length; i++){  //loop ขนาดอาเรย์ boolean เพื่อเช็คเตียง
            if(!count[i]){  //ถ้าเตียงว่าง
                count[i] = true;    //เปลี่ยนสถานะเป็น true
                bed++;  //นับจำนวนเตียง
                return i;   //คืนค่าเตียงที่ว่าง
            }
        }
        return -1; // เมื่อไม่มีเตียงว่าง
    }
    boolean discharge(int bednumber){
        if(bednumber < 1 || bednumber >= count.length || !count[bednumber]){    //ถ้า bednumber ไม่เกินขอบเขตหรือติดลบ หรือ หมายเลขเตียงไม่ตรง
            System.out.println("Invalid bed number");
            return false;   //คืนค่า false
        }
        count[bednumber] = false;   //count[bednumber] ตั้งค่าเป็นfalse
        bed--;  //ลบเตียง
        System.out.println("Patient discharged");
        return true;
    }
    void reportBed(){   //พิมรายงาน
        System.out.println(bed);
    }
}
public class FieldHospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //จำนวนเตียง
        int Q = sc.nextInt();
        FieldManager fm = new FieldManager(n);
        for(int i = 0; i < Q; i++){
            int k = sc.nextInt();   //จองเตียง
            int a = sc.nextInt();   //หมายเลขเตียง ถ้าเป็น 0 คือ รายงานเตียงกับจองเตียง
            if(k == 1){
                int bednumber = fm.reserveBed();    //ตั้งตัวแปร bednumber เก็บmethod ของ reserveBedไว้
                if(bednumber == -1){    //ถ้าmethod คืนค่า - 1 แปลง่ายๆ คือไม่มีเตียง
                    System.out.println("No bed vacancy");
                }else{  //จองได้
                    System.out.println("Bed " + bednumber + " reserved");
                }
            }
            else if(k == 2){    //ถ้าปล่อยเตียง
                fm.discharge(a);
            }
            else if(k == 3){    //รายงานเตียงที่ถูกครอง
                fm.reportBed();
            }
        }
        sc.close();
    }
}
