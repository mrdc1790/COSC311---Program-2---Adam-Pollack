public class DatabaseRecord {
    private String firstName;
    private String lastName;
    private String ID;

    public DatabaseRecord(String firstName, String lastName, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public DatabaseRecord(){ //find a way to cut this out
        this("", "","");
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getID(){
        return ID;
    }

    public String toString(){
        return firstName + " " + lastName + " " + ID;
    }
}
