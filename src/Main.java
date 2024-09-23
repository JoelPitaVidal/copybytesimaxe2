import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //lecturaEscritura.leerArquivo("/home/dam/prueba/foto.jpg");
        try {
            lecturaEscritura.escribirNoArquivo("/home/dam/prueba/foto.jpg","/home/dam/prueba/foto2.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}