public class NewStudent {
    private String name ;
    private String address;
    private String[] courses;
    private int[] grades;
    private int numCourses;

    private int stuId;
    private static int studentCounter = 1000;

    public NewStudent(){
        this.name = name;
        this.address = address;
        this.courses = new String[30];
        this.grades = new int[100];
        this.numCourses = 0;

        this.stuId = studentCounter;
        studentCounter++;

    }
    public NewStudent(String name , String address){
        this.name = name;
        this.address = address;
        this.courses = new String[30];
        this.grades = new int[100];
        this.numCourses = 0;

        this.stuId = studentCounter;
        studentCounter++;
    }
   public String getName(){
        return name;

   }
   public String getAddress(){
       return address;
   }
   public void setAddress(String address){
        this.address = address;
   }
   public String toString(){
       return name + stuId + address;
   }


   public void printGrades(){
        for (int i = 0 ; i < numCourses ; i++){
            System.out.println(courses[i] + " : " + grades[i]);
        }
   }

   public double getAverageGrade(){
        if ( numCourses == 0 ) return 0;

        int sum = 0;
        for (int i = 0 ; i< numCourses; i++) {
            sum += grades [i];

        }
        return ( double ) sum / numCourses;

   }




}
