package sabloane;

import java.util.ArrayList;

public class Book{
    ArrayList<Author> authors = new ArrayList<Author>();
    String title;
    ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    Content content;
    

    public void addAuthor(String name)
    {
        this.authors.add(new Author(name));
    }
    public ArrayList<Author> getAuthors()
    {
        return this.authors();
    }
    public int createChapter(String title)
    {
        Chapter X = new Chapter(title);
        this.chapters.add(X);
        return this.chapters.indexOf(X);
    }
    public Chapter getChapter(int index)
    {
        return this.chapters.get(index);
    }
    public void print()
    {
        System.out.println(this.title);
        this.author.print();
        this.content.print();
        for(Chapter c : chapters)
        {
            c.print();
        }
    }
}