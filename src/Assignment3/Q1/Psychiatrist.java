package Assignment3.Q1;

public class Psychiatrist {
    String expression;
    public void examine(Moody moody){
        if (moody.getMpod()=="I feel happy Today") {
            System.out.println("Observation:" + moody.toString());
        } else if (moody.getMpod()=="I feel sad Today") {
            System.out.println("Observation:" + moody.toString());
        }
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moody){
        System.out.println(moody.getMpod());
        moody.ExpressFeelings();
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(Moody moody){
        return moody.toString();
    }
}
