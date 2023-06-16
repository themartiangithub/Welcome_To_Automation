package automation_test;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Scrum");
        arrayList.add("Java");
        arrayList.add("Jira");
        arrayList.add("Selenium");
        arrayList.add("Cucumber");
        arrayList.add("Postman");
        arrayList.add("Rest Assured");

        for (String lang : arrayList) {
            System.out.println(lang);
        }
    }
}
