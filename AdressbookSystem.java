
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

        public class Addressbooksystem {
            public class AddressBookSystem {
                private Map<String,Addressbook> addressbooks;
                public AddressBookSystem(){
                    addressbooks =new HashMap<String, Addressbook>();

                }

                public void addressbook(String name){
                    if(addressbooks.containsKey(name)){
                        System.out.println("Addressbook With the Name" +name+ "Already Exists");
                        return;
                    }
                    addressbooks.put(name,new Addressbook());

                }
                public Addressbook getAddressbook(String name){
                    return addressbooks.get(name);
                }


                public static void main(String[] args) {
                    AddressBookSystem addressBookSystem=new AddressBookSystem();
                    Scanner sc= new Scanner(System.in);
                    while (true) {
                        System.out.println("Enter a command(add,list,quit): ");
                        String command=Scanner.nextLine();

                    } if (command.equalsIgnoreCase("add")) {
                        System.out.print("Enter the name of the new address book: ");
                        String name = scanner.nextLine();
                        addressBookSystem.addAddressBook(name);
                    } else if (command.equalsIgnoreCase("list")) {
                        System.out.println("List of address books:");
                        for (String name : addressBookSystem.addressBooks.keySet()) {
                            System.out.println("- " + name);
                        }
                    } else if (command.equalsIgnoreCase("quit")) {
                        break;
                    } else {
                        System.out.println("Invalid command.");




                    }
}
