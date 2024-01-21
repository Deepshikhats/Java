import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

class QuickStart {
    // class won't work without main function
    public static void main(String[] args) {
        int x = 123; // initialization
        System.out.println("my no is" + x);

        // scanner -> for getting user input
        Scanner scanner = new Scanner(System.in);
        // System.out.print("What is ur name");
        // String name = scanner.nextLine();
        // System.out.print("What is ur age");
        // int age = scanner.nextInt(); // only accepts integers
        // System.out.print("What is ur fav food?");
        // scanner.nextLine(); // skips \n from storing into variable food
        // String food = scanner.nextLine(); // only accepts integers
        // System.out.println("name is " + name + "and age is " + age + "food " + food);

        /**
         * GUI ---> A SIMPLE GUI
         */

        // String firstname = JOptionPane.showInputDialog("what is your name");
        // // converting returned string to integer
        // int yourAge = Integer.parseInt(JOptionPane.showInputDialog("what is your
        // name"));
        // JOptionPane.showMessageDialog(null, "Name is " + firstname + " and age is " +
        // yourAge);

        /**
         * Math
         */
        double a = 3.14;
        double b = 4;
        Math.max(a, b);
        Math.min(a, b);
        Math.sqrt(b);
        Math.ceil(a); // convert to nearest greatest int
        Math.floor(a); // convert to nearest lowest int
        Math.abs(a); // absolute value

        /*
         * Random Value Generation
         */

        Random random = new Random();
        int c = random.nextInt(); // no limit, generates a random no in btwn -2 billion and +2bln
        int d = random.nextInt(6); // setting limit

        /*
         * if -else if -else
         */
        int age = 18;
        if (age >= 18) {
            System.out.println("you r adult");
        } else if (age > 10 && age < 17) {
            System.out.println("you r teenager");

        } else {
            System.out.println("you child");

        }

        /**
         * switch
         */
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("monday");
                break;
            case "Tuesday":
                System.out.println("tuesda");
                break;
            default:
                break;
        }

        /**
         * Logical operators --> &&,||,!
         */

        /**
         * Loops
         * for and While --> executes until cond is false
         */

        while (age == 19) {
            System.out.println("age is 18");

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        /**
         * ARRAYS
         */

        String[] myArray = { "cat", "dog", "elephant" };
        System.out.println(myArray[0]); // accesing array ele
        String[] myArray2 = new String[1]; // creating array of length
        myArray[0] = "tesla";
        System.out.println(myArray2[0]);

    }
}