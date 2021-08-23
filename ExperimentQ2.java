import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/*
Created By Mohit Jangid
18EJICS092
Last time also my image was mirrored but was unable to put pixels properly
*/

public class ExperimentQ2
{
        public static void main(String args[]) {
            BufferedImage input_img = null;
            File f = null;
            try
            {
                f = new File("D:\\InputResize.jpeg");
                input_img = ImageIO.read(f);
            }
            catch(IOException e)
            {
                System.out.println("Error: " + e);
            }

            int width = input_img.getWidth();
            int height = input_img.getHeight();
            System.out.println("RESOLUTION");
            System.out.println(height*width);

            BufferedImage output_img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            for(int m=0;m<height;m++){
                for(int n = 0;n<width/2;n++){
                    int p = input_img.getRGB(n,m);
                    output_img.setRGB(n, m, p);
                }
            }
            for (int y =0; y < height; y++)
            {
                for (int lx = width/2, rx = width - 1; lx < width; lx++, rx--)
                {
                    int p = input_img.getRGB(lx, y);
                    output_img.setRGB(rx, y, p);
                }
                for (int i=0;i<height;i++){
                    for(int j=width/2;j<width;j++){
                        int p = input_img.getRGB(j,i);
                        int a = (p>>24)&0xff;
                        int r = (p>>16)&0xff;
                        int g = (p>>8)&0xff;
                        int b = p&0xff;
                        int avg = (r+g+b)/3;
                        p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                        input_img.setRGB(j, i, p);

                    }
                }

            }
            try
            {
                f = new File("D:\\output3.jpeg");
                ImageIO.write(output_img, "jpeg", f);
            }
            catch(IOException e)
            {
                System.out.println("Error: " + e);
            }
        }

    }
