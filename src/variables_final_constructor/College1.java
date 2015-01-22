package variables_final_constructor;


public class College1 {
    //Variables
    static String collegeName;
    final String collegeLocation= "queens";



    //Constructor
    public College1(String nameCollege){

        System.out.println(nameCollege);
    }

    public College1(String nameCollege, int startTime ){
        System.out.println(nameCollege + " "+ startTime);

    }



    //Method
    public static void collegeStartTime(){
        System.out.println("Start time is 8am");
        teacherName();
    }


    public int collegeSize(int x, int y){
        int total = x + y;
        return total;
    }


    private static void teacherName(){
        System.out.println("John");
    }
}
