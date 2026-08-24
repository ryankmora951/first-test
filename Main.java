import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What should the rectangle length be? ");
        double l = input.nextDouble();
        input.nextLine();

        System.out.println("What should the rectangle width be? ");
        double w = input.nextDouble();
        input.close();

        System.out.println("Hello World");
        
        Rectangle rect1 = new Rectangle(l, w);
        
        System.out.println(rect1);

        System.out.println("The rectangle has an area of: " + rect1.calcArea());

        System.out.println("The rectangle has a perimeter of: " + rect1.calcPerimeter());
    }
}
