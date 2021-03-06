package util;

import javafx.geometry.Dimension2D;

public final class Constants {

	public static final String GAME_NAME = "JETHO" ; 
		
	public static int MAX_FRAME_PER_SECOND = 60 ;
	
	public static int CELL_SIZE = 40 ;
	
	public static int CELL_PER_ROW = 15 ;
	public static int CELL_PER_COL = 10 ;
	
	public static final Dimension2D DEFAULT_SCREEN_SIZE = new Dimension2D( CELL_PER_ROW * ( CELL_SIZE + 1 ) + 1 , CELL_PER_COL * ( CELL_SIZE + 1 ) + 1 ) ; 

	
	public enum CellColor {
		RED , BLUE , GREEN , YELLOW , PURPLE ; 
		public static CellColor getRandom() {
	        return values()[ (int)(Math.random() * values().length) ];
	    }
	}
	
	public enum CellItem {
		BOTTLE , DIAMOND ; 
		public static CellItem getRandom() {
	        return values()[ (int)(Math.random() * values().length) ];
	    }
	}

}
