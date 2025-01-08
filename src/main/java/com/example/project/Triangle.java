package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      /* IMPLEMENT ME */
      vertices = new Point[3];
      vertices[0] = p1;
      vertices[1] = p2;
      vertices[2] = p3;
    }
    
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      /* IMPLEMENT ME */
      double side1 = vertices[0].distanceTo(vertices[1]);
      double side2 = vertices[1].distanceTo(vertices[2]);
      double side3 = vertices[2].distanceTo(vertices[0]);
      return side1 + side2 + side3;
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      /* IMPLEMENT ME */
      String str = "[" + vertices[0].pointInfo();
      str += ", " + vertices[1].pointInfo();
      str += ", " + vertices[2].pointInfo() + "]";
      return str;
    } 

    // Added getter
    public Point[] getVertices() {
      return vertices;
    }
}