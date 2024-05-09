import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Record{
    int EID;
    String Ename;
    int Esalary;
    public Record(int EID,String Ename, int Esalary){
        this.EID = EID;
        this.Ename = Ename;
        this.Esalary = Esalary;
    }
}
public class Records {
    public static void main(String[] args) {
        List<Record> empList = new ArrayList<Record>();
        empList.add(new Record(1, "Amit", 30000));
        empList.add(new Record(2, "Anand", 40000));
        empList.add(new Record(3, "Divyanshu", 50000));
        empList.add(new Record(4, "Sakshi", 20000));

        List<Integer>salList=empList.stream().filter(e->e.Esalary>30000).map(m->m.Esalary).collect(Collectors.toList());
        System.out.println(salList);

    }
    
}
