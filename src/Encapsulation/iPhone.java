package Encapsulation;

//Encapsulation:      data hiding
public class iPhone {

    private int size;

    private String design = "";


    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }


    public String getDesign(){
        return design;
    }

    public void setDesign(String design){
        this.design = design;
    }

    private void PhoneNumber(int num){

    }
    public void UseNumber(int num){
        PhoneNumber(123);
    }



}
