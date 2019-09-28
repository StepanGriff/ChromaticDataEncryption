import java.util.ArrayList;

public class EncryptController
{
    EncryptModel model;
    EncryptView view;
    public EncryptController(String filename)
    {
        model = new EncryptModel(filename);
        view = new EncryptView(model);
    }
    
    public static void main(String[] args)
    {
        // String binary;
        String sampleBinary = "national-anthem-binary.txt";
        // if (args[0] != null) {
            // binary = args[0];
        // } else {
            // binary = sampleBinary;
        // }
        EncryptController me = new EncryptController(sampleBinary);
    }
}
