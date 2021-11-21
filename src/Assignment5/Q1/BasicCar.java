package Assignment5.Q1;

public class BasicCar implements Car {

    String name = "Basic Car";

    @Override
    public void assemble() {
        System.out.print("Basic Car. ");
    }

    public String getName() {
        return name;
    }
}
