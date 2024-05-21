package cn.com.mybatis.po;

public class ChosenCourseDetail {
    private int id;//id
    private int course_id;//课程编号
    private String course_name;//课程名
    private String course_nature;//课程性质
    private String course_term;//开课学期
    private int course_hour;//学时
    private int credit;//学分

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_nature() {
        return course_nature;
    }

    public void setCourse_nature(String course_nature) {
        this.course_nature = course_nature;
    }

    public String getCourse_term() {
        return course_term;
    }

    public void setCourse_term(String course_term) {
        this.course_term = course_term;
    }

    public int getCourse_hour() {
        return course_hour;
    }

    public void setCourse_hour(int course_hour) {
        this.course_hour = course_hour;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}