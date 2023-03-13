import File.CollectionManager;
import File.FileRead;
import File.Home;

public class Main {
    public static void main(String[] args) {
        Boolean letgo = false;
        if(args.length == 0) {
            System.out.println("Hello. I am waiting your file");
            return;
        }
        //while (!letgo) {
            if (!args[0].endsWith(".json")) {
                System.out.println("This program can only work with .json file.");
                return;
           }// else {
              //  letgo = true;
            //}
       // }
        final CollectionManager collectionManager = new CollectionManager();
        final FileRead fileRead = new FileRead(args[0]);
        final Home home = new Home(fileRead);
        home.start();



    }

}