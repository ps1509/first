/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4_ii;

abstract class shape {
	double dim1;
	double dim2;
	shape(double a, double b) {
	dim1 = a;
	dim2 = b;
	}
	abstract double area();
}
class Rectangle extends shape {
	Rectangle(double a, double b) {
	super(a, b);
	}

        @Override
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
		}
}
class Triangle extends shape {
	Triangle(double a, double b) {
	super(a, b);
	}

        @Override
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}
class Circle extends shape {
	Circle(double a, double b) {
	super(a, b);
	}
	double area() {
		System.out.println("Inside Area for Circle.");
		return 3.14 * dim1 * dim1;
	}
}
public class Lab3_4_ii {
	public static void main(String args[]) {
	// shape f = new shape(10, 10); // illegal now
	Rectangle r = new Rectangle(9, 5);
	Triangle t = new Triangle(10, 8);
	Circle c = new Circle(10, 0);
	shape figref; // this is OK, no object is created
	figref = r;
	System.out.println("Area of Rectangle is " + figref.area());
	figref = t;
	System.out.println("Area of Triangle is " + figref.area());
	figref = c;
	System.out.println("Area of Circle is " + figref.area());
	}
}