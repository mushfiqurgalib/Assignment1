
public class PrintRequest {
    private Document document;
//    private TonerSaveMode tonerSaveMode;
//    private PageSaveMode pageSaveMode;
//    private BoosterMode boosterMode;
    
    private PrintMode mode; 
//    instead of taking a variable for each of the mode, we can take a generic
//    PrintMode type variable
    
    private PrioritySetting prioritySetting;
    
//    priority should be an entity of PrintRequest since we need to take care of the
//    priority for each of the PrintRequest

    public PrintRequest(Document document, PrintMode mode, PrioritySetting prioritySetting) {
        this.document = document;
        this.mode = mode;
        this.prioritySetting = prioritySetting;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public PrintMode getMode() {
        return mode;
    }

    public void setMode(PrintMode mode) {
        this.mode = mode;
    }

    public PrioritySetting getPrioritySetting() {
        return prioritySetting;
    }

    public void setPrioritySetting(PrioritySetting prioritySetting) {
        this.prioritySetting = prioritySetting;
    }
    
}
