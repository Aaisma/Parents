package module;

import java.util.ArrayList;

public class Children extends Parents{

    protected String child_name;
    private int child_age;
    private String level;
    ArrayList<Hobbies> hobby;

    public String getChild_name() {
        return child_name;
    }

    public void setChild_name(String child_name) {
        this.child_name = child_name;
    }

    public int getChild_age() {
        return child_age;
    }

    public void setChild_age(int child_age) {
        this.child_age = child_age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setHobby(ArrayList<Hobbies> hobby) {
        this.hobby = hobby;
    }

    public Children(String family_name, String house_address, String child_name, int child_age, String level, ArrayList<Hobbies> hobby) {
        super(family_name, house_address);
        this.child_name = child_name;
        this.child_age = child_age;
        this.level = level;
        this.hobby = hobby;
    }


    public void getfullname() {
        String full_name = this.child_name + this.family_name;
        System.out.println("My full name is " + full_name);
    }
    public void getHobby() {
        ArrayList<Hobbies> hobby = this.hobby;
        for (Hobbies yourhobby: hobby) {
            System.out.println("My Hobby is: "+ yourhobby.getHobby_name());
        }

        System.out.println("I live in " + this.house_address + ".");
    }
}




