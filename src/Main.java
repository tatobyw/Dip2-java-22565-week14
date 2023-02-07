//1.Single Level Inheritance
//2.Multi Level Inheritance
//3.Hierachical Level Inheritance
//4.Multiple Level Inheritance

interface A {
    String hi = "Hi";
    public void methodA();
}

interface Car{
    public void methodCar();
}

class B {
    String name = "Mark ween";
    public void methodB(){
        System.out.println("Method of class B");
    }
}

class C extends B implements A,Car{
    public void methodA(){
        System.out.println(hi + "Method of Interfacce A" + this.name);
    }

    public void methodC(){
        System.out.println("Method of class C");
    }

    public void methodCar(){
        System.out.println("Method of Interface Car");
    }
}

class D extends B implements A, Car{
    public void methodA(){
        System.out.println("Method of Interface A");
    }

    public void methodCar(){
        System.out.println("Method of Interface Car");
    }

    public void methodD(){
        System.out.println("Method of class D");
    }
}
public class Main {
    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();
//        A obj3 = new A();
        obj1.methodA(); //Calling Super Class method
        obj1.methodB(); //Calling Super Class method
        obj1.methodC(); //Calling Super Class method
        obj1.methodCar(); //Calling Super Class method
        obj2.methodCar(); //Calling Super Class method
//        obj3.methodA(); //Calling Super Class method
    }
}
