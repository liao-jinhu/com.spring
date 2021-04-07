package liao2018131331.spring.teacherProject;

public class Teacher {
    private String Tusername;
    private int  Tnum;
    private int  age;
    private String telephone;

    public Teacher(String tusername, int tnum, int age, String telephone) {
        super();
        this.Tusername = tusername;
        this.Tnum = tnum;
        this.age = age;
        this.telephone = telephone;
    }

    public Teacher() {
    }

    public String getTusername() {
        return Tusername;
    }

    public void setTusername(String tusername) {
        Tusername = tusername;
    }

    public int getTnum() {
        return Tnum;
    }

    public void setTnum(int tnum) {
        Tnum = tnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Tusername='" + Tusername + '\'' +
                ", Tnum=" + Tnum +
                ", age=" + age +
                ", telephone=" + telephone +
                '}';
    }


}
