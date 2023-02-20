import File.FileRead;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Hello. I am waiting your file");
            return;
        }
        FileRead fr = new FileRead(args[0]);
        fr.readFile();
    }

}