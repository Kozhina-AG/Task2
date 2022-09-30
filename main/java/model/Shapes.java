package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapes {
    protected Color ShapeColor;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc);

    public abstract double Area();
    public abstract double Perimetr();

    public Shapes(Color color) {
        this.ShapeColor = color;
    }
}
