import java.util.Scanner;
public class compress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Input N:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.print("Input  K:");
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int [] result = new int[n];
        int count = 0;
        int sum = 0;
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == k1 || arr[i] == k2 || arr[i] == k3){
                if(sum > 0){
                    result[count++] = sum;
                    sum = 0;
                }
                if(!found){
                    result[count++] = arr[i];
                    found = true;
                }
            }
            else{
                sum += arr[i];
                found = false; 
            }
        }
        /*if(sum > 0){
            result[count++] = sum;
        }*/
        for(int i = 0; i < count; i++){
            System.out.print(result[i] + " ");
        }
    }
}
        
// How to 2
        
        /*List<Integer> result = new ArrayList<>();           //เป็นเครื่องมือ อินเทอร์เฟซ ใช้สำหรับเก็บข้อมูลลำดับ
                                                            //ArrayList = รายการลำดับ
                                                           //<>() = ไดม่อนโอเปอเรเตอร์*/
        /*int sum = 0;
        boolean found = false;
        for(int i = 0; i < n; i++){
            if((arr[i] == k1 || arr[i] == k2 || arr[i] == k3)){
              if(sum > 0){
                result.add(sum);
                sum = 0;
              }
              if(!found){
                result.add(arr[i]);
                found = true;
              }
            }
            else{
                sum += arr[i];
                found = false; 
            }  
        }
        if(sum > 0){
            result.add(sum);
        }
        for(int value : result){
            System.out.print(value + " ");
        }*/
     
 

