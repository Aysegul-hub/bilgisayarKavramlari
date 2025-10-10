public class BlockScopeDemo {
    public static void main(String[] args) {
        int outer = 5;
        System.out.println("Outside if block - outer: " + outer);

        if (outer == 5){
            int innerY = 15;
            System.out.println("Inside if block - outer: " + outer);
            System.out.println("Inside if block - innerY: " + innerY);
        }
        System.out.println("Outside if block - outer: " + outer);
    }
}
