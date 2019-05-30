import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Parent {
    //public void sayHello();
    //public String WelcomeStudent(String name);
    int add(int a, int b);
}

public class Lambda1 {
    public static void main(String[] args) {
        //Parent p1= () -> System.out.println("Say Hello ");
        //parantheses not mandatory for lambda in case of single parameter
        //Parent p2= name -> {return "Welcome Student " + name;};
        //p1.sayHello();
        // System.out.println(p2.WelcomeStudent("Kiru"));
        //can omit return keyword if there is only one statement in lambda expression
        Parent p3 = (a,b)->{return a+b;};
        System.out.println(p3.add(4,87));
        List<String> students = new ArrayList<String>();
        students.add("Anil");
        students.add("Babu");
        students.add("Zenia");
        students.forEach( n -> System.out.println(n));
    }
}
