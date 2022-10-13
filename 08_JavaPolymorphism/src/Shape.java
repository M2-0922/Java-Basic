/*
 * @author kubilaycakmak
 * @date Oct 13, 2022
 * @version 1.0
 */
 
public class Shape {
    
    private String name;
    private int area;

    public Shape(){
    }

    public Shape(String name, int area){
        this.name = name;
        this.area = area;
    }

    public String calculateArea(){
        return "This is the shape area";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
}
