import java.util.Scanner;
import javax.swing.JOptionPane;

class QuickStart {
    // class won't work without main function
    public static void main(String[] args) {
        int x = 123; // initialization
        System.out.println("my no is" + x);

        // scanner -> for getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is ur name");
        String name = scanner.nextLine();
        System.out.print("What is ur age");
        int age = scanner.nextInt(); // only accepts integers
        System.out.print("What is ur fav food?");
        scanner.nextLine(); // skips \n from storing into variable food
        String food = scanner.nextLine(); // only accepts integers
        System.out.println("name is " + name + "and age is " + age + "food " + food);

        /**
         * GUI ---> A SIMPLE GUI
         */

        String firstname = JOptionPane.showInputDialog("what is your name");
        // converting returned string to integer
        int yourAge = Integer.parseInt(JOptionPane.showInputDialog("what is your name"));
        JOptionPane.showMessageDialog(null, "Name is " + firstname + " and age is " + yourAge);
    }
}