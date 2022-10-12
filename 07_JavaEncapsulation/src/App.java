public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student student = new Student();
        // System.out.println(student.name); // private variable, which we cannot access directly

        System.out.println(student.getName()); // we are using the getters or setters to get or set data.
        
    }
}
