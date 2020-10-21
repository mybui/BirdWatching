
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                Bird bird = new Bird(name, latin);
                dictionary.add(bird);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                for (Bird i: dictionary.getList()) {
                    if (i.getName().equals(name)) {
                        i.observe();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
            
            if (command.equals("All")) {
                for (Bird i: dictionary.getList()) {
                    System.out.println(i.getName() + " (" + i.getLatin() + "): " + i.getCount() + " observations");
                }
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                for (Bird i: dictionary.getList()) {
                    if (i.getName().equals(bird)) {
                        System.out.println(i.getName() + " (" + i.getLatin() + "): " + i.getCount() + " observations");
                    }
                }
            }
        }
    }

}
