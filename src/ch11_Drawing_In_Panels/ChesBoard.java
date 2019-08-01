package ch11_Drawing_In_Panels;


import javax.swing.*;
import java.awt.*;

public class ChesBoard extends JPanel{
	
	private int width,height;
	private int boardPiece;
	
	public ChesBoard(int boardPiece) {
		if (boardPiece < 50)
			this.boardPiece = 50;
		else this.boardPiece = boardPiece;
		width = height =  boardPiece * 8 + 80;
		JFrame f = FrameBuilder.build(width,height,"ChesBoard");
		f.add(this);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		int boardSize = boardPiece * 8;
		int xOffset = (width - boardSize)/2;
		int yOffset = (height - boardSize)/2;
		g.drawRect(xOffset-1, yOffset-1, boardSize, boardSize);
		for (int row = 0; row < 8;row++ ) {
			for (int col = 0; col < 8; col++) {
				Color c ;
				if ( (row + col) % 2 == 0 )
					c = Color.white;
				else c = Color.black;
				paintPiece(g,c,xOffset,yOffset);
				xOffset += boardPiece;
			}
			yOffset += boardPiece;
			xOffset = (width - boardSize)/2;;
		}
	}
	
	private void paintPiece(Graphics g, Color c, int x, int y) {
		g.setColor(Color.black);
		g.drawRect(x, y,boardPiece ,boardPiece);
		g.setColor(c);
		g.fillRect(x, y,boardPiece , boardPiece);
	}

	public static void main(String[] args) {
		new ChesBoard(70);

	}

}
