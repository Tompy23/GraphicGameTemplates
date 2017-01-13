package net.tompy.ggt.component;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public interface Sprite 
{
	public void draw();
	public void draw( Graphics2D g2d, int x, int y );
	public void draw( Graphics2D g2d, int x, int y, int row, int column );
	
	public void incrementColumn();
	public void incrementRow();
	public void setColumn( int c );
	public void setRow( int r );
	
	public void rotate( double r );
	
	public void setImageName( String imageName );
	public void init();
	
	public BufferedImage getImage();
	
	public void shutdown();

	public abstract String getImageName();


	public abstract int getImageHeight();

	public abstract void setImageHeight(int imageHeight);

	public abstract int getImageWidth();

	public abstract void setImageWidth(int imageWidth);

	public abstract int getCellHeight();

	public abstract void setCellHeight(int cellHeight);

	public abstract int getCellWidth();

	public abstract void setCellWidth(int cellWidth);

	public abstract int getColumns();

	public abstract void setColumns(int columns);

	public abstract int getRows();

	public abstract void setRows(int rows);

	public abstract int getCurrentColumn();

	public abstract void setCurrentColumn(int currentColumn);

	public abstract int getCurrentRow();

	public abstract void setCurrentRow(int currentRow);


}
