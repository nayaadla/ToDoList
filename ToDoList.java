
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ToDoList {
    public static void showMenu() {
        System.out.println("\n--- TO-DO LIST MENU ---");
        System.out.println("1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Save tasks to file");
        System.out.println("4. Quit");
        System.out.println("----------------------");
    }

    public static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task '" + task + "' added.");
    }

    public static void viewTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\n--- Your To-Do List ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.println("----------------------");
        }
    }

    public static void saveTasksToFile(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter the filename to save your tasks (e.g., 'todo.txt'): ");
        String fileName = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String task : tasks) {
                writer.write(task + "\n");
            }
            writer.close();
            System.out.println("Tasks saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("_________");
        System.out.println("Go Hatters!!");
        System.out.println("Program by: Naya ADLA");
        System.out.println("_________");

        while (true) {
            showMenu();
            System.out.print("Select an option (1-4): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask(tasks, scanner);
                    break;
                case "2":
                    viewTasks(tasks);
                    break;
                case "3":
                    saveTasksToFile(tasks, scanner);
                    break;
                case "4":
                    System.out.println("Quitting the application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
