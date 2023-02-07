//1.Single Level Inheritance
//2.Multi Level Inheritance
//3.Hierarchical Level Inheritance
//4.Multiple Level Inheritance
interface Car{
    public void methodCar();
}
interface Cat{
    public void methodCat();
}
interface A{
    public String hi = "Hi";
    public void methodA();
}
class B{
    String name = "Mark Zuckerberg";
    public void methodB(){
        System.out.println("method of class B");
    }
}

class C extends B implements A, Car{
    public void methodA(){
        System.out.println(hi + " method of Interface A " + this.name);
    }
    public void methodCar(){
        System.out.println("method of Interface Car");
    }
    public void methodC(){
        System.out.println("method of class C");
    }
}

class D extends B implements Cat{
    public void methodCat(){
        System.out.println("method of Interface Cat");
    }
    public void methodD(){
        System.out.println("method of class D");
    }
}

public class Main{
    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();
        obj1.methodA();//calling super class method
        obj1.methodB();//
        obj1.methodC();//
        obj1.methodCar();//
        obj2.methodD();//calling super class method
    }
}