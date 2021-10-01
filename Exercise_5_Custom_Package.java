package com.company.JAVA.Learning;

class shape{
    int dim1, dim2;
    shape (int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getterdim1(){return this.dim1;}
    public int getterdim2(){return this.dim2;}
    public void setterdim1(int dim1){this.dim1 = dim1;}
    public void setterdim2(int dim2){this.dim2 = dim2;}
}

public class Exercise_5_Custom_Package {
    public static void main(String[] args) {
        /*
        1. You Have To Crate a Package Named com.codewithharry.shape
        2. This Package Should Have Individual Classes For Rectangle, Square, Circle, Cylinder, Sphere
        3. These Classes should Use Inheritance to Properly Manage the Code
        4. Include Methods Like Volume, Surface area and Getter/Setter for Dimension
        */
    }
}
