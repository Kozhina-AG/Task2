package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {

    double length;

    public String toString(){

        return "Длина линии: "+ Area() + " Цвет линии: "+super.ShapeColor;
        //return "Длина линии: "+ Perimetr() + " Цвет линии: "+super.ShapeColor;
    }
    public void DrawShape(GraphicsContext gc){
        gc.setStroke(super.ShapeColor);
        gc.strokeLine(0, 0, length, 0);
    }
    public double Area(){
    return length;
    }

    public double Perimetr(){
        return length;
    }

    public Line(Color color, double length) {
        super(color);
        this.length = length;
    }
}
