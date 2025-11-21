
public class Cat {

        // --- Attributes ---
        public int x;
        public double direction;
        public String name;

        // --- Constructors ---
        public Cat() {
            this.x = 0;
            this.direction = 0.0;
            this.name = "Unnamed";
        }

        public Cat(int x, double direction, String name) {
            this.x = x;
            this.direction = direction;
            this.name = name;
        }

        // --- Methods ---
        public void move() {
            // default hareket: x değerini 1 arttır
            x += 1;
        }

        public void move2(int a) {
            // x değerini a kadar arttır
            x += a;
        }

        public void turn(double angle) {
            // yönü değiştir
            direction += angle;
        }

        public void status() {
            System.out.println("Cat name: " + name);
            System.out.println("x: " + x);
            System.out.println("direction: " + direction);
        }
    }



