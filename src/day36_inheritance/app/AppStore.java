package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {
        Instagram instagram = new Instagram(  2.3);
        Instagram instagram2 = new Instagram( 2.6);


        System.out.println(instagram.name);
        System.out.println(instagram.version);
        instagram.postPicture();
        System.out.println(instagram2.name);
        System.out.println(instagram2.version);
        instagram2.postPicture();
        /*
            Object Reference "instagram" has access
                - to itself members
                - parent members
         */
        //instagram.watch();

        System.out.println();
        YouTube youTube = new YouTube(4.0);
        System.out.println(youTube.name);
        System.out.println(youTube.version);
        youTube.watch();
        //youTube.postPicture();
        /*
            Object Reference "youTube" has access
                - to itself members
                - parent members
         */


    }
}
