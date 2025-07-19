package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class UseSong {
    public static void main(String[] args) {
        Song song1 = new Song("Waka Waka");
        System.out.println(song1);

        Song song2 = new Song("Jingle Bell", 3.4);
        System.out.println(song2);

        Song song3 = new Song("Animals", 4.5, "Imminence", "Rock");
        System.out.println(song3);

              /*
            ask user about who sings Waka Waka
            Shakira
         */
        System.out.println();
        song1.singer = "Shakira";
        System.out.println(song1);

        System.out.println("#######################################################");
        String str1 = "One";
        String str2 = new String("Two");

        String [] strArr = {str1, str2}; // str1 and Str2 are NON-PRIMITIVE (String)
        // Array holds multiple Strings
        // Array can HOLD NON-PRIMITIVE and PRIMITIVE

        Song [] songArr = {song1, song2, song3}; // storing all Song object in array
        System.out.println(Arrays.toString(songArr));

        // Get me the first Song object from Song array
        // songArr[0] --- > 1st array element which 1st Song
        System.out.println( songArr[0] );


        // How many songs we have in array
        System.out.println("Num of songs: " + songArr.length);


        // Give me all song one by one. (loop through)
        for ( Song eachSong : songArr) {
            System.out.println(eachSong);
        }


        // Get me each Songs name
        for ( Song eachSong : songArr) {
            System.out.println(eachSong.name);
        }


        // get me each song which has length more thant 4
        for ( Song eachSong : songArr) {
            if (eachSong.length > 4){
                System.out.println(eachSong);
            }
        }

        Song song4 = new Song("Apt", 3.5, "Bruno Mars", "Hip Hop");

        // songArr[3] = song4; // ArrayIndexOutOfBoundsException

        System.out.println("#######################################################");
        String word1 = "Hi";
        String word2 = "Bye";
        ArrayList <String> allWords = new ArrayList<>();
        allWords.add(word1);
        allWords.add(word2);
        System.out.println(allWords);


        System.out.println();
        ArrayList <Song> allSongs = new ArrayList<>();
        allSongs.addAll( Arrays.asList( song1, song2, song3) );
        System.out.println(allSongs);

        System.out.println();
        for ( Song each : allSongs) {
            System.out.println(each);
        }

    }
}
