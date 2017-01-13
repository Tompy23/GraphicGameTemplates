package net.tompy.gtt.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Background extends JComponent 
{
	BufferedImage image = null;
	public Background()
	{
		
	}
	
	public Background( String resource )
	{
		try
		{
			image = ImageIO.read( getClass().getClassLoader().getResourceAsStream( resource ) );
			this.setOpaque( false );
		}
		catch( IOException ioe )
		{
			ioe.printStackTrace();
		}		
	}
	
	public void paintComponent( Graphics g )
	{
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.drawImage( image, 0, 0, null );
	}
}