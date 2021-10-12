package sabloane;

import java.util.ArrayList;

public class Chapter {
    ArrayList<SubChapter> SC = new ArrayList<SubChapter>();
    String name;
    public Chapter(ArrayList<SubChapter> SC,String name)
    {
        this.SC = SC;
        this.name=name;
    }
    public Chapter(String name)
    {
        this.name = name;
    }

    public int createSubChapter(String title)
    {
        SubChapter x = new SubChapter(title);
        this.SC.add(x);
        return this.SC.indexOf(x);
    }
    public SubChapter getSubChapter(int index)
    {
        return this.SC.get(index);
    }
    public void print()
    {
        System.out.println("  Chapter"+this.name);
        for(SubChapter sc : SC)
        {
            sc.print();
        }
    }
}
