package bg.smg;

public class Author implements Cloneable {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public Author() {
        this.name = "";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
