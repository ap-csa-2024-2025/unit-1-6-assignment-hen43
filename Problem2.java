public class Problem2{
    static int round(double x){
        return((int)(x+0.5));
    } 

    public static void main(String[] args){
        double gyatt = 2.3;
        double ohio = 6.5;

        System.out.println(round(gyatt) + round(ohio));
    }
}
