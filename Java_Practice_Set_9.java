package com.company.JAVA.Learning;

class cylinder{
    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    /*public cylinder(){
            r = 4;
            h = 9;
        }*/
    public void setter(){
        r = 4;
        h = 9;
    }
    public void getter(){
        System.out.println("The Radius is "+r+" and The Height Is "+h);
    }
    public double surFace(){
        return (2*Math.PI*r*h)+(2*3.14f*r*r);
    }
    public  float volume(){
        return 3.14f*r*r*h;
    }
}

class sphere {
    private int r;

    public void setter() {
        r = 4;
    }

    public void getter() {
        System.out.println("The Radius is " + r);
    }
}

class rectangle2{
    private int length;
    private int breadth;

    public rectangle2(){
        length=4;
        breadth=5;
    }

    public rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Java_Practice_Set_9 {
    public static void main(String[] args) {
        // 1. Create a Class Cylinder and Use Setters and Getters to Set Its Radius and Height
        cylinder cd = new cylinder();
        cd.setter();
        cd.getter();

        // 2. USe 1 to Calculate Surface Area Ana Volume of The Cylinder
        System.out.println(cd.surFace());
        System.out.println(cd.volume());

        // 3. Use a Constructor and Repeat 1
        // Done

        // 4. Overload a Constructor Used to Initiating a rectangle of Length 4 and Breadth 5 for Using Custom Parameter
        rectangle2 rc = new rectangle2();
        System.out.println(rc.getBreadth());
        System.out.println(rc.getLength());

        // 5. Repeat 1 Fpr a Sphere
        sphere sp = new sphere();
        sp.setter();
        sp.getter();
    }
}
