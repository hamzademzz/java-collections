package List.question1;

import java.util.ArrayList;
import java.util.List;

public class QList1Impl implements QList1{
    private List<String> values=new ArrayList<String>();
    public void add(String s) {
        values.add(s);
    }

    public String getLast(){
        return values.get(values.size()-1);
    }

}
