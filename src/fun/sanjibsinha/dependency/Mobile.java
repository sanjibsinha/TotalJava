package fun.sanjibsinha.dependency;

public class Mobile {

    private ConnectionInterface connect;

    public Mobile(ConnectionInterface connect){
        this.connect = connect;
    }

    public void getConneceted(){
        System.out.println("The mobile is connected through " + connect.getName());
    }

}
