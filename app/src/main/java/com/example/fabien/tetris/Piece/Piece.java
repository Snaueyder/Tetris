package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public abstract class Piece implements Mouvement, Mouvement_possible {

    protected int hauteur;
    protected int largeur;
    protected int [][] matrice;
    protected int pos_i;
    protected int pos_j;
    protected int color;

    public int getHauteur(){
        return hauteur;
    }

    public int getLargeur(){
        return  largeur;
    }

    public int[][] getMatrice() {
        return matrice;
    }

    public int getPos_i(){
        return pos_i;
    }

    public int getPos_j(){
        return pos_j;
    }

    public int getColor(){
        return color;
    }

    @Override
    public void rotate() {

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public void down() {

    }
}
