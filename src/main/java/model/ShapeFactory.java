package model;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ShapeFactory  {

//    Map<Integer, BiFunction<Double, Double, Shape>> shapeCreators = new HashMap<>();
//    shapeCreators.put(1, (x, y) -> new Line(x, y, 200, 45));
//    shapeCreators.put(2, (x, y) -> new Rectangle(x, y, 100, 50));
//    shapeCreators.put(3, (x, y) -> new Hexagon(x, y));
//
//    public static Shape createShape(int num, double x, double y) {
//        BiFunction<Double, Double, Shape> shapeCreator = shapeCreators.get(num);
//        if(shapeCreator!=null){
//
//        }
//    }

    public Shape createShape(int num,double x, double y){
        if(num==1){
            return new Line(x,y,200,45);
        } else if (num==2) {
            return new Rectangle(x,y,100,50);
        } else if (num==3) {
            return new Hexagon(x,y);
        }else {
            return null;
        }
    }
}
