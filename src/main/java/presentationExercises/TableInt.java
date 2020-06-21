package presentationExercises;

public class TableInt {

    public static void tableMinMax (int[] table){

        int min = table[3];
        int max = table[3];


        for(int number: table){
            if (number > max) max = number;
            if (number < min) min = number;

        }
        System.out.println("min" + min);
        System.out.println("max" + max);

    }

    public static void main(String[] args) {

    }

}
