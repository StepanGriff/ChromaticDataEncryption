import java.util.ArrayList;

public class EncryptModel
{
    HexaColor[] hexcol;
    BinarySplit binsplit;
    BinaryParser binparse;
    final int escapeSpace = 3;
    /**
     * Constructor for objects of class EncryptModel. 
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
        hexcol = new HexaColor[split.size()+escapeSpace];
        for (int i=0; i<hexcol.length-escapeSpace; i++)
        {

            hexcol[i] = new HexaColor(split.get(i));
        }
        addEscape();
    }

    /**
     * This method returns nothing. After what was done with the constructor, it will then add escape characters to the 
     * end of the hexcol array.
     */
    public void addEscape(){
        for(int j = 0; j<escapeSpace; j++){
            hexcol[hexcol.length-j-1] = new HexaColor("001001010111111000100101");
        }
    }
}
