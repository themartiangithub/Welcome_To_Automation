package automation_test;

public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTime){
        for(int i = 0; i<howManyTime;i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Yagnik", 10);
        obj.printMyName("Yagnik", 15);
    }
}
