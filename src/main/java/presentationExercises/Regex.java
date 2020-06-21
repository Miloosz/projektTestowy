package presentationExercises;

import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {


        Pattern emailPattern = Pattern.compile("[a-z0-9A-Z._%+-]+@[a-z0-9A-Z.]+.[A-Za-z]{2,64}");
        validate(emailPattern, "milosz.parada@gmail.com");
        validate(emailPattern, "janek@@@@.pl");


        Pattern peselPattern = Pattern.compile("[0-9]{11}");
        validate(peselPattern, "97092204777");
        validate(peselPattern, "9609090999");
        validate(peselPattern, "49234929");


    }
    private static void validate(Pattern pattern, String text) {
        System.out.println(text + " matches pattern " + pattern.matcher(text).matches());
    }

}
