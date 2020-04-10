class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;
	//TODO constructor
	public Point(String id,double x,double y)
	//TODO setters and getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=="L")
			x=x-1;
		if(xDirection=="R")
			x=x+1;

		if(yDirection=="U")
			y=y+1;
		if(yDirection=="D")
			y=y-1;
	}

	public void draw () {
		//TODO
		double xNow = getX();
		double yNow = getY();
		System.out.println(xNow,yNow);
	}



}