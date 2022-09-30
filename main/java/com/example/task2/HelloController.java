package com.example.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Line;
import model.Rectangular;
import model.Tring;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas my_canvas;
    private GraphicsContext gc;

    @FXML
    protected void onReactClick(ActionEvent event) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight()); // очистка холста
        Rectangular react = new Rectangular(Color.LIGHTCORAL, 300, 100);
        react.DrawShape(gc);
        System.out.println(react.toString());
    }

    @FXML
    protected void onLineClick(ActionEvent event) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight()); // очистка холста
        Line line = new Line(Color.DARKORANGE, 200.0);
        line.DrawShape(gc);
        System.out.println(line.toString());
    }

    @FXML
    protected void onTringClick(ActionEvent event) {
        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight()); // очистка холста
        Tring tr = new Tring(Color.PLUM, 200, 150);
        tr.DrawShape(gc);
        System.out.println(tr.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = my_canvas.getGraphicsContext2D();
    }
}