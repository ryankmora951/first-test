import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Hello World");
        
        Rectangle rect1 = new Rectangle(4.6, 9.4);
        
        System.out.println(rect1);

        System.out.println("The rectangle has an area of: " + rect1.calcArea());
    }
}
