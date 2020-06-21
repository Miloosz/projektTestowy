package presentationExercises;

public class Table {

    public static void switchTable(int[] table) {
        if (table.length >= 3){
            System.out.println("Before");

            int tbl = table[0];
            table[0] = table[2];
            table[2] = tbl;

            System.out.println("After");



        }

    }

    public static void tablesPrinter(int[] table) {

    }


}
