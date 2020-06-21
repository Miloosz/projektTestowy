package presentationExercises;

public class ForEach {

    public static void ex1(String[] tableOfNames) {

        for (String name : tableOfNames) {
            System.out.println("Hello, my name is " + name);
        }

    }

    public static String ex2(String[] tableOfProducts) {
        String list = "";
        for (String product : tableOfProducts) {
            list += product + ", ";
        }
        return list;
    }

    public static void main(String[] args) {

        String[] names = {"Miłosz", "Janek", "Tomek", "Adam", "Ewa"};
        String[] products = {"szynka", "masło", "ser", "bułka", "chleb"};
        ex1(names);
        String result = ex2(products);
        System.out.println(result);
    }

}
