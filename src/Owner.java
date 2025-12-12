import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Owner {

    private String name;
    private String phoneNo; // UML’de int görünüyordu; pratik olduğu için String kullandım
    private Date date;

    public Owner(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.date = new Date(); // oluşturulduğu anki tarih
    }

    // Getters
    public String getName() { return name; }
    public String getPhoneNo() { return phoneNo; }
    public Date getDate() { return date; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public void setDate(Date date) { this.date = date; }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Owner{name='" + name + "', phoneNo='" + phoneNo + "', date=" + sdf.format(date) + "}";
    }
}







