import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Matriz {

    public listaDblEnlace addFiles(File[] files){
        listaDblEnlace listaImagenes = new listaDblEnlace();
        for(File file : files){
            listaImagenes.insertFirst(file);
        }
        return listaImagenes;
    }

    public Matriz(listaDblEnlace lista, int rows, int columns){

        Node current = lista.getHead();

        Node[][] matrix = new Node[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j< columns; j++){
                if((i & j) == 0){
                    matrix[i][j] = current;
                }else{
                    matrix[i][j] = current.getNext();
                    current = current.getNext();
                }
            }
        }
    }
}
