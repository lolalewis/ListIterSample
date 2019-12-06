
public class Task {
       
    protected String name;
    protected String description;
    public Task(String n, String d){
      name = n;
      description = d;
        
    }
    
    public final String getDescription(){
        return description;
}
    public final String getName(){
        return name;
    }
    
    public static String setDescription(String description){
        description=description;
        return description;
    }
    public boolean validate(){
        if(name==null || description == null || name.equals("") || description.equals(""))
            return false;
        else
            return true;
        
    }
    public String toString(){
        return "Name: " + name + "\nDecription: " + description + "\n========\n";
    }
}
