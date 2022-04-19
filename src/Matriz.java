import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Matriz {
    private int rows;
    private int columns;
    public Matriz(int rows, int columns){
        this.rows = rows;
        this.columns = columns;

    }
    public Node[][] getMatrix(listaDblEnlace lista) {

        Node current = lista.getHead();
        Node[][] matrix = new Node[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = current;
                current = current.getNext();
            }
        }
        return matrix;
    }
}
