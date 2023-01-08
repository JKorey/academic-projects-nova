package assignment_02;

public class Painter {
    //private String firstName;
    //private String lastName;
    private String name;
    private int height;
    private int rate;

    public Painter(String _firstName, String _lastName, int _rate) {
        name = _firstName + _lastName;
        rate = _rate;
    }

    public Painter(String _name) {
        name = _name;
    }
    public Painter(String _name, int _height) {
        name = _name;
        height = _height;
    }
    public String toString() {
        return "I am " + name + " " + height + " inches tall.";
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }
    public int getHeight() {
        return height;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName( ) {
        return name;
    }
}
