package com.zjq.javadesignmode.ui.open_close;

public class OCP {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
        editor.drawShape(new Rectangle());
    }
}

abstract class Shape {
    abstract void draw();
}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
//    private void drawRectangle(Shape s) {
//        System.out.println("矩形");
//    }
//
//    private void drawCircle(Shape s) {
//        System.out.println("圆形");
//    }
//
//    private void drawTriangle(Shape s) {
//        System.out.println("三角形");
//    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}