package DataModel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDescription;
    private String details;
    private LocalDate DL;
    
    public TodoItem(String shortDescription, String details, LocalDate DL) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.DL = DL;
    }
    
    @Override
    public String toString() {
        return shortDescription;
    }
    
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    
    public void setDL(LocalDate DL) {
        this.DL = DL;
    }
    
    public String getShortDescription() {
        return shortDescription;
    }
    
    public String getDetails() {
        return details;
    }
    
    public LocalDate getDL() {
        return DL;
    }
}
