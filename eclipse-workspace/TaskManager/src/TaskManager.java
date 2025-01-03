import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public ArrayList<Task> getAllTasks() {
        return taskList;
    }

    public boolean markTaskAsComplete(String taskName) {
        for (Task task : taskList) {
            if (task.getName().equalsIgnoreCase(taskName)) {
                task.markComplete();
                return true;
            }
        }
        return false;
    }
}