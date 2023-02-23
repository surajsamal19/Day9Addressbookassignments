import java.util.List;
import java.util.List;

public class Editcontact {
    public static void main(String[] args) {
        public void EditContactByName(String FirstName, String LastName, Contact newContact) {
            List<Object> contacts = null;
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = (Contact) contacts.get(i);
                if (contact.getFirstName().equals(FirstName) && contact.getLastname().equals(LastName)) {
                    contacts.set(i, newContact);
                    break;
                }
            }

            Addressbook addressbook = new Addressbook();
            Contact contact1 = new Contact("SURAj", "SAMAL", "21/3,tarafdarpara road Authpur", "KOLKATA", "WEST BENGAl", "743128", "7978519323", "samalsuraj19@gmail.com", );
            addressbook.addContact(contact1);
            Contact updatedContact = new Contact("SUSANTA", "SAMAL", "21/3,TARAFDARPARA RAOAD", "KOLKATA", "WEST BENGAL", "743128", "7978519323", "samalsuraj19@gmail.com", );
            addressbook.EditContactByName("SURAJ", "SAMAL", newContact);

        }
    }
}
{
}
