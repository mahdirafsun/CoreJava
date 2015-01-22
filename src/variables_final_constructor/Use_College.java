package variables_final_constructor;


public class Use_College {
    public static void main(String[]args){

        //////////Class College1
        College1 college1 = new College1("laguardia");
        college1.collegeName="city college";
        System.out.println(college1.collegeName);
        System.out.println(college1.collegeLocation);
        college1.collegeStartTime();
        int s = college1.collegeSize(300, 400);
        System.out.println(s);
        /////////////
        College1 college11 = new College1("queens", 9);
        college11.collegeName= "Hunter college";
        System.out.println(college11.collegeName);


        /////////Class Student
        Student student = new Student(250, 150);
        student.howManyStudent = 400;
        System.out.println("how many student" + student.howManyStudent);
        System.out.println("how many boy" + student.howManyBoy);
        student.studentName();
         int a = student.classNumber(3, 6);
        System.out.println("class number" + a);
        ////////////////

        Student student1 = new Student(90);






    }
}
