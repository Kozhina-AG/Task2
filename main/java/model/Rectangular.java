package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangular extends Shapes{
    public int length;
    public int height;

    public String toString(){
        return "Площадь прямоугольника: "+ Area() + " Цвет прямоугольника: "+super.ShapeColor;
        //return "Периметр прямоугольника: "+ Perimetr() + " Цвет прямоугольника: "+super.ShapeColor;
    }

    public void DrawShape(GraphicsContext gc){
        gc.setFill(super.ShapeColor);
        gc.fillRect(10,10,this.length,this.height);
    }
    public double Area(){
        return length * height;
    }

    public double Perimetr(){
        return (length * height) * 2;
    }
    public Rectangular(Color color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }
}
