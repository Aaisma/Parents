package module;

import java.util.ArrayList;

public class Hobbies extends Parents{

    String hobby_name;
    String type;

    public Hobbies(String family_name, String house_address, String hobby_name, String type) {
        super(family_name, house_address);
        this.hobby_name = hobby_name;
        this.type = type;
    }
    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}