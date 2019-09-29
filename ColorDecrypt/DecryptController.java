
/**
 * 
 */
public class DecryptController
{
    String filename;
    ImageParser impar;
    DecimalToBinary dtb;
    FileWriter fw;
    /**
     * Constructor for objects of class DecryptController
     */
    public DecryptController(String filename, String output)
    {
        this.filename=filename;
        impar = new ImageParser(this.filename);
        dtb = new DecimalToBinary(impar.getList());
        fw = new FileWriter(dtb.getOriginal(), output);
        fw.write();
    }

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
        DecryptController me = new DecryptController(filename, output);
    }
}
