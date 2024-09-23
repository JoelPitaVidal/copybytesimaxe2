import java.io.*;

public class lecturaEscritura {

    public static void leerArquivo(String fileName){
        try(FileInputStream  lecturaArquivos =new FileInputStream(fileName)){
            BufferedInputStream bufferedInputStream = new BufferedInputStream(lecturaArquivos);
            int finFicheiro = bufferedInputStream.read();
            while(finFicheiro!= -1){
                finFicheiro = bufferedInputStream.read();
                System.out.print((char) finFicheiro);
            }
        }catch(IOException e){
            System.out.println("No se pudo mostrar el contenido del archivo");
        }
    }

    public static void escribirNoArquivo(String texto1, String texto2) throws FileNotFoundException {
        File arquivoEscrito = new File(texto1);
        File arquivoValeiro = new File(texto2);

        FileInputStream leer = new FileInputStream(arquivoEscrito);
        FileOutputStream escribir = new FileOutputStream(arquivoValeiro, true);
        BufferedOutputStream output = new BufferedOutputStream(escribir);

        try{
            int leerArquivo;
            while((leerArquivo = leer.read()) != -1){
                output.write(leerArquivo);
            }
        }catch (IOException e){
            System.out.println("Error durante la escritura");
        }finally {
            try {
                if (leer != null) leer.close();
                if (output != null) output.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}