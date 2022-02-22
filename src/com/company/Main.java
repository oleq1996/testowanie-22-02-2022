package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle((short) 5);
        Square square = new Square((short) 5);
        BorderSquare borderSquare = new BorderSquare((short) 5);

        drawFigure(triangle);
        System.out.print('\n');
        drawFigure(square);
        System.out.print('\n');
        drawFigure(borderSquare);

        }

    static void drawFigure(Figure figure){
        if(figure != null){
            figure.drawFigure();
        }
    }

}