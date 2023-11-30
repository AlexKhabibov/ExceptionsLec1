import java.io.File;

public class Program {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("123")));
        System.out.println(divide(10, 0));
    }

    public static int divide (int a, int b){
        return a/b;
    }

    public static long getFileSize(File file) {
        if (!file.exists())
            return -1L;
        return file.length();
    }

}
