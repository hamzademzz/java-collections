package List.question3;

import java.util.ArrayList;
import java.util.List;

public class QList3Impl implements QList3 {

    private List<String> colors=new ArrayList<String>();

    public void addAtIndex0(String s) {
        colors.add(0, s);
    }

    public String getFirst(){
        return colors.get(0);
    }







}
