package Tetris.gui;

import Tetris.model.Position;
import Tetris.model.game.Board;
import Tetris.model.game.QueueOfTetrimino;
import Tetris.model.game.Stats;
import Tetris.model.game.Tetrimino;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawQueue(QueueOfTetrimino queue);

    void drawStats(Stats stats);

    void drawBoard(Board board);

    void drawTetrimino(Tetrimino tetrimino);

    void drawShadowTetrimino(Tetrimino tetrimino);

    void drawText(Position position, String text, String color);

    void drawSquare(Position position, String color);

    void drawOutLine();

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT, Z, SPACE}
}