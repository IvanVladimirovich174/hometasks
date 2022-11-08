package profilemodule.secondhometask.test4;

public class Document {
    public int id;
    public String name;
    public int pageCount;

    public Document(int id, String name, int pageCount) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
