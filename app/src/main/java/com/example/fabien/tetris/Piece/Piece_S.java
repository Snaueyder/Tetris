package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public class Piece_S extends Piece {
    public Piece_S(){
        hauteur = 2;
        largeur = 3;
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                matrice[i][j] = 1;
                if ((i == 0 && j == 0) || (i == hauteur-1 && j == largeur-1)) {
                    matrice[0][0] = 0;
                }
            }
        }
    }
}
