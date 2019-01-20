package kaifazhidao.ch03;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -54564564545464l;

    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
