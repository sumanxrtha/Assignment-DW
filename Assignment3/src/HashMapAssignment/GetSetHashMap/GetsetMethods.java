package HashMapAssignment.GetSetHashMap;

import java.util.HashMap;

public class GetsetMethods {
    private HashMap<Integer, String> empName = new HashMap<Integer, String>();

    public void setEmpName(Integer empid, String name ){
        empName.put(empid, name);
    }
    public HashMap<Integer, String> getEmpName(){
        return empName;
    }
}
