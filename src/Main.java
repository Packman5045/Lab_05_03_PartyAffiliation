public class Main {
    public static void main(String[] args)
    {
        String menuChoice = "";
        String menu = "D - Democratic R - Republican I - Independent O - Other"; // (DRIO)
        //display the menu
        System.out.println(menu);
        //input menu choice
        menuChoice = "t";
        menuChoice = menuChoice.toUpperCase();

        switch(menuChoice)
        {
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get an Independent Person.");
                break;
            case "O":
                System.out.println("You get Other.");
                break;
            default:
                System.out.println("That is not a valid option.");

        }

        }

    }
