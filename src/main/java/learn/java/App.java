package learn.java;

/**
 * Upcasting & Downcasting
 */
public class App {
    public static void main(String[] args) {
//      Upcasting
        Parent p = new Child();
        p.parentVariable = 10;
//      p.childVariable = 20; Can't access childVariable
        p.run();
        System.out.println(p.toString() + "\n");

//      Child c = new Parent(); Can't cast parent to child implicitly, need to cast explicitly
        
//      this is explicit downcasting
        Child c = (Child) p;
        c.parentVariable = 10;
        c.childVariable = 20;
        c.run();
        System.out.println(c.toString());

    }
}
