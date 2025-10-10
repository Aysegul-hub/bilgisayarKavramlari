public class VariableTest{



    int instanceVar =10;

    public void printInstanceVar() {

        System.out.println("Instance variable inside method : " + instanceVar);
        int localVar =5;


    }

    public static void main(String[] args) {

        VariableTest obj = new VariableTest();
        obj.printInstanceVar();


    }


}
