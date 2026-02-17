//Java Programme implementing class Shape
//LOGIC:
//  Create a class for circle shape, have accessible radius and area,
//  a private attribute name, implementing getter() and setter().

//Creating class Circle
class Circle{
    //Attributes
    public double radius;
    private String name;
    public double area;

    //Parametrized Constructor
    Circle(double radius){
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        System.out.println("Created new Circle object");
    }

    //Setter method for private attribute
    public void nameSetter(String name){
        this.name = name;
    }
    
    //Getter method for private attribute
    public String nameGetter(){
        return name;
    }
}

//Main class
public class Shapes{
    public static void main(String args[]){
        System.out.println("Welcome to Shapes");
        
        //Instantiating new object of class circle
        Circle circleA = new Circle(10.0);
        //Accessing public attribute
        System.out.println("Area of circleA : " + circleA.area);

        circleA.nameSetter("Orange");                                                       //=>Setter Function call
        System.out.println("The Private attribute(Name) : " + circleA.nameGetter());        //=>Getter Function call
        
        //For Space
        System.out.println();

        //Instantiating another object
        Circle circleB = new Circle(5.7);
        System.out.println("Area of circleB : " + circleB.area);

        circleB.nameSetter("BlueSlice");
        System.out.println("The Private attribute(Name) : " + circleB.nameGetter());

    }

}

