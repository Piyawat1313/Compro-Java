import java.util.Scanner;

public class CovidScreening {
    static void screenCovid(boolean sos, int level, int age, int wakseen) {
        if (sos) {
            System.out.println("RT-PCR recommended");
        }
        if(age >= 70){
            System.out.println("Hospital admission");
        }
        else if(age < 70){
            if(level == 1 || level == 2){
                System.out.println("Home isolation");
            }
            else if(level == 3){
                System.out.println("Hospital admission");
            }
        }
        if(wakseen >= 2){
            if(level == 2 || level == 3){
                System.out.println("Favipiravia included");
            }else{
                System.out.println("Standard medicine package");
            }
        }
        else if(wakseen < 2){
             System.out.println("Favipiravia included");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int insurance = sc.nextInt();
        int severity = sc.nextInt();
        int age = sc.nextInt();
        int vaccines = sc.nextInt();
        boolean socia;
        if(insurance == 1){
            socia = true;
        }
        else{
            socia = false;
        }
        screenCovid(socia, severity, age, vaccines);
        sc.close();
    }
}
