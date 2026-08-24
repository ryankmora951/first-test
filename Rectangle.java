public class Rectangle {
    private double length;
    private double width;
    /*Code for Rectangle Class*/
    
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getLength() {
        return length;

    }

    public double getWidth() {
        return width;
    }

    public double calcArea() {
        return length * width;
    }

    public String toString() {
        return "My rectangle has a length " + length + " and a width of " + width + ".";
    }
}
