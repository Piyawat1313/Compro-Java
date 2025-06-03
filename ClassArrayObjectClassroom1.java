import java.util.Scanner;

class Classroom {
    String name;
    int countSeats;
    boolean projecter;
    boolean visual;
    boolean smartBoard;
    boolean camera;
    boolean resevre;

    Classroom(String name, int countSeats, boolean pro, boolean visual, boolean smartBoard, boolean camera) {
        this.name = name;
        this.countSeats = countSeats;
        this.projecter = pro;
        this.visual = visual;
        this.smartBoard = smartBoard;
        this.camera = camera;
        this.resevre = false;
    }

    boolean isAvailable(int countSeats, boolean pro, boolean visual, boolean smartBoard, boolean camera) {
        if(this.resevre) return false;
        if(countSeats > this.countSeats) return false;
        if(pro && !this.projecter) return false;
        if(visual && !this.visual) return false;
        if(smartBoard && !this.smartBoard) return false;
        if(camera && !this.camera) return false;

        return true;
    }

    boolean reserve(int countSeats, boolean pro, boolean visual, boolean smartBoard, boolean camera) {
        boolean check = isAvailable(countSeats, pro, visual, smartBoard, camera);
        if (check) {
            resevre = true;
            System.out.println(this.name);
            return true;
        } else {
            return false;
        }
    }
}

public class Classroom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Classroom classroom[] = new Classroom[N];

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int numSeats = sc.nextInt();
            int nProj = sc.nextInt();
            int nVisual = sc.nextInt();
            int nSmart = sc.nextInt();
            int nCam = sc.nextInt();
            boolean checkPro;
            boolean checkNvisual;
            boolean checkNsmart;
            boolean checkNcam;
            if (nProj == 1)
                checkPro = true;
            else
                checkPro = false;

            if (nVisual == 1)
                checkNvisual = true;
            else
                checkNvisual = false;

            if (nSmart == 1)
                checkNsmart = true;
            else
                checkNsmart = false;

            if (nCam == 1)
                checkNcam = true;
            else
                checkNcam = false;

            classroom[i] = new Classroom(name, numSeats, checkPro, checkNvisual, checkNsmart, checkNcam);
        }
        int k = sc.nextInt();
        boolean checkPro;
        boolean checkNvisual;
        boolean checkNsmart;
        boolean checkNcam;
        for (int i = 0; i < k; i++) {
            int numSeats = sc.nextInt();
            int nProj = sc.nextInt();
            int nVisual = sc.nextInt();
            int nSmart = sc.nextInt();
            int nCam = sc.nextInt();
            if (nProj == 1)
            checkPro = true;
            else
            checkPro = false;
            
            if (nVisual == 1)
            checkNvisual = true;
            else
            checkNvisual = false;
            
            if (nSmart == 1)
            checkNsmart = true;
            else
            checkNsmart = false;
            
            if (nCam == 1)
            checkNcam = true;
            else
            checkNcam = false;
            
            boolean found = false;
            for (int j = 0; j < N; j++) {
                if(classroom[j].reserve(numSeats, checkPro, checkNvisual, checkNsmart, checkNcam)){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("classroom not available");
            }
        }
        sc.close();
    }
}
