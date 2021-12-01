package dsa_assignment;

public class Link {
    public String iData; // data item
    public Link next; // reference to the next link
    
    public Link (String id) {// constructor
        iData = id;
        next = null;
    }
    
    public void displayLink(){
        System.out.println(iData);
    }
}
