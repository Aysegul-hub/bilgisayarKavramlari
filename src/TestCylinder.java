public class TestCylinder {
    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10,20);

        System.out.println("---- CYLINDER 1 ----");
        System.out.println("Base Area: " + c1.calculateBaseArea());
        System.out.println("Surface Area: " + c1.calculateSurfaceArea());
        System.out.println("Volume: " + c1.calculateVolume());
        System.out.println("Mass (density=5.12): " + c1.calculateMass(2.5));
        System.out.println();

        System.out.println("---- CYLINDER 2 ----");
        System.out.println("Base Area: " + c2.calculateBaseArea());
        System.out.println("Surface Area: " + c2.calculateSurfaceArea());
        System.out.println("Volume: " + c2.calculateVolume());
        System.out.println("Mass (density=5.12): " + c2.calculateMass(2.5));
        System.out.println();


        System.out.println("Cylinder obje sayısı : " + Cylinder.getNoOfCylinder());    // silindir sayısı





    }
}
