package List.question1;

public class QList1App {
    public static void main(String args[]){
        QList1 q=new QList1Impl();
        q.add("Red");
        System.out.println(q.getLast());



    }
}
