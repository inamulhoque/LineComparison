import java.util.Scanner;
public class Main {
    public static void calculation(){
        System.out.println("Enter the co-ordinates:(x1,y1) & (x2,y2) ");
        Scanner myObj = new Scanner(System.in);
        System.out.print("x1: ");
        int x1 = myObj.nextInt();
        System.out.print("y1: ");
        int y1 = myObj.nextInt();
        System.out.print("x2: ");
        int x2 = myObj.nextInt();
        System.out.print("y2: ");
        int y2 = myObj.nextInt();

        double lenOfLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        System.out.print("Length of line is: "+lenOfLine);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program on master branch.");
        Main.calculation();
    }
}
