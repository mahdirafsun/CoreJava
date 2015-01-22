package Abstraction;
//Abstraction is implementation hiding.
//Interface-----> Abstract class---Concrete class----main class

public class Use_Computer {

    public static void main(String[] args){
        Interface_Computer interfaceComputer = new Desktop_Computer();
        interfaceComputer.pitcherSize();
        interfaceComputer.doMath();
        interfaceComputer.games();
        interfaceComputer.mamory(8);

        System.out.println("----------------------");

        Abstract_ElectronicsDevice abstractElectronicsDevice = new Desktop_Computer();
        abstractElectronicsDevice.buildCamera();
        abstractElectronicsDevice.runBYElectron();

        System.out.println("----------------------");

        Desktop_Computer desktopComputer = new Desktop_Computer();
        desktopComputer.pitcherSize();
        desktopComputer.doMath();
        desktopComputer.games();
        desktopComputer.mamory(10);

        desktopComputer.buildCamera();
        desktopComputer.runBYElectron();

        desktopComputer.ramSize(4);


    }















    }




