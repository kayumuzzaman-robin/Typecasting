package learn.java;

public class Parent {
    int parentVariable;

    public Parent() {
        System.out.println("Parent class constructor is called");
    }

    public Parent(int parentVariable) {
        this.parentVariable = parentVariable;
    }

    public int getParentVariable() {
        return parentVariable;
    }

    public void run(){
        System.out.println("Parent class run() is called");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentVariable=" + parentVariable +
                '}';
    }
}
