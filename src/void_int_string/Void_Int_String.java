package void_int_string;



public class Void_Int_String {

    public static void main(String[]args){

        Home home = new Home();
        String ownerName=home.getHomeOwnerName("salah");
        System.out.println(ownerName);

        home.room();
       int st = home.howManyRoom(2, 3);
        System.out.println(st);


    }
}
