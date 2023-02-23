
        public class Contact {
            String FirstName;
            String Lastname;
            String address;
            String City;
            String State;
            String Zip;
            String Phone;
            String email;

            public  Contact(String FirstName, String LastName, String address, String city, String State, String Zip, String phone, String email) {
                this.FirstName = FirstName;
                this.Lastname = LastName;
                this.address = address;
                this.City = City;
                this.State = State;
                this.Zip = Zip;
                this.Phone = Phone;
                this.email = email;

            }

            public String getFirstName() {
                return FirstName;
            }

            public void setFirstName(String firstName) {
                FirstName = firstName;
            }

            public String getLastname() {
                return Lastname;
            }

            public void setLastname(String lastname) {
                Lastname = lastname;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCity() {
                return City;
            }

            public void setCity(String city) {
                City = city;
            }

            public String getState() {
                return State;
            }

            public void setState(String state) {
                State = state;
            }

            public String getZip() {
                return Zip;
            }

            public void setZip(String zip) {
                Zip = zip;
            }

            public String getPhone() {
                return Phone;
            }

            public void setPhone(String phone) {
                Phone = phone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            @Override
            public String toString() {
                return "Contact{" +
                        "FirstName='" + FirstName + '\'' +
                        ", Lastname='" + Lastname + '\'' +
                        ", address='" + address + '\'' +
                        ", City='" + City + '\'' +
                        ", State='" + State + '\'' +
                        ", Zip='" + Zip + '\'' +
                        ", Phone='" + Phone + '\'' +
                        ", email='" + email + '\'' +
                        '}';
            }

            public static void main(String[] args) {

            }
        }



