package lab4;

public class Box {
double width;
double height;
double depth;
// compute and return volume
double volume() {
return width * height * depth;
}
// sets dimensions of box
void setDim(double w, double h, double d) {
width = w;
height = h;
depth = d;
}


public static void main(String args[]) {
Box mybox1 = new Box(); //declare reference to an object
Box mybox2 = new Box(); //allocate a Box object
double vol;
mybox1.setDim(10, 20, 15);
mybox2.setDim(3, 6, 9);
vol = mybox1.volume();
// initialize each box
// get volume of first box
System.out.println("Volume is " + vol);
vol = mybox2.volume(); // get volume of second box
System.out.println("Volume is " + vol);
}}
