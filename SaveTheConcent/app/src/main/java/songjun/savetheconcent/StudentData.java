package songjun.savetheconcent;

/**
 * Created by songjun on 2015. 9. 25..
 */
public class StudentData {
    String title, des;
    public StudentData(String title, String description){
        this.title =title;
        this.des = description;
    }
    public String getTitle(){
        return title;
    }
    public String getDes(){
        return des;
    }
}