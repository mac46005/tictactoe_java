package com.preciado.tictactoe.models;

public class Board {
    int length = 0;
    int width = 0;
    int[][] matrix;
    public Board() {

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
