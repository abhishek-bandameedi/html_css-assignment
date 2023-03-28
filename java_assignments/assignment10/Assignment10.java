package assignments.assignment10;

public class Assignment10 {
    public static void main(String[] args) {
        SList<Integer> list=new SList<Integer>();
        SListIterator<Integer> slist= list.iterator();

        System.out.println(list);
        slist.insert(11);
        slist.insert(25);
        slist.insert(31);
        slist.insert(37);
        System.out.println(list);
        slist=list.iterator();
        slist.remove(31);
        System.out.println(list);
    }
}
