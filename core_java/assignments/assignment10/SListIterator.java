package assignments.assignment10;

public class SListIterator<T> {
    Node<T> currentLink;
    SListIterator(Node<T> link) {
        currentLink = link;
    }
    public boolean hasNext() {
        return currentLink.next!= null;
    }
    public Node<T> next() {
        currentLink = currentLink.next;
        return currentLink;
    }
    public void insert(T data) {
        currentLink.next = new Node<T>(data, currentLink.next);
        currentLink = currentLink.next;
    }
    public void remove(T data) {
        Node temp;
        while(currentLink.next!=null){
            temp=currentLink;
            currentLink=currentLink.next;
            if(currentLink.data==data){
                temp.next=currentLink.next;
                break;
            }
        }
    }
}
