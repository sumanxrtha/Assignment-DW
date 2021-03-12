package HashSetAssignment.GetSetHash;

import java.util.HashSet;

public class GetterAndSetter {
    private HashSet<Integer> set = new HashSet<Integer>();

    public HashSet<Integer> getSet() {
        return set;
    }
    public void setSet(int num){
        set.add(num);
    }

}
