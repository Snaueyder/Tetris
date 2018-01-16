package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public class Piece_Z extends Piece {
    public Piece_Z(){
        hauteur = 2;
        largeur = 3;
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                matrice[i][j] = 1;
                if ((i == 1 && j == 0) || (i == 0 && j == largeur-1)) {
                    matrice[0][0] = 0;
                }
            }
        }
    }
}
