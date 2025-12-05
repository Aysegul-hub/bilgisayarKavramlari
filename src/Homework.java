import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework {
    protected String courseName ;
    protected String description ;
    protected Date dueDate ;


    public  Homework( String courseName , String description , Date dueDate) {
        this.courseName = courseName;
        this.description = description;
        this.dueDate = dueDate;

    }
    public String getFormattedDueDate () {
        SimpleDateFormat sdf = new SimpleDateFormat("dd . MM . yyyy HH: mm");
        return sdf.format(dueDate);

    }
    public void printInfo(){
        System.out.println("Course Name : " + courseName);
        System.out.println("Description : "+ description);
        System.out.println("Due Date : " + getFormattedDueDate());

    }




}
