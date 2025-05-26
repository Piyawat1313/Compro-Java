import java.util.Scanner;
class Traveler{
    String PassportID;
    String country;
    String Day;
    double tem;
    int status;
    Traveler(String ID, String C, String D, double tem){
        PassportID = ID;
        country = C;
        Day = D;
        this.tem = tem;
        if(this.tem > 37.5 || country.contains("JAPAN") || country.contains("GERMANY") || country.contains("KOREA") || country.contains("CHINA") || country.contains("TAIWAN") || country.contains("FRANCE") || country.contains("SINGAPORE") || country.contains("ITALY") || country.contains("IRAN")){
            this.status = -1;
        }
        else{
            this.status = 0;
        }
    }
    void printInfo(){
        if(this.status == -1 ){
             System.out.println(this.PassportID + " " + this.Day);
        }
        else{
             System.out.println(this.PassportID + " " + this.Day);
        }
    }
}
public class TravelerScreening2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Traveler traveler[] = new Traveler[n];
        for (int i = 0; i < n; i++) {
            String ID = sc.next();
            String country = sc.next();
            String Day = sc.next();
            double tem = sc.nextDouble();
            traveler[i] = new Traveler(ID, country, Day, tem);
        }
        int covid = 0;
        int NoCovid = 0;
        for (int j = 0; j < n; j++) {
            if(traveler[j].status == -1){
                covid++;
            }
            else{
                NoCovid++;
            }
        }
        System.out.println(covid);
        for (int i = 0; i < n; i++) {
            if(traveler[i].status == -1){
                traveler[i].printInfo();
            }
        }
        System.out.println(NoCovid);
        for (int i = 0; i < n; i++) {
            if(traveler[i].status == 0){
                traveler[i].printInfo();
            }
        }
        sc.close();
    }
}
