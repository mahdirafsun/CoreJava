package variables_final_constructor;


public class Student {

    //Variable
    static int howManyStudent;
    final static int howManyBoy = 200;

    //Constructor
    public  Student(int boy, int girl){
        System.out.println( boy + girl);
    }

    public Student(int other){
        System.out.println("other student" + other);
    }

    //Method

    public  void studentName(){
        System.out.println("student name- salah");
        teacherName();
    }

    private void teacherName(){
        System.out.println("teacher name John Carry");
    }

    public int classNumber(int x, int y){
        int total = 0;
        total = y;
        return total;

    }
}
