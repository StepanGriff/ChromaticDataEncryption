
/**
 * 
 */
public class DecryptController
{
    String filename;
    ImageParser impar;
    DecimalToBinary dtb;
    /**
     * Constructor for objects of class DecryptController
     */
    public DecryptController(String filename)
    {
        this.filename=filename;
        impar = new ImageParser(this.filename);
        dtb = new DecimalToBinary(impar.getList());
        System.out.print(dtb.getOriginal());
    }
    
    public static void main(String[] args)
    {
        String filename = "balls.PNG";
        DecryptController me = new DecryptController(filename);
    }
}
