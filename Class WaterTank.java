
    import java.util.Scanner;
    class WaterTank {
        private int capacity;
        private int volume = 0;
        public WaterTank(int wide, int Long, int height){   //วิธีสร้าง object ของ classนั้นๆๆ
            this.capacity = wide * Long * height;   //เรียกตัวแปรในคลาส เก็บผลัพธิ์ของความจุถังไว้
            this.volume = 0;
        }
        public int Fill(int add){     //ฟังก์ชั่นที่รับพารามิเตอร์มาจาก loop
            if(this.volume + add > this.capacity){      //วิธีเทียบ ตัวแปรที่อยู่ในคลาส
                System.out.println("Cannot fill the tank");
                return -1;
            }else{
                this.volume += add;
                return this.volume;     //วิธีเรียกใช้ตัวแปรที่อยู่ในคลาส
            }
        }
    }

public class tank {
        public  static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int wide = scanner.nextInt();
            int Long = scanner.nextInt();
            int height = scanner.nextInt();
            int add = 0;
            WaterTank T = new WaterTank(wide, Long, height);    //วิธีเรียกใช้คลาสๆๆ
            for(int i = 0; i < 5; i++){
                add = scanner.nextInt();
                int total = T.Fill(add);
                System.out.println(total);
            }
            scanner.close();
        } 
    }
