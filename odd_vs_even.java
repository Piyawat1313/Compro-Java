import java.util.Scanner;

public class odd_vs_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int sumodd = 0;
        int sumeven = 0;
        for(int i = 0; i < 8; i++){
            int number = sc.nextInt();
            if(number % 2 == 0){
                sumeven += number;
            }
            else if(number % 2 != 0){
                sumodd += number;
            }
        }
        if(sumeven > sumodd){
            System.out.println("even" + "\n" + sumeven + "\n" + sumodd);
        }
        else if(sumodd > sumeven){
            System.out.println("odd" + "\n" + sumeven + "\n" + sumodd);
        }
        else{
            System.out.println("equal" + "\n" + sumeven + "\n" + sumodd);
        }
    }
}
