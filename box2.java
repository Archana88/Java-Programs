class box2
{
	double width,height,depth;
	box2(box2 b)
		{
			this.width=b.width;
			this.height=b.height;
			this.depth=b.depth;
	}
	box2(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	box2(double a)
	{
			this(a,a,a);
	}
	box2()
	{
			this(1,1,1);
	}
	double volume()
	{
		return width*height*depth;
	}
}