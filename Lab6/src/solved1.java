
class solved1 extends TwoDShape{
String style;
double area(){ return getWidth()*getHeight()/2; }
solved1(String s, double w, double h){ setWidth(w); setHeight(h); style = s; }

void show() { super.show();System.out.println("Triangle is"+ style ); }
public static void main(String[] args){
	solved1 t1=new solved1("outlined",8.0,12.0);
	solved1 t2=new solved1("filled", 4.0,4.0);
	t1.show();
	t2.show();
	}
}