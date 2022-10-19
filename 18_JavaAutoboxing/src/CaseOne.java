class CaseOne {
    public static void main(String[] args) {
        
        int a = 5;
        myMethod(a); // passed int a (primitive data type)
        // autoboxing.
    }

    public static void myMethod(Integer i){
        // compiler automatically converts it to the Integer wrapper class.
        System.out.println(i);
    }
}