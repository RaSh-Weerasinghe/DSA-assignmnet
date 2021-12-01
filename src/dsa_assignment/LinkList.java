package dsa_assignment;

public class LinkList {
    private Link first;
    
    public LinkList() {
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void displayList(){
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    //insertFirst Method
    public void insertFirst(String data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }
    
}
