package cartesianline;

import java.util.Scanner;

public class CartesianOops {
    // Calculate length and return
    public int lengthCalculate(int x1,int y1, int x2, int y2){
        int length = (int)Math.pow((x2-x1),2) + (int)Math.pow((y2-y1),2);
        return (int)Math.sqrt(length);
    }
    // Check Equality and display
    public void checkEqual(int line1, int line2){
        String firstLine = new String();
        String secondLine = new String();
        firstLine = (line1 + "0");
        secondLine = (line2 + "0");
        if(firstLine.equals(secondLine)==true){
            System.out.println("Both lines are equal");
        }else {
            System.out.println("Both lines are not equal");
        }
    }
    public static void main(String[] args) {

        System.out.println("HWelcome to Line Comparison Computation Program on Master Branch");
        Scanner input = new Scanner(System.in);
        CartesianOops length = new CartesianOops();
        // Coordinate of line1
        int x1,y1,x2,y2;
        // Coordinate of line2
        int x3,y3,x4,y4;
        System.out.println("Please enter first coordinates x1 and y1 Of First Line: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Please enter second coordinates x2 and y2 Of First Line: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.println("Please enter first coordinates x3 and y3 Of Second Line: ");
        x3 = input.nextInt();
        y3 = input.nextInt();
        System.out.println("Please enter second coordinates x4 and y4 Of Second Line: ");
        x4 = input.nextInt();
        y4 = input.nextInt();
        Integer line1 =  length.lengthCalculate(x1,y1,x2,y2);
        Integer line2 =  length.lengthCalculate(x3,y3,x4,y4);
        System.out.println("Line1: " + length.lengthCalculate(x1, y1, x2, y2));
        System.out.println("Line2: " + length.lengthCalculate(x3, y3, x4, y4));
        length.checkEqual(line1,line2);
    }
}