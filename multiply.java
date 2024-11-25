import java.util.Scanner;
public class multiply {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int start = sc.nextInt();
        int stop = sc.nextInt();
        int n = sc.nextInt();
       //ตรวจสอบค่าอยู่ในช่วงกำหนด
       if(start < 2 || start > 99 || stop < 2 || stop > 99 || n < 1 || n > 99){
        System.out.println("Invalid Input");
            return;
       }
       //จัดเรียง start stop              //ตรงนี้สามารถหาค่ามากค่าน้อยมาใช้ก็ได้
       if(start > stop){
            start = start ^ stop;          // ^ มันคือ XOR ระหว่าง start stop เก็บผลลัพธิ์ไว้ใน start
            stop = start ^ stop;            // ใช้ผลจากขั้นตอนแรก XOR กับ stop เพื่อหา Start
            start = start ^ stop;           //ใช้ผลลัพธิ์จากขั้นตอนแรก XOR กับ start ใหม่เพื่อหา Stop      
       }
       for(int i = start; i <= stop; i++){
            System.out.print(i + ":" + " ");  
            for(int j = 1; j <= n; j++){
                System.out.print(" " + (i * j));
            }
            System.out.println();
       }
    }
}
