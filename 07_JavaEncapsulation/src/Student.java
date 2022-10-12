/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
public class Student extends School{
    
    private String name;
    private String surname;
    private int age;

    public Student(){}

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String showInfo() {
        return "Student [schoolName= " + super.getName() + "school address: " + super.getAddress() + " name=" + name + ", surname=" + surname + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 5){
            this.name = "Not supported";
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
}
