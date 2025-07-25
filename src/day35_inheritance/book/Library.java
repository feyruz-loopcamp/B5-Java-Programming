package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        AudioBook ab1 = new AudioBook();
        // ab1 has 9 instance var access: 7 from parent + 2 itself
        //ab1.authorName = "Samuel Nguyen";
        //ab1.authorAge = 30;

        ab1.author = new Author("Tom Jerry", 5);//  -- > Author author =  new Author("Tom Jerry", 5);
        ab1.genre = "Education";
        ab1.title = "Java is King";
        ab1.chapterCount = 10;
        ab1.price = 20.99;
        ab1.hasMovie = false;
        ab1.duration = 2.5;
        ab1.narrator = "Morgan Freeman";

        // ab1 had 1 instance method access: 1 from itself
        ab1.listen();

        System.out.println("-----------------");
        EBook ebook1 = new EBook();
        // ebook1 has 9 instance var access: 7 from parent + 2 from itself
//        ebook1.authorName = "Charlotte Bronte";
//        ebook1.authorAge = 40;
        ebook1.author = new Author("K L", 38);
        ebook1.genre = "Romance";
        ebook1.title = "Jane Eyre";
        ebook1.chapterCount = 38 ;
        ebook1.price = 8;
        ebook1.hasMovie = true;
        ebook1.size = 5;
        ebook1.pages = 200;
        ebook1.read();

        System.out.println("-----------------");
        Book b1 = new Book();
        //b has 7 instance var access: 7 from itself
        b1.author = new Author("James Bond", 60);
        // Assign gender for author of b1 book
        b1.author.gender = "Female";
        // Get me the gender for author of b1 book

        Book b2 = new Book();
        //b has 7 instance var access: 7 from itself
        b2.author = new Author("K B", 70);
        // Assign gender for author of b2 book
        b2.author.gender = "Female";
        // Get me the gender for author of b2 book'

        //b2.author.name = ""

        System.out.println("-----------------");
        Author a1 = new Author("Tom Jerry", 5);
        System.out.println(a1);
        // Assign gender for a1 Author
        a1.gender = "Male";
        // Get me the gender for a1 Author
        System.out.println(a1.gender);



        System.out.println("-----------------");
        Author a2 = new Author("J P", 15);
        System.out.println(a2);
        // Assign gender for a2 Author
        a2.gender = "Male";
        // Get me the gender for a2 Author
        System.out.println(a2.gender);



    }
}
