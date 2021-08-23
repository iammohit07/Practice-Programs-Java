import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

/*
Created By Mohit Jangid
18EJICS092
*/

public class ExperimentQ1
{
        BufferedImage  image;

        public ExperimentQ1()
        {

            try {
                File input = new File("D:\\ExpInput1.jpg");
                image = ImageIO.read(input);
                int width = image.getWidth();
                int height = image.getHeight();
                System.out.println("HEIGHT IS");
                System.out.println(height);
                System.out.println("WIDTH IS ");
                System.out.println(width);


                // magenta
                for(int k=height/2; k<height; k++) {

                    for(int m=width/2; m<width; m++) {

                        Color c = new Color(image.getRGB(m, k));
                        int red = (int)(c.getRed());
                        int green = (int)(c.getGreen());
                        int blue = (int)(c.getBlue());
                        if((blue + 100) < 255){ blue = blue + 100; }
                        if((red + 100) < 255){ red = red + 100; }

                        Color newColor = new Color(red,green,blue);

                        image.setRGB(m,k,newColor.getRGB());
                    }
                }
                // negative
                for(int n=0; n<height/2; n++) {

                    for(int q=0; q<width/2; q++) {


                        int p = image.getRGB(q,n);
                        int a = (p>>24)&0xff;
                        int r = (p>>16)&0xff;
                        int g = (p>>8)&0xff;
                        int b = p&0xff;

                        r = 255 - r;
                        g = 255 - g;
                        b = 255 - b;
                        p = (a<<24) | (r<<16) | (g<<8) | b;

                        image.setRGB(q, n, p);
                    }
                }
                File output = new File("D:\\output.jpg");
                ImageIO.write(image, "jpg", output);

            } catch (Exception e) {}
        }

        static public void main(String args[]) throws Exception
        {
            ExperimentQ1 obj = new ExperimentQ1();
        }
}
