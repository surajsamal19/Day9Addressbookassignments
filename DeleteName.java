import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;

    public class DeleteName {
        public static void main(String[] args) {
            Addressbook addressbook = new Addressbook();
            Contact contact1 = new Contact("SURAJ", "SAMAL", "21/3,ATARAFDAR PAAR ROAD", "KOLKATA", "WEST BENGAL", "743128", "7978519323", "samalsuraj19@gmail.com");
            addressbook.addContact(contact1);
            Contact contact2 = new Contact("SURAJ", "SAMAL", "21/3,TARAFDARPARA ROAD<AUTHPUR", "KOLKATA", "WEST BENGAL", "743128", "7978519323", "samalsuraj19@gmail.com");
            addressbook.addContact(contact2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first name of the conatct you want to delelte: ");
            String FirstName = sc.nextLine();
            System.out.println();
            public void deletecontactbyname (String firstName, String lastName){
                LinkedList<contact> contacts;
                for (int i = 0; i < contacts.size(); i++) {
                    Contact contacts = contacts.get(i);
                    if (contact.getFirstName().equals(FirstName) && contact.getLastName().equals(lastname)) {
                        contacts.remove(i);
                        break;
                    }
                }
            }
        }


    }

