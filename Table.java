package sabloane;

public class Table {
    String title;

    public Table(String title)
    {
        this.title = title;
    }
    public void print()
    {
        System.out.println("    table: "+this.title);
    }
}
