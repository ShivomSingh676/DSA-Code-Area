public class Inheritance {
    public static void main(String[]args)
    {
        Vehicle obj1=new Car();
        obj1.print();
        Vehicle obj2=new Vehicle();
        obj2.print();
        // Car obj3=(Car) new Vehicle();
        // obj3.print();
    }
}
class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(Car)");
    }
}