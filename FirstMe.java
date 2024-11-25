import java.util.Scanner;
public class FirstMe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = sc.nextInt();
        System.out.print("Input Point: ");
        int point = sc.nextInt();
        System.out.print("Input Score: ");
        int count = 0;
        int numberSSS = 0;
        int score;
        for(;;){
            score = sc.nextInt();
            if(score < 0){
                System.out.println("Score: " + score);
                break;
            }
            else if(score % number == 0 && score % point == 0){
                numberSSS = score;
                count +=2;
                System.out.println("Score: " + numberSSS);
                System.out.println("Count: " + count);
                break;
            }
            else if(score % number == 0){
                numberSSS = score;
                count = 0;
                System.out.println("Score: " + numberSSS);
                System.out.println("Count: " + count);
                break;
            }
            else if(score % point == 0){
                numberSSS = score;
                count  = 1;
                System.out.println("Score: " + numberSSS);
                System.out.println("Count: " + count);
                break;
            }
        }
    }
}
