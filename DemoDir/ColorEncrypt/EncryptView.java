import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/**
 * 
 */
public class EncryptView
{
    int x;
    int y;
    int z;
    EncryptModel model;
    String output;
    /**
     * Constructor for objects of class EncryptView
     */
    public EncryptView(EncryptModel model, String output)
    {
        this.model = model;
        this.output = output;
        save();
    }

    /**
     * This method will save the painted encrytpted lyrics of the songs.
     */
    public void save(){
        int x=0;
        int y=0;
        int red,green,blue;
        try {

            int width = 500, height = 500;

            // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
            // into integer pixels
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D ig2 = bi.createGraphics();
            y=0;
            z=5;
            for (int i =0; i<model.hexcol.length; i++){ 
                red= model.hexcol[i].color[0];
                green = model.hexcol[i].color[1];
                blue = model.hexcol[i].color[2];

                ig2.setColor(new Color(red, green, blue));
                ig2.drawLine(x,y,x,z);
                x++;
                //y++;
                if (x>=500){
                    y+=10;
                    z+= 10;
                    x=0;
                }
            }

            ImageIO.write(bi, "PNG", new File(this.output));

        }catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}