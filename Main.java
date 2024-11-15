 
    public class Main{
        public static void main(String[] args) {
            Shape circle = new Circle(50.0, "black", true);
            System.out.println("\n" + "Area of Circle: " + circle.getArea());
            System.out.println("Perimeter of Circle: " +circle.getPerimeter());
            System.out.println(circle.toString() + "\n");
    
            Shape Rectangle = new Rectangle(43.5, 80.0, "black", true);
            System.out.println("Area of Rectangle: " + Rectangle.getArea());
            System.out.println("Perimeter of Rectangle: " + Rectangle.getPerimeter());
            System.out.println(Rectangle.toString() + "\n");
            
            Shape Square = new Square(70.0, 35.0, 65.0, "black", true);
            System.out.println("Area of Square: " + Square.getArea());
            System.out.println("Perimeter of Square: " + Square.getPerimeter());
            System.out.println(Square.toString());
        }
    }
