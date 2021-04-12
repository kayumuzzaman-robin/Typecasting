package learn.java;

public class Child extends Parent{
    int childVariable;

    public Child() {
//      here is an invisible super() which will call the parent class no arg. constructor by default
        System.out.println("Child class constructor is called");
    }

    public Child(int childVariable) {
        this.childVariable = childVariable;
    }

    public int getChildVariable() {
        return childVariable;
    }

    public void run(){
        System.out.println("Child class run() is called");
    }

    @Override
    public String toString() {
        return "Child{" +
                "parentVariable=" + super.parentVariable + ", " +
                "childVariable=" + childVariable +
                '}';
    }
}
