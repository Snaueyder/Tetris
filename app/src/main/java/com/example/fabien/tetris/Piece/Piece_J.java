package com.example.fabien.tetris.Piece;

/**
 * Created by Fabien on 12/01/2018.
 */

public class Piece_J extends Piece {
    public Piece_J(){
        super();
        hauteur = 2;
        largeur = 3;
        for(int i=0;i<hauteur;i++){
            for (int j = 0; j < largeur; j++) {
                matrice[i][j] = 1;
                if ((i == 0 && j == 1) || (i == 0 && j == largeur-1)) {
                    matrice[i][j] = 0;
                }
            }
        }
    }
}
