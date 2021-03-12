package ArrayListAssignment.GetSetArraylist;

import java.util.ArrayList;

public class InstanceArraylist {
    private ArrayList<String> managerName = new ArrayList<String>();

    public void setManagerName(String Name){
        managerName.add(Name);
    }
    public ArrayList<String> getManagerName(){
        return(managerName);
    }

}
