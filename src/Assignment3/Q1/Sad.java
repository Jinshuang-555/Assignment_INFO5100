package Assignment3.Q1;

public class Sad extends Moody{
    @Override
    String getMpod() {
        return "I feel sad Today";
    }
    @Override
    void ExpressFeelings() {
        System.out.println("waah boo hoo weep sob");
    }
    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    }
}
