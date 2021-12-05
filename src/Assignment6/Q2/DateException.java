package Assignment6.Q2;

public class DateException extends Exception {
    public DateException(int months) {
        super("The age of the applicant is " + months/12 +  " which is too early to apply for a driving license");
    }
}
