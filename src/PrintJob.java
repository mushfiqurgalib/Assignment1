
import java.util.Queue;


public class PrintJob {
    private Queue printRequests; 

    public PrintJob(Queue printRequests) {
        this.printRequests = printRequests;
    }
    
    public void pullJob(){
    System.out.println("Job pulled");
    }
    
     // public void changePriority(){
    //System.out.println("Prioriy changed");
    //}
    
    /* change priority should be responsiblity of priority setting.It violated single responsibility principle*/
}
