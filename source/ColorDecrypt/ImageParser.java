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
        imageIn();
        parseImage();
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
        while (breakCount < this.BREAKLIMIT)
        {
            for (x=0; x<WIDTH; x++)
            {
                colorValue = image.getRGB(x,y);
                readable = new Color(colorValue);
                parsedValues = new int[] {readable.getRed(),
                    readable.getGreen(),
                    readable.getBlue()};
                this.colorParse.add(parsedValues);
                if (compareToEscape(parsedValues))
                {
                    breakCount++;
                    if (breakCount>=this.BREAKLIMIT)
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

    public ArrayList<int []> getList()
    {
        return this.colorParse;
    }

    public boolean compareToEscape(int[] check)
    {
        int correct = 3;
        int counts = 0;
        for (int i=0; i<check.length;i++)
        {
            if (check[i] == ESCAPECOLOR[i])
            {
                counts++;
            }
        }
        return (counts==correct);
    }
}