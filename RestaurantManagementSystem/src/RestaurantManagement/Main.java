package RestaurantManagement;

public class Main {

    public static void main(String[] args) {
        System.out.println("               ||Welcome||             ");
        System.out.println("===================================================\n\n");
        Console.commandMenu();
        String command = Console.inputCommand();
        while (!command.equalsIgnoreCase("exit")) {
            try {
                Console.excuteCommand(command);
            } catch (CommandNotFoundException e) {
                System.out.println("||-Command Not found-||");
            }

            Console.commandMenu();
            command = Console.inputCommand();
        }
    }
}
