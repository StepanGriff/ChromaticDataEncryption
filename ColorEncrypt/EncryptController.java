import java.util.ArrayList;

public class EncryptController
{
    HexaColor[] hexcol;
    BinarySplit binsplit;
    BinaryParser binparse;
    String filename;
    public EncryptController(String filename)
    {
        this.filename = filename;
        runController();
    }
    
    public void runController()
    {
        try
        {
            binparse = new BinaryParser(this.filename);
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.exit(1);
        }
        binsplit = new BinarySplit(binparse.toString());
        ArrayList<String> split = binsplit.getList();
        hexcol = new HexaColor[split.size()];
        for (int i=0; i<hexcol.length; i++)
        {
            
            hexcol[i] = new HexaColor(split.get(i));
        }
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
