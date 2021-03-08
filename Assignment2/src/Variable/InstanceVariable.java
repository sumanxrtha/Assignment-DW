package Variable;

public class InstanceVariable {
    //Instance variable has syntax
    //accessModifier datatype variableName = "value";

    public int a = 5;
    private String name = "deerwalk";

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
