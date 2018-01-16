package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public class Piece_L extends Piece {
    public Piece_L(){
        super();
        hauteur = 2;
        largeur = 3;
        for(int i=0;i<hauteur;i++){
            for (int j = 0; j < largeur; j++) {
                if (i == 1) {
                    matrice[i][j] = 1;
                } else {
                    matrice[i][j] = 0;
                }
            }
        }
        matrice[0][2] = 1;
    }
}
