

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Contact number1 = new Contact("Aria","aruthere.gmail");
        Collections myas = new Collections();
        myas.addContact(number1);
        System.out.println("Myas contacts...");
        for(Contact a: myas){
            System.out.println(a);
        }





    }
}