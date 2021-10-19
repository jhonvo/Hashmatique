import java.util.HashMap;
import java.util.Set;


public class Hash{

public static void main(String[] args) {
    HashMap<String, String> hashMatique = new HashMap<String, String>();
    hashMatique.put("Song Title 1","These are the lirycs for Song Title 1");
    hashMatique.put("Song Title 2","These are the lirycs for Song Title 2");
    hashMatique.put("Song Title 3","These are the lirycs for Song Title 3");
    hashMatique.put("Song Title 4","These are the lirycs for Song Title 4");

    String name = hashMatique.get("Song Title 1");
    System.out.println(name);

    Set<String> keys = hashMatique.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(hashMatique.get(key));    
        }

    }


}
