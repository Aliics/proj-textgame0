package fish.eyebrow.textgame0;

public class Vector {
	private VectorType vectorType = VectorType.THREE_DIMENSIONAL;
	private int x = 0;
	private int y = 0;
	private int z = 0;

	public Vector () {
		this ( 0, 0, 0 );
	}

	public Vector ( int x, int y, int z ) {
		this.x = x;
		this.y = y;
		this.z = this.vectorType == VectorType.THREE_DIMENSIONAL ? z : 0;
	}

	public void setVectorType ( VectorType vectorType ) {
		this.vectorType = vectorType;
		
		if ( vectorType == VectorType.TWO_DIMENSIONAL )
			this.z = 0;
	}

	public VectorType getVectorType () {
		return this.vectorType;
	}

	public void setX ( int x ) {
		this.x = x;
	}

	public int getX () {
		return this.x;
	}

	public void setY ( int y ) {
		this.y = y;
	}

	public int getY () {
		return this.y;
	}

	public void setZ ( int z ) {
		if ( this.vectorType != VectorType.THREE_DIMENSIONAL )
			return;

		this.z = z;
	}

	public int getZ () {
		return this.z;
	}

	public enum VectorType {
		TWO_DIMENSIONAL,
		THREE_DIMENSIONAL
	}
}
