package Assignment1;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(digitLetterSeparate("1A3d4s5t"));
        System.out.println(digitLetterSeparate("A2bb2d4"));
    }
    public static boolean digitLetterSeparate(String s) {
        for (int i=0; i<s.length()-1;i++) {
            if ((Character.isDigit(s.charAt(i))&&Character.isDigit(s.charAt(i+1)))
                    || (Character.isAlphabetic(s.charAt(i))&&Character.isAlphabetic(s.charAt(i+1)))){
                return false;
            }
        }
        return true;
    }

}
