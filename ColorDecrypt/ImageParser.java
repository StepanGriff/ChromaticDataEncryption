import java.util.ArrayList;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
/**
 * 
 */
public class ImageParser
{
    String filename;
    ArrayList<int []> colorParse;   
    BufferedImage image;
    File file;
    final static int WIDTH = 500;
    final static int HEIGHT = 10;
    final static int[] ESCAPECOLOR = new int[] {164, 126, 164};    
    final static int BREAKLIMIT = 3;
    /**
     * Constructor for objects of class ImageParser
     */
    public ImageParser(String filename)
    {
        this.filename = filename;
        this.colorParse = new ArrayList<int []>();
    }

    /**
     * 
     */
    public void imageIn()
    {
        this.file = new File(filename);
        try
        {
            this.image = ImageIO.read(this.file);
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.exit(1);
        }
    }
    
    /**
     * 
     */
    public void parseImage()
    {
        int colorValue;
        int x;
        int y = 0;
        int breakCount = 0;
        Color readable;
        int[] parsedValues;
        while (breakCount != this.BREAKLIMIT)
        {
            for (x=0; x<WIDTH; x++)
            {
                colorValue = image.getRGB(x,y);
                readable = new Color(colorValue);
                parsedValues = new int[] {readable.getRed(),
                                          readable.getGreen(),
                                          readable.getBlue()};
                this.colorParse.add(parsedValues);
                if (parsedValues.equals(this.ESCAPECOLOR))
                {
                    breakCount++;
                    if (breakCount==this.BREAKLIMIT)
                    {
                        break;
                    }
                } else {
                    breakCount = 0;
                }
            }
            y+=this.HEIGHT;
        }
    }
}