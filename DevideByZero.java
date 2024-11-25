import java.util.Scanner;
public class DevideByZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        //รับค่าแบบ Java
        double number = sc.nextDouble();            //รับค่า number
        double num = sc.nextDouble();
        int operator = sc.nextInt();
        double result;
        if(operator != 0){
            result = (number + num) / operator;
            System.out.printf("%.6f", result);
        }
        else{
            System.out.println("cannot divide by zero");
        }
    }
}
