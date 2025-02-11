import java.util.Scanner;

class Carriage{
    int type;
    int code;
    int count;
    int tiket = 0;
    int passSeat;
    public Carriage(int type, int capa, int id){
        this.type = type;
        this.count = capa;
        this.code =  id;
    }
    void reserveSeats(int q){
        if(type == 1 || type == 2){
            if(tiket + q <= count){
                tiket += q;
            }
        }
        else if(type == 3){
            if(tiket < count){
                tiket += q;
                if(tiket + q > count){
                    passSeat += tiket - count;
                    tiket = count;
                }
            }
            else if(tiket == count){
                if(passSeat + q <= 10){
                    passSeat += q;
                }
            }
        }
    }
    void printStats(){
        if(type == 1 || type == 2){
            System.out.println(code + " " + type + " " + tiket + " " + count);
        }
        else if(type == 3){
            System.out.println(code + " " + type + " " + tiket + " " + count + " " + passSeat  + " "+ "10");
        }
    }
}
public class Tran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        Carriage[] C = new Carriage[N + 1];
        for(int i = 1; i <= N; i++) {
            int type = scan.nextInt();
            int capa = scan.nextInt();
            int id = scan.nextInt();
            C[i] = new Carriage(type, capa, id);
        }
        
        final int K = scan.nextInt();
        for(int i = 1; i <= K; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            C[p].reserveSeats(q);
        }
        
        for(int i = 1; i <= N; i++) {
            C[i].printStats();
        }
    }
}
