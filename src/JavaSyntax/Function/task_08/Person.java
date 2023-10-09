package JavaSyntax.Function.task_08;

public class Person {
    private String firsName;
    private String lastName;

    public Person(String firsName, String lastName){
        this.firsName = firsName;
        this.lastName = lastName;
    }

    protected String getFirsName(){
        return firsName;
    }
    String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return firsName + " " + lastName;
    }
}
