package net.tompy.ggt.component;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteBasicImpl implements Sprite 
{
	private String imageName = "";
	private BufferedImage image = null;
	private int columns = 1;
	private int rows = 1;
	private int currentColumn = 1;
	private int currentRow = 1;
	private int imageHeight = 0;
	private int imageWidth = 0;
	private int cellHeight = 0;
	private int cellWidth = 0;
	private double rotation = 0.0;
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#init()
	 */
	@Override
	public void init()
	{
		try
		{
			image = ImageIO.read( getClass().getClassLoader().getResourceAsStream( imageName ) );
		}
		catch( IOException ioe )
		{
			ioe.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#draw()
	 */
	@Override
	public void draw() 
	{
		
	}
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#draw(java.awt.Graphics2D, int, int)
	 */
	@Override
	public void draw(Graphics2D g2d, int x, int y) 
	{
		g2d.rotate( rotation, x + cellWidth/2, y + cellHeight/2 );
		g2d.drawImage( image, 
				x, 
				y, 
				x+cellWidth, 
				y+cellHeight, 
				(currentColumn-1)*cellWidth, 
				(currentRow-1)*cellHeight, 
				( (currentColumn-1)*cellWidth ) + cellWidth, 
				( (currentRow-1)*cellHeight ) + cellHeight, 
				null );
		
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#draw(java.awt.Graphics2D, int, int, int, int)
	 */
	@Override
	public void draw(Graphics2D g2d, int x, int y, int row, int column) 
	{
		// TODO Auto-generated method stub
		
	}
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#rotate(double)
	 */
	@Override
	public void rotate( double r )
	{
		rotation = r;
	}
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#incrementColumn()
	 */
	@Override
	public void incrementColumn() 
	{
		currentColumn++;
		if ( currentColumn > columns )
		{
			currentColumn= 1;
		}
	}
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#incrementRow()
	 */
	@Override
	public void incrementRow() 
	{
		currentRow++;
		if ( currentRow > rows )
		{
			currentRow = 1;
		}
	}
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setColumn(int)
	 */
	@Override
	public void setColumn(int c) 
	{
		if ( c < 1 )
		{
			currentColumn = 1;
		}
		else if ( c > columns )
		{
			currentColumn = columns;
		}
		else
		{
			currentColumn = c;
		}
	}
	
	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setRow(int)
	 */
	@Override
	public void setRow(int r) 
	{
		if ( r < 1 )
		{
			currentRow = 1;
		}
		else if ( r > rows )
		{
			currentRow = rows;
		}
		else
		{
			currentRow = r;
		}
	}
	

	@Override
	public void shutdown() 
	{
		image = null;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getImageName()
	 */
	@Override
	public String getImageName() {
		return imageName;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setImageName(java.lang.String)
	 */
	@Override
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getImageHeight()
	 */
	@Override
	public int getImageHeight() {
		return imageHeight;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setImageHeight(int)
	 */
	@Override
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getImageWidth()
	 */
	@Override
	public int getImageWidth() {
		return imageWidth;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setImageWidth(int)
	 */
	@Override
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getCellHeight()
	 */
	@Override
	public int getCellHeight() {
		return cellHeight;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setCellHeight(int)
	 */
	@Override
	public void setCellHeight(int cellHeight) {
		this.cellHeight = cellHeight;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getCellWidth()
	 */
	@Override
	public int getCellWidth() {
		return cellWidth;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setCellWidth(int)
	 */
	@Override
	public void setCellWidth(int cellWidth) {
		this.cellWidth = cellWidth;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getColumns()
	 */
	@Override
	public int getColumns() {
		return columns;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setColumns(int)
	 */
	@Override
	public void setColumns(int columns) {
		this.columns = columns;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getRows()
	 */
	@Override
	public int getRows() {
		return rows;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setRows(int)
	 */
	@Override
	public void setRows(int rows) {
		this.rows = rows;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getCurrentColumn()
	 */
	@Override
	public int getCurrentColumn() {
		return currentColumn;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setCurrentColumn(int)
	 */
	@Override
	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#getCurrentRow()
	 */
	@Override
	public int getCurrentRow() {
		return currentRow;
	}

	/* (non-Javadoc)
	 * @see net.tompy.ggt.component.tmp#setCurrentRow(int)
	 */
	@Override
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public BufferedImage getImage() {
		return image;
	}


}
