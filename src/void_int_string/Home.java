package void_int_string;

public class Home {

    String ownerName = "";
    public String getHomeOwnerName(String ownerName){

        this.ownerName=ownerName;
        return ownerName;

    }


    public void room(){
        System.out.println("This is my room");

    }

    public int howManyRoom(int firsFl, int secondFl){
      int total = 0;
         total = firsFl + secondFl;
        return total;


    }
}
