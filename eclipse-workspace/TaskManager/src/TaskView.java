import java.util.Scanner;
import java.util.ArrayList;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println("\n===== Task Manager Menu =====");
        System.out.println("1. Add a Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public Task getTaskDetails() {
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task priority (1-5): ");
        int priority = scanner.nextInt();
        return new Task(name, priority);
    }

    public String getTaskNameToComplete() {
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter the name of the task to mark as complete: ");
        return scanner.nextLine();
    }

    public void displayTasks(ArrayList<Task> tasks) {
        System.out.println("\n===== Task List =====");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}