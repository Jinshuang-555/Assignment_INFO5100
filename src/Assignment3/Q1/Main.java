package Assignment3.Q1;

public class Main {
    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();

        Moody happy = new Happy();
        System.out.println("How are you feeling today? ");
        psychiatrist.observe(happy);
        psychiatrist.examine(happy);

        System.out.println("==================");
        Moody sad = new Sad();
        System.out.println("How are you feeling today? ");
        psychiatrist.observe(sad);
        psychiatrist.examine(sad);
    }
}
