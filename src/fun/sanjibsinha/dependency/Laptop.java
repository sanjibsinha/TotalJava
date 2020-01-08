package fun.sanjibsinha.dependency;

public class Laptop {

    private ConnectionInterface connect;

    public Laptop(ConnectionInterface connect){
        this.connect = connect;
    }

    public void getConneceted(){
        System.out.println("The Laptop is connected through " + connect.getName());
    }
}
