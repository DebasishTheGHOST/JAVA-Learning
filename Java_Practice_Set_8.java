package com.company.JAVA.Learning;

class employ{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
}

class cellphone{
    String calling="Ring...Ring...";
    String messaging="Vibrating...Vibrating...";
    public void msg (){
        System.out.println(calling);
    }
    public void call (){
        System.out.println(messaging);
    }
}

class squire{
    int arm;
    public void initiate(){
        arm = 5;
    }
    public int area (){
        return arm*arm;
    }
    public int perimeter(){
        return 4*arm;
    }
}

class rectangle{
    int a;
    int b;
    public void initiate(){
        a = 5;
        b = 8;
    }
    public int area (){
        return (a*b);
    }
    public int perimeter(){
        return 2*(a+b);
    }
}

class circle{
    int r;
    public void initiate(){
        r = 5;
    }
    public float area (){
        return 3.14f*(r*r);
    }
    public float perimeter(){
        return 2*(3.14f*r);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting The Enemy");
    }
    public void run(){
        System.out.println("Running From Cops");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }
}

public class Java_Practice_Set_8 {
    public static void main(String[] args) {
        // 1. Create a Class Employ With Following Properties and methods:
        // Salary (Property)(int)
        // Get Salary (Method Returning int)
        // Name (Property)(String)
        // GetName (Method Returning String)
        // SetName (Method Changing Name)
        employ ghost = new employ();
        ghost.name="GHOST";
        ghost.salary= 10000;
        ghost.setName("Debasish");
        System.out.println(ghost.getSalary());
        System.out.println(ghost.getName());

        // 2. Create a Class Cellphone With Method to Print "RingRing...","Vibrating..." etc
        cellphone nokia = new cellphone();
        nokia.call();
        nokia.msg();

        // 3. Create a Class Squire With a Method to Initiate Its Side, calculating Area, Perimeter etc
        squire sq = new squire();
        sq.initiate();
        System.out.println(sq.perimeter());
        System.out.println(sq.area());

        // 4. Create a Class Rectangle 8 and Repeat 3
        rectangle rc = new rectangle();
        rc.initiate();
        System.out.println(rc.perimeter());
        System.out.println(rc.area());

        // 5. Create a Class Tommy Vecetti For Rockstar Games Capable of Hitting (Print hitting), Running, Firing, Ect
        Tommy tm = new Tommy();
        tm.fire();
        tm.hit();
        tm.run();

        // 6. Repeat 4 For a Circle
        circle c = new circle();
        c.initiate();
        System.out.println(c.perimeter());
        System.out.println(c.area());
    }
}
