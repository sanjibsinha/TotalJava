package fun.sanjibsinha.dependency;

public class Main {

    public static void main(String[] args) {

        ConnectionInterface cable = new Cable();
        Laptop leno = new Laptop(cable);
        leno.getConneceted();
        ConnectionInterface hotspot = new Hotspot();
        Mobile sam = new Mobile(hotspot);
        sam.getConneceted();
    }
}
