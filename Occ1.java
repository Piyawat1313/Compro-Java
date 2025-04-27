import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resevre = sc.nextInt();
        int count_suscess = 0;
        int count_not = 0;
        int count_arr[] = new int[resevre];
        int resevre_again = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < resevre; i++) {
            int index = sc.nextInt();
            if(index < 1 || index > n){     //เกินขอบเขตอาเรย์
                count_not ++;
            }
           
            else if(count_arr[index] == 0){ //ช่องที่ยังไม่มีคนจอง
                count_suscess ++;
                count_arr[index] = 1;
                //System.out.println("Index Count: " + i + " ARR [Index]: " + count_arr[index]);
            }
            else{   //ถ้า Arr [index] == 1  ให้จองใหม่
                resevre_again ++;
            }
             if(index >= 1 && index <= n){      //ไม่เกินขอบเขตอาเรย์
                count_arr[index]++;     //อัปเดตอาเรย์ช่องนั้น
                //count_suscess ++;
            }
        }
        for (int i = 0; i < count_arr.length; i++) {
            if(count_arr[i] > max){
                max = count_arr[i];
                arr.clear();    //reset
                arr.add(i);     //แอดช่องที่มีคนจองมากที่สุด
            }else if(max == count_arr[i]){  //ถ้าช่องที่ของเท่ากัน
                arr.add(i);     //แอดช่องนั้นลงไปด้วย
            }
            //System.out.println(" Index: " + i + " Count Arr: " + count_arr[i]);
        }
        System.out.println(count_suscess);
        System.out.println(count_not);
        System.out.println(resevre_again);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
