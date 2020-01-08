package fun.sanjibsinha.dependency;

public class Cable implements ConnectionInterface {

    private String name = "Cable";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
