class Circle extends Shape {
    public double radius;
    
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area: %.2f\n", area);
    }
}
  