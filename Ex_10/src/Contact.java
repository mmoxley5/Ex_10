/*Create a class to store contact information consisting 
of a name and email address. Additionally, create a class to
store a collection of contacts that implements the Iterable
interface so that a for-each loop can be used with the the
collection class. Demonstrate this functionality with a 
for-each loop in the Main.main() method that displays 
contact information.

 */
public class Contact{
   public Contact(String name, String email) {
      this.name = name;
      this.email = email;
   }
   String name;
   String email;
   @Override
   public String toString() {
      return "Contact [name=" + name + ", email=" + email + "]";
   }
   
   
   
}