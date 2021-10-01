package com.company.JAVA.Learning;

class myCircle {
    public int radius;
    myCircle (int r){
        this.radius = r;
    }
    public double area (){
        return Math.PI*this.radius*this.radius;
    }
}
class myCylinder extends myCircle{
    public int height;
    myCylinder(int r, int h){
        super(r);
        this.height = h;
    }
    @Override
    public double area (){
        return (2*Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.height);
    }
    public double volume (){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class myRectangle{
    int length;
    int width;
    public int getLength() {
        return length;}
    public void setLength(int length) {
        this.length = length;}
    public int getWidth() {
        return width;}
    public void setWidth(int width) {
        this.width = width;}

    public int are(){
        return length*width;
     }
}
class myCuboid extends myRectangle{
    int height;
    public int getHeight() {
        return height;}
    public void setHeight(int height) {
        this.height = height;}

    public int volume(){
        return this.length*this.width*this.height;
    }
}
public class Java_Practice_Set_10 {
    public static void main(String[] args) {
        /*
        1. Create a class circle and use inheritance to create another class cylinder from it
        2. Create a class rectangle and use inheritance to create another class cuboid,
        try to keep it as close to the real-world scenario as possible
        3. Create a method for area and volume in 1
        4. create methods for area & volume in 2 also create getters and setters
        5. What is the order of constructor execution for the following inheritance hierarchy
                                Base -> Derived1 -> Derived2
        6. Derived obj = new Derived 2( );
        Which constructor(s) will be executed & in what order
         */
        myCircle c = new myCircle(10);
        System.out.println(c.area());
        myCylinder mc = new myCylinder(7,12);
        System.out.println(mc.area());
        System.out.println(mc.volume());
        myRectangle mr = new myRectangle();
        mr.setLength(8);
        System.out.println(mr.getLength());
        mr.setWidth(4);
        System.out.println(mr.getWidth());
        System.out.println(mr.are());
        myCuboid mcb = new myCuboid();
        mcb.setLength(4);
        mcb.setWidth(7);
        mcb.setHeight(5);
        System.out.println(mcb.getHeight());
        System.out.println(mcb.volume());
    }
}
