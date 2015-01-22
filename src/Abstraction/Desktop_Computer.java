package Abstraction;

//Interface-----> Abstract class---Concrete class----main class

public class Desktop_Computer extends Abstract_ElectronicsDevice implements Interface_Computer{

    //extends Abstract_ElectronicsDevice class
    //This method come from abstract class 
    public void buildCamera(){
        System.out.print("This is the abstract class");
    }


    //implements interface
    public void doMath(){

        System.out.println("This is do math in interface");

    }

    public int pitcherSize(){
        int c = 10;
        System.out.println("This is pitcher Size in interface" + c);
        return c;

    }

    public void games(){

        System.out.println("This is games in interface");

    }

    public int mamory(int a){
        int x = a;
        System.out.println("This is mamore in interface" + x);
        return x;
    }

    public int ramSize(int a){
        int size = a;

        System.out.println("This is Concrete class method" + size);
        return size;
    }



}
