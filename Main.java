public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program on master branch.");
        double x1 = Math.floor(Math.random()*10);
        double y1 = Math.floor(Math.random()*10);
        double x2 = Math.floor(Math.random()*10);
        double y2 = Math.floor(Math.random()*10);

        double x3 = Math.floor(Math.random()*10);
        double y3 = Math.floor(Math.random()*10);
        double x4 = Math.floor(Math.random()*10);
        double y4 = Math.floor(Math.random()*10);
        double lenOfLine1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        System.out.println("Length of line1: "+lenOfLine1);
        double lenOfLine2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2) );
        System.out.println("Length of line2: "+lenOfLine2);
        if (lenOfLine1 == lenOfLine2){
            System.out.println("Line1 is equal to line2.");
        } else if (lenOfLine1>lenOfLine2){
            System.out.println("Line1 is longer than line2.");
        } else {
            System.out.println("Line1 is shorter than line2.");
        }
    }
}