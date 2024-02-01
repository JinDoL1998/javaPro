package days24;

public class Ex09 {
	//					0	   1	 2	    3	
	// enum Direction {EAST, SOUTH, WEST, NORTH}
	//				   100	  200 	 300   400
	// enum Direction {EAST, SOUTH, WEST, NORTH}
	// enum Direction {EAST = 100, SOUTH = 200, WEST = 300, NORTH = 400}
	
	// The constructor Ex09.Direction(int) is undefined
	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲");
		
		private final int VALUE;
		private final String SYMBOL;
		
		private Direction(int value, String symbol) {
			this.VALUE = value;
			this.SYMBOL = symbol;
			
		}
		
		
		
		public int getVALUE() {
			return VALUE;
		}



		public String getSYMBOL() {
			return SYMBOL;
		}


		/*
		Direction(int value){
			this.VALUE = value;
		}
		
		public int getValue() {
			return VALUE;
		}
		*/
		
		
	}
	
	public static void main(String[] args) {
		
		Direction[] dirArr = Direction.values();
		for(Direction dir : dirArr) {
			System.out.println(
					  dir.name() + "/"
					+ dir.ordinal() + "/"
					+ dir.getSYMBOL() + "/"
					+ dir.getVALUE() + "/"
					);
			
		}
		
	} // main

} // class

/* 2. 컴파일러가  클래스 변환
*    class Direction extends Enum{
*       static final Direction EAST = new Direction("EAST");
*       static final Direction SOUTH = new Direction("SOUTH");
*       static final Direction WEST = new Direction("WEST");
*       static final Direction NORTH = new Direction("NORTH");
*       
*       private String name;
*       public int namename(){
*         return this.name;
*       }
*       private int ordinal
*       public int ordinal(){
*         return this.ordinal;
*       }
*       private Dirction(String name){
*          this.name = name;
*       }
*    }
*/    
