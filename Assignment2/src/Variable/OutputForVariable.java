package Variable;

public class OutputForVariable {
    public static void main(String[] args) {
        // Making object of local variable and using its method
        LocalVariable objlocal = new LocalVariable();
        objlocal.Add();

        //using Instance Variable
        InstanceVariable objInstance = new InstanceVariable();
        objInstance.setName("training");
        System.out.println("I learnt instance variable in "+ objInstance.getName());
    }
}
