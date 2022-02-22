package com.company;

public class Triangle extends Figure {

    public Triangle(short height){

        if(height > 0){
            this.height = height;
        }
    }

    public void drawFigure() {

        for(int i=0; i<height;i++){
            for(int j=0; j<=i; j++){
                System.out.print('0');
            }
            System.out.print('\n');
        }
    }
}

