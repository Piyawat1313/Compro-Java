import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        String[] keyword = new String[round];

        for(int i = 0; i < round; i++){
            keyword[i] = sc.next();
        }
        boolean check = true;
            for(int j = 0; j < round; j++){
                for(int k = 0; k < round; k++){
                    if(keyword[j] == ""){
                        break;
                    }
                    if(keyword[j].equalsIgnoreCase(keyword[k]) && check == false){
                        keyword[k] = "";
                        
                    }
                    else if(keyword[j].equalsIgnoreCase(keyword[k]) && keyword[k] != ""){
                        check = false;
                        System.out.print(keyword[j] + " ");
                    }
                }
                check = true;
            }
       
        sc.close();
    }
}
