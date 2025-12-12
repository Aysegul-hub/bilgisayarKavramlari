public class MainGeometry {

        public static void main(String[] args) {
            Circle c1 = new Circle(5.0, "red", true);
            Rectangle r1 = new Rectangle(4.0, 6.0, "blue", false);

            c1.printCircle();
            System.out.println("Circle area: " + c1.getArea());
            System.out.println("Circle perimeter: " + c1.getPerimeter());

            System.out.println();
            System.out.println("Rectangle area: " + r1.getArea());
            System.out.println("Rectangle perimeter: " + r1.getPerimeter());
            System.out.println(r1.toString());
        }
    }

