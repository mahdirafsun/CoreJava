package Encapsulation;


public class UseiPhone {

    public static void main(String[] args){
        iPhone iPhone = new iPhone();
        iPhone.setSize(8);
        iPhone.setDesign("Designed by me");

//        iPhone.UseNumber(123);
//        System.out.println(iPhone.UseNumber(123));
        System.out.println(iPhone.getSize());
        System.out.println(iPhone.getDesign());







    }

}
