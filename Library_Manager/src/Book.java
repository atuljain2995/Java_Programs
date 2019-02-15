public class Book implements printer{
    protected String title,author;
    protected int YearOfPublication;

    public Book(String t,String a,int y){
        this.title = t;
        this.author = a;
        this.YearOfPublication = y;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYOP(){
        return YearOfPublication;
    }

    public void print(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Year Of Publication: "+ YearOfPublication);
    }



}
