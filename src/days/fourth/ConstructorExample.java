package days.fourth;

/**
 * Created by andriusbaltrunas on 7/17/2018.
 */
public class ConstructorExample {

    public ConstructorExample(){
        this(4);
    }

    public ConstructorExample(int a){
        System.out.println(a);
        printData();
    }

    private void printData(){
        System.out.println("Sveiki");
    }
}
