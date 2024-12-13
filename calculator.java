import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []number = new int[n];
        StringBuilder history = new StringBuilder();    //เครื่องมือเปลี่ยนข้อความ
        int success = 0;
        for(int i = 0; i < n; i++){
            number[i] = sc.nextInt();
        }
        while (true){
            int operator = sc.nextInt();
            if(operator == 0){  //ถ้าเป็น 0
                break;  //หยุดการทำงาน
            }
            else if(operator == 1){ //ถ้าเป็น 1 
                int index1 = sc.nextInt();  //รับตำแหน่ง
                int index2 = sc.nextInt();
                if(index1 >= 0 && index1 < n && index2 >= 0 && index2 < n){ //ถ้าไม่เกินขอบเขตอาเรย์
                    int result = number[index1] + number[index2];   //result เก็บค่า ของการบวกกัน
                    System.out.println(result); //ปริ้นผลลัพธิ์ออกมา
                    history.append(result).append(" "); //เพิ่ม result ลงใน String Builder แลวเพิ่มช่องว่างลงใน String Building อีกที
                    success += result;  //ผลรวมของการบอกกันทั้งหมด
                }else{  //เกินขอบเขตอาเรย์
                    System.out.println("error");
                }
            }else{  //คำสั่งผิด
                System.out.println("error");
            }
        }
        System.out.println(history.toString().trim());  //ปริ้นออบเจ็กของ String Building  ส่วน . trim เป็น method ของ สตริง ใช้ลบช่องว่างข้างหน้าและช่องว่างที่อยู่ท้ายข้อความ
        System.out.println(success);
        sc.close();
    }
}
