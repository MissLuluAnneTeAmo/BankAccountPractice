public class Person{

    private String Name,ID, Address, Date_of_Birth, Gender;

    Person(){
        Name = ID = Address = Date_of_Birth = Gender = "";
    }
    Person(String name, String id, String address, String dateOfBirth, String gender){
        Name = name;
        ID = id;
        Date_of_Birth = dateOfBirth;
        Address = address;
        Gender = gender;
    }
    Person(Person P){
        Name = P.Name;
        ID = P.ID;
        Date_of_Birth = P.Date_of_Birth;
        Address = P.Address;
        Gender = P.Gender;
    }


    public Person(String n, String a, String dob, String g) {
        Name = n;
        Address = a;
        Date_of_Birth = dob;
        Gender = g;
    }

    public Person(String n) {
        Name = n;
        Address = Gender = Date_of_Birth = "";
    }

    public void setName(String n){
        Name = n;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String date_of_Birth) {
        Date_of_Birth = date_of_Birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String toString(){
        return "\nID: " + ID +  "\nAddress: " + Address + "\nDATE OF BIRTH: " + Date_of_Birth + "\nGENDER: " + Gender;
    }

    public void setPerson(String name, String id,String address, String date_of_Birth, String gender) {
        Name = name;
        ID = id;
        Address = address;
        Date_of_Birth = date_of_Birth;
        Gender = gender;
    }
}
