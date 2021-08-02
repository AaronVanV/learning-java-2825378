package constructors;
public class Constructors {

 
    public static void main(String[] args){
        Triangle triangle1= new Triangle(15,3,6,2,3);
        Triangle triangle2= new Triangle(25,4,6,7,1);
        Triangle triangle3= new Triangle(65,6,6,9,4);
        System.out.println(triangle1.findArea());
        System.out.println(triangle2.base);
    }
}
