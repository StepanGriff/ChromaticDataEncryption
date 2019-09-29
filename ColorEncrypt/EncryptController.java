import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
public class EncryptController
{
    EncryptModel model;
    EncryptView view;
    JFrame frame;
    public EncryptController(String filename)
    {
        model = new EncryptModel(filename);
        view = new EncryptView(model);  
    }
    
    public static void main(String[] args)
    {
        // String binary;
        String sampleBinary = "thetest.txt";
        // if (args[0] != null) {
            // binary = args[0];
        // } else {
            // binary = sampleBinary;
        // }
        EncryptController me = new EncryptController(sampleBinary);
    }
}
