public class Task {
    private String name;
    private int priority; // 1 (High) to 5 (Low)
    private boolean isComplete;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.isComplete = false;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        this.isComplete = true;
    }

    public String toString() {
        return "[Task: " + name + ", Priority: " + priority + ", Status: " 
               + (isComplete ? "Complete" : "Incomplete") + "]";
    }
}