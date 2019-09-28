import java.util.ArrayList;

public class EncryptModel
{
    HexaColor[] hexcol;
    BinarySplit binsplit;
    BinaryParser binparse;
    /**
     * Constructor for objects of class EncryptModel
     */
    public EncryptModel(String filename)
    {
        try
        {
            binparse = new BinaryParser(filename);
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

}
