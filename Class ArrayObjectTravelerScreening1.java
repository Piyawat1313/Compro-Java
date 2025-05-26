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
            System.out.println(this.PassportID + " STATE-QUARANTINE");
        }
        else{
            System.out.println(this.PassportID + " SELF-QUARANTINE");
        }
    }
}
public class TravelerScreening1 {
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
        for (int j = 0; j < n; j++) {
            traveler[j].printInfo();
        }
        sc.close();
    }
}
