package fun.sanjibsinha.dependency;

public class Wifi implements ConnectionInterface {

    private String name = "Wifi";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
