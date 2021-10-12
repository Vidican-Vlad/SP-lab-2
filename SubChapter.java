package sabloane;

import java.util.ArrayList;

public class SubChapter {
    ArrayList<Paragraph> P = new ArrayList<Paragraph>();
    ArrayList<Table> T = new ArrayList<Table>();
    ArrayList<Image> I = new ArrayList<Image>();
    String name;
    public SubChapter( ArrayList<Paragraph> P,ArrayList<Table> T,rrayList<Image> I,String name)
    {
        this.P=P;
        this.T=T;
        this.I=I;
        this.name=name;
    }
    public SubChapter(String name)
    {
        this.name = name;
    }
    public void createNewParagraph(String title)
    {
        P.add(new Paragraph(title));
    }
    public void createNewImage(String title)
    {
        I.add(new Image(title));
    }
    public void createNewTable(String title)
    {
        T.add(new Image(title));
    }
    public void print()
    {
        System.out.println("   Subchapter: "+this.name);
        for(Paragraph p : P)
        {
            p.print();
        }
        for(Table t : T)
        {
            t.print();
        }
        for(Image i : I)
        {
            i.print();
        }
    }
}
