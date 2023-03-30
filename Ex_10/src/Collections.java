import java.util.ArrayList;
import java.util.Iterator;

public class Collections implements Iterable<Contact> {
   @Override
   public Iterator<Contact> iterator() {
      return myList.iterator();
   }

   private ArrayList<Contact> myList = new ArrayList<>();

   public Collections(ArrayList<Contact> myList) {
      this.myList = myList;
   }

   public Collections() {
   }

   public void addContact(Contact a){
      myList.add(a);
   }
   @Override
   public String toString() {
      return "Collections [myList=" + myList + "]";
   }
   
}
