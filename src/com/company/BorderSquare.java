package com.company;

public class BorderSquare extends Figure{

    public BorderSquare(short height){

        if(height > 0){
            this.height = height;
        }
    }

    public void drawFigure() {

        for(int i=0; i<height;i++){
            for(int j=0; j<height; j++){
                if(i==0 || i == height-1 || j==0 || j == height-1){
                    System.out.print('0');
                }
                else{
                    System.out.print(' ');
                }
            }

            System.out.print('\n');
        }
    }
}
