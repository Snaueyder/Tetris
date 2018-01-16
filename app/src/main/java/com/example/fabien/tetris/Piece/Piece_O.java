package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public class Piece_O extends Piece {
    public Piece_O(){
        super();
        hauteur = 2;
        largeur = 2;
        for(int i=0;i<hauteur;i++){
            for (int j = 0; j < largeur; j++) {
                matrice[i][j] = 1;
            }
        }
    }
}
