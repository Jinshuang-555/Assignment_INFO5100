package Midterm;

public class Q2 {
    static class Printer{
        public static Printer printer = null;
        private Printer(){

        }
        public static Printer getInstance() {
            if (printer == null) {
                printer = new Printer();
            }
            return printer;
        }
        public void getConnection(){
            System.out.println("Your printer is working");
        }

        static class Main{
            public static void main(String[] args) {
                Printer p1;
                p1 = Printer.getInstance();
                p1.getConnection();
            }
        }
    }
}
