package algo;

public class MethodOverload{
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(null);
    }

    private static class Printer {


        public void print(Object o) {
            System.out.println("Calling object method");
        }

        public void print(String str){
            System.out.println("Calling string method");
        }



    }
}
