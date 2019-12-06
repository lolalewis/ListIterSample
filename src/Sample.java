
import java.util.ArrayList;

public class Sample {
 
    public static void main(String[] args) {
      ArrayList<String> list= new ArrayList();
      
      list.add("a"); //got to the end
      list.add("b"); // to end
      list.add(1,"c"); //goto loc 1
      
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.set(1, "e");
        for (String lett : list) {
            System.out.println(lett);
        }
        list.add("f"); //gotoend
        list.remove(2); //get rid of b
        for (String string : list) {
            System.out.println(string); // aef
        }
    }
    
}
