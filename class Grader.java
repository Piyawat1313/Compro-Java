class Grader{
    String name;
    String desc;
    int[] pts;
    String[] sols;
    public Grader(String name,String desc,int[] pts, String[] sols){
        this.name = name;
        this.desc = desc;
        this.pts = java.util.Arrays.copyOf(pts,pts.length);
        this.sols = java.util.Arrays.copyOf(sols, sols.length);
    }
}
