
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
    public DecryptController(String filename)
    {
        this.filename=filename;
        impar = new ImageParser(this.filename);
        dtb = new DecimalToBinary(impar.getList());
        fw = new FileWriter(dtb.getOriginal(), "pleasework.txt");
        fw.write();
    }
    
    public static void main(String[] args)
    {
        String filename = "balls.PNG";
        DecryptController me = new DecryptController(filename);
    }
}
