public class TaskController {
    private TaskManager model;
    private TaskView view;

    public TaskController(TaskManager model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean running = true;
        while (running) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1: // Add a task
                    Task newTask = view.getTaskDetails();
                    model.addTask(newTask);
                    view.displayMessage("Task added successfully!");
                    break;
                case 2: // View tasks
                    view.displayTasks(model.getAllTasks());
                    break;
                case 3: // Mark task as complete
                    String taskName = view.getTaskNameToComplete();
                    if (model.markTaskAsComplete(taskName)) {
                        view.displayMessage("Task marked as complete.");
                    } else {
                        view.displayMessage("Task not found.");
                    }
                    break;
                case 4: // Exit
                    running = false;
                    view.displayMessage("Exiting Task Manager. Goodbye!");
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}