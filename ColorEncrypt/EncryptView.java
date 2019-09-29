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
    /**
     * Constructor for objects of class EncryptView
     */
    public EncryptView(EncryptModel model)
    {
        this.model = model;
        //Canvas c = new Canvas (500,500);
        save();
    }

    public void save(){
        int x=0;
        int y=0;
        try {

            int width = 500, height = 500;

            // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
            // into integer pixels
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D ig2 = bi.createGraphics();
            y=0;
            z=5;
            for (int i =0; i<model.hexcol.length; i++){ 
                ig2.setColor(Color.decode("#"+ model.hexcol[i].hexa()));
                ig2.drawLine(x,y,x,z);
                x++;
                //y++;
                 if (x>=500){
                     y+=10;
                     z+= 10;
                     x=0;
                 }
            }

            ImageIO.write(bi, "PNG", new File("balls.PNG"));

        }catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}