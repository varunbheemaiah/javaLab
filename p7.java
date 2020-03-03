import java.io.FileInputStream;
import java.io.IOException;

/**
 * chun
 */
public class p7 {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("E:/myfile.txt");
        int k;
        while((k=f.read()) != -1){
            try{
                int y = 10/0;
            }
            catch(ArithmeticException e){
                System.out.println("YEAH NO JUST STOP PROGRAMMING AND JUST GO JUMP OFF A CLIFF OR SOMETHING");
            }
        }
        f.close();
    }
}