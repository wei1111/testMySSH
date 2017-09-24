package GraphicsDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GraphicsDemo {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\smile.png");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\dog.png");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\cat.png");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p1.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p2.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p3.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p4.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p5.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p6.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p7.jpg");
//		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\B.jpg");
		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p8.jpg");
		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p9.jpg");
		createAsciiPicture("D:\\Pictures\\ͼƬ���ַ���ת��\\p10.jpg");
	}

	private static void createAsciiPicture(String path) throws IOException {
		// TODO Auto-generated method stub
		String base = "&��$?#*+��.";
		char [] ch = base.toCharArray();
		
		BufferedImage image = ImageIO.read(new File(path));
		
		int height = image.getHeight();
		int width = image.getWidth();
		
		System.out.println(height);
		System.out.println(width);
		for(int i = 0; i<height;i+=2)
		{
			for(int j = 0;j<width;j+=1)
			{
				final int color = image.getRGB(j, i);
				   final int r = (color >> 16) & 0xff;
				   final int g = (color >> 8) & 0xff;
				   final int b = color & 0xff;
				   int gray = (int) Math.round(0.3 * r + 0.59 * g + 0.11 * b);
				   final int index = (int)Math.ceil(gray/33);
				   System.out.print(ch[index]);
//				   System.out.print(gray+"");
			}
			System.out.println();
		}
	}

}
