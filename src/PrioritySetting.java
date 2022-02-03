
public class PrioritySetting {
    private int priority;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public void changePriority(int priority)
    {
        System.out.println("Priority changed");
    }
    /*
      changing priority should be a responsibility of the PrioritySettings Class. So moved this function from PrintJob.
      So it Violated Single Responsibility Principle.
      */
}
