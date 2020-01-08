package fun.sanjibsinha;

class OuterClass{

    public int x = 0;

    class InnerClass{

        public int x = 10;

        public void displayNumber(int x){
            this.x = x;
            System.out.println(x);
        }
    }

}

public class OuterAndInnerClass {

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerClass = outerObject.new InnerClass();
        System.out.println(outerObject.x);
        System.out.println(innerClass.x);
        innerClass.displayNumber(23);
    }

}
