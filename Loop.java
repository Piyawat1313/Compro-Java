import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = sc.nextInt();
        if(number > 0){
            for(int i = 1; i <= number; i++){
                System.out.println("Number Input:" + " " + i);
            }  
        }
        else{
            System.out.print("Invalid input"); 
        }
        
    }
}
