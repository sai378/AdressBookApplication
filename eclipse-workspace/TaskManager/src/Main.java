public class Main {
    public static void main(String[] args) {
        System.out.println("Task Manager Application Started");
        TaskManager model = new TaskManager();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        controller.run();
    }
}