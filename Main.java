public class Main {
    public static void calculation(double x1, double y1, double x2, double y2){
        double lenOfLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        System.out.println("Length of line: "+lenOfLine);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program on master branch.");
        double x1 = Math.floor(Math.random()*10);
        double y1 = Math.floor(Math.random()*10);
        double x2 = Math.floor(Math.random()*10);
        double y2 = Math.floor(Math.random()*10);
        Main.calculation(x1, y1, x2, y2);
    }
}
