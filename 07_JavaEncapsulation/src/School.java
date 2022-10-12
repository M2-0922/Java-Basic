/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
public class School {

    // Attributes, Variables, Global Variables, Fields
    private int id;
    private String name;
    private String address;
    private int numberOfStudents;

    // Default Constructor
    public School(){}

    // Parameterized Constructor
    public School(String name, String address, int numberOfStudents){
        this.name = name;
        this.address = address;
        this.numberOfStudents = numberOfStudents;
    }

    
    // getter and setter methods
    public String showInfo() {
        return "School [name=" + name + ", address=" + address + ", numberOfStudents=" + numberOfStudents + "]";
    }

    public String getName() {
        if(name.length() < 5){
            return "false";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    

    
}
