package Tetris.gui;

import Tetris.model.Position;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;
    /*
    void drawBoard();

    void drawQueue();

    void drawTetrimino();

    void drawStats();
     */
    void drawText(Position position, String text, String color);

    void drawSquare(Position position, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}
}