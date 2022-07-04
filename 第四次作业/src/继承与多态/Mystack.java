package 继承与多态;

import java.util.ArrayList;

public class Mystack extends ArrayList {

    public Mystack() {
    }
    private ArrayList<Object> list;
    public boolean isEmpty() {
        if(list.size()!=0)
            return false;
        else
            return true;
    }
    public int getSize() {
        return list.size();
    }
    public Object peek() {

        return list.get(getSize()-1);
    }


}