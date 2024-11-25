import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name Student: ");
        String name = sc.nextLine();
        System.out.println("Score: ");
        int score = sc.nextInt();
        if(score < 0 || score > 100){
            System.out.print("Not Problem");
        }else{
            if(score >= 80){
                System.out.print("A");
            }
            else if(score >= 70 && score <= 79){
                System.out.print("B");
            }
            else if(score >= 60 && score <= 69){
                System.out.print("C");
            }
            else if(score <= 59){
                System.out.print("F");
            }
        }
    }
}
