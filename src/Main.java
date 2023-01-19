import module.Children;
import module.Hobbies;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hobbies h1 = new Hobbies("Art", "Long_Term");
        Hobbies h2 = new Hobbies("Sports", "Short_Term");
        Hobbies h3 = new Hobbies("Calligraphy", "Short_Term");
        Hobbies h4 = new Hobbies("Travelling", "Long_Term");

        ArrayList<Hobbies> Indoor = new ArrayList<>();
        ArrayList<Hobbies> Outdoor = new ArrayList<>();
        Indoor.add(h1);
        Indoor.add(h3);
        Outdoor.add(h2);
        Outdoor.add(h4);


        Children c1 = new Children("Add", "eym", 18, Indoor);
        Children c2 = new Children("Ayush", "yjn", 17, Outdoor);

        System.out.println(c1.getfullName());
        c1.getHobby();


    }
}