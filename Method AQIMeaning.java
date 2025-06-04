import java.util.Scanner;

public class AQIMeaning {
    static void Meaning(int num){
        if(num >= 0 && num <= 50){
            System.out.println("Good");
        }
        else if(num >= 51 && num <= 100){
            System.out.println("Moderate");
        }
        else if(num >= 101 && num <= 150){
            System.out.println("Unhealthy for Sensitive Groups");
        }
        else if(num >= 151 && num <= 200){
            System.out.println("Unhealthy");
        }
        else if(num >= 201 && num <= 300){
            System.out.println("Very Unhealthy");
        }
        else{
            System.out.println("Hazardous");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Meaning(num);
        sc.close();
    }
}
