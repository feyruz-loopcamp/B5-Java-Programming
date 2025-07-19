package day33_a_static;
// Custom Class - Template/Blueprint how each object of this class will behave
public class Song {
    // MEMBERS of class
    //  1 - INSTANCE MEMBERS
    //      1 - Instance var x 4
    //  2 - Constructor

    // INSTANCE var - each object will have its own version/copy of these
    String name;
    double length;
    String singer;
    String genre;


    // CONSTRUCTOR - which initializes "name"
    public Song (String name) {
        // name = name; // If LOCAL and INSTANCE vars have same name, compiler prioritizes LOCAL over INSTANCE
        this.name = name; // this. -- makes the difference between LOCAL and INSTANCE
    }

    // CONSTRUCTOR OVERLOADING
    // CONSTRUCTOR - which initializes "name", "length"
    public Song (String name, double length) {
        //this.name = name;
        this(name);  // Always in the first line
        this.length = length;
    }



    // CONSTRUCTOR OVERLOADING
    // CONSTRUCTOR - which initializes "name", "length", "singer", "genre"
    public Song (String name, double length, String singer, String genre) {
        //this.name = name;
        //this(name);
        //this.length = length;
        this(name, length);
        this.singer = singer;
        this.genre = genre;
    }


    // If we have not declared toString method, printing object will show only memory location. If we have declared it, it will show in exact way that we built that method
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
