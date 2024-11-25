import java.util.Scanner;
public class operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result;
        if(z == 1){
            result = x + y;
            System.out.println(result);
        }
        else if(z == 2){
            result = x - y;
            System.out.println(result);
        }
        else if(z == 3){
            result = x * y;
            System.out.println(result);
        }
        else if(z == 4){
            if(y > 0){
                result = x / y;
                System.out.println(result);
            }else{
                System.out.print("cannot divide by zero");
            }
        }
        else if(z == 5){
            if(y > 0){
                result = x % y;
                System.out.println(result); 
            }else{
                System.out.print("cannot divide by zero"); 
            }
        }
    }
}
