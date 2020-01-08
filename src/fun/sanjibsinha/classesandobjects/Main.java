package fun.sanjibsinha.classesandobjects;

public class Main {
    static void passPrimitive(int y){
        //invoking this method with a local variable
        //cal this method with its own value
        y = 11;
        System.out.println("Value of y : " + y);
    }
    //passing a reference variable whose value remains undetermined
    //until an object is created
    static void passingObject(Child child){
        //invoking this method with a new instance
        //always references to this object
        // and reflects this value
        child.height = 10;
        System.out.println("Height of child object: " + child.height);
    }

    public static void main(String[] args) {
        //call by value
        int x = 2;
        passPrimitive(x);
        System.out.println("Value of x : " + x);
        System.out.println();
        //a new object created
        Child childOne = new Child();
        childOne.height = 100;
        System.out.println("Height of childOne : " + childOne.height);
        //call by reference
        //the value of the reference variable 'child' is determined now; that is 10
        //the Child object also returns a reference to the memory
        //first childOne points to 100, then to 10
        passingObject(childOne);
        System.out.println("Height of childOne now refers to the previous child object : "
                + childOne.height);
    }

}
