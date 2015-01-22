package Abstraction;

//Interface-----> Abstract class---Concrete class----main class

public abstract class Abstract_ElectronicsDevice {

    // abstract can  declare only abstract method , can't implement abstract method
    public abstract void buildCamera();


    // but other method can implement

    public void runBYElectron(){

        System.out.println("This is my abstract class");
    }


}
