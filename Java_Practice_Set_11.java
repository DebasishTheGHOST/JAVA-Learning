package com.company.JAVA.Learning;

abstract class pen {
    abstract void write();
    abstract void refill();
        }
class fountainPen extends pen {
    public void write() {
        System.out.println("Writing");
    }
    public void refill() {
        System.out.println("Refiling");
    }
    public void changeNib(){
        System.out.println("Changing Nib");
    }
}

class monkey {
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
interface basicAnimal{
    public void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void talk(){
        System.out.println("Talking");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void eat(){
        System.out.println("Eating");
    }
}

abstract class telephone{
    abstract public void lift();
    abstract public void disconnect();
}
interface charger{
    void charging();
    }
class smartTelephone extends telephone implements charger{
    public void  lift(){
        System.out.println("Picking Up The Call");
    }
    public void disconnect (){
        System.out.println("Call Disconnected");
    }
    public void charging(){
        System.out.println("Charging");
    }
}

interface tvRemote{
    void channel();
}
interface smartTvRemote extends tvRemote{
    void volume();
}

class TV implements smartTvRemote{
    public void volume(){
        System.out.println("Changing Volume");
    }
    public void channel(){
        System.out.println("Changing Channel");
    }
}

public class Java_Practice_Set_11 {
    public static void main(String[] args) {
        /*
        1. Create an abstract class pen with methods write( ) and refill( ) as abstract methods
        2. Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ( )
        3. Create a class monkey with jump ( ) and bite ( ) methods Create a class human
           which inherits this monkey class and implements basic-animal interface with eat ( ) and sleep ( ) methods
        4. Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods
           create another class smart telephone and demonstrate polymorphism
        5. Demonstrate polymorphism using monkey  class from Q3
        6. Create an interface TV=remote and use it to inherit another interface smart TV-remote
        7. Create a class TV which implements TV-remote interface from Q6
         */

        fountainPen fp = new fountainPen();
        fp.changeNib();
        human hm = new human();
        hm.eat();
        hm.sleep();
        hm.jump();
        hm.bite();
        telephone st = new smartTelephone();
        st.lift();
        //st.charging(); -- error
        monkey mk = new human();
        mk.jump();
        //mk.talk();  -- error
        TV tv = new TV();
        tv.channel();
        tv.volume();

    }
}
