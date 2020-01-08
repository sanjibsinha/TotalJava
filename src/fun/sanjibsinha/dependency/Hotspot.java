package fun.sanjibsinha.dependency;

public class Hotspot implements ConnectionInterface {

    private String name = "Hotspot";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
