package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public class Piece_I extends Piece {
    public Piece_I(){
        super();
        hauteur = 0;
        largeur = 4;
        for (int i=0; i<largeur; i++){
            matrice[0][i]=1;
        }
    }
}
