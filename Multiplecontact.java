import java.util.ArrayList;
import java.util.List;
    import java.util.ArrayList;
import java.util.List;
        public class Multiplecontact {
            private List<Contact> contacts;

            public Multiplecontact(){
                contacts =new ArrayList<Contact>();
            }
            public void addContacts(List<Contact> newContacts){
                contacts.addAll(newContacts);
            }

            public static void main(String[] args) {
                Addressbook addressbook =new Addressbook();
                List<Contact> newContacts = new ArrayList<Contact>();
                newContacts.add(new Contact("SUSANTA", "SAMAL","21/3,TARAFDARPARA ROAD","KOLKATA","WEST BENGAL","743128","7978519323","samalsuraj19@gmail.com"));
                newContacts.add(new Contact("ANJALi","SAMAL","21/3,TARAFDAR PARA ROAD AUTHPUR","KOLKATA","WEST BENGAL","743128","7978519323","samalsuraj19@gmail.com");
                addressbook.addContacts(newContacts);

            }

        }
    }

}
