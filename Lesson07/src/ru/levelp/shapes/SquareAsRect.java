package ru.levelp.shapes;

public class SquareAsRect extends Rectangle {

    public SquareAsRect() {
    }

    public SquareAsRect(double side) {
        super(side, side);

//        width = side;
//        height = side;
//        calcS();
//        calcP();
    }

    //Переопределение
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void draw() {
        System.out.println("Draw square side = " + getWidth());
    }
}
