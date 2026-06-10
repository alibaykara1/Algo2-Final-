package file;
//Dosya oluşturma
import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\ali\\IdeaProjects\\Files\\students.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten var");
            }
        } catch(IOException e){
            e.printStackTrace();//Hatanın ne olduğunu mesaj olarak veriyor .
        }
    }
}