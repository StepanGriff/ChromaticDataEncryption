import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
public class EncryptController
{
    EncryptModel model;
    EncryptView view;
    JFrame frame;
    public EncryptController(String filename, String output)
    {
        model = new EncryptModel(filename);
        view = new EncryptView(model, output);  
    }

    /**
     * This will be the main method that runs everything. It integrates everything frm the encryption's model, view, 
     * now controller.
     */
    public static void main(String[] args)
    {
        String filename = "";
        String output = "";
        try
        {
            filename = args[0];
            output = args[1];
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.exit(1);
        }
        EncryptController me = new EncryptController(filename, output);
    }
}
