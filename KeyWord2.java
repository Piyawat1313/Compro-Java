import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        String[] keyword = new String[round];

        for(int i = 0; i < round; i++){     //รับข้อความ
            keyword[i] = sc.next();
        }
        boolean check = true;   //ตัวเช็คว่าเจอแล้ว
        int[] count = new int[round];   //ตัวนับสตริงทุกตัว
            for(int j = 0; j < round; j++){
                for(int k = 0; k < round; k++){
                    if(keyword[j] == ""){   //ถ้ามีไม่มีคำมาเพิ่ม
                        break;  //หยุด
                    }
                    if(keyword[j].equalsIgnoreCase(keyword[k]) && check == false){  //ถ้า อาเรย์ช่องที่เจ มีคำซ้ำกับอาเรย์ช่องที่เค และ เช็ค เป็นเท็จ
                        keyword[k] = "";    //อาเรย์ช่องที่ เค เก็บช่องว่าง
                        count[j]++; //นับว่ามีตัวซ้ำมากี่ตัว  
                    }
                    else if(keyword[j].equalsIgnoreCase(keyword[k]) && keyword[k] != ""){   //ถ้าอาเรย์ช่องที่เจ มีตัวซ้ำ กับอาเรย์ช่องที่ เค และอาเรย์ช่องที่ เค ไม่มีข้อความ
                        check = false;  //เปลี่ยนค่าเป็นเท็จ
                        System.out.print(keyword[j] + " "); //ปริ้นข้อความออกมา
                        count[j]++; //นับว่าซ้ำมากี่ตัว
                    }
                }
                check = true;   //สถานะลูปแรก เป็นจริง เพื่อที่ปริ้นออกมาได้
            }
            System.out.println();
            int maxcount = Integer.MIN_VALUE;   //ตัวแปรเก็บค่าน้อยที่สุด
            for(int i = 0; i < round; i++){ //ลูปเช็คว่า ตัวนับจำนวนคำซ้ำที่มีค่าที่สุดออกมา
                if(count[i] > maxcount){
                    maxcount = count[i]; 
                }
            }
            System.out.print(maxcount + " ");   //ปริ้นค่า แม็กออกมา
            for(int i = 0; i < round; i++){ //ลูปเช็คว่า ถ้าตัวนับ เท่ากับ ค่ามากที่สุด
                if(count[i] == maxcount){
                    System.out.print(keyword[i] + " "); //ปริ้นคำที่ซ้ำออกมา
                }
            }
        sc.close();
    }
}
