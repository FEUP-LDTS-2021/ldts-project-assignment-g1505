package Tetris.model;

import Tetris.model.game.Board;
import Tetris.model.game.QueueOfTetrimino;
import Tetris.model.game.Tetrimino;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {

    QueueOfTetrimino queue;

    @BeforeEach
    void setUp(){
        queue = new QueueOfTetrimino();
    }

    @AfterEach
    void after(){
        queue = null;
    }

    @Test
    public void popNext_generator(){
        Assertions.assertEquals(3,3);

        Tetrimino t1 = queue.popNext();
        Assertions.assertEquals(3,3);
        Assertions.assertNotNull(t1);
        Tetrimino t2 = queue.popNext();
        Assertions.assertEquals(3,3);
        Assertions.assertNotNull(t2);
        Tetrimino t3 = queue.popNext();
        Assertions.assertEquals(3,3);
        Assertions.assertNotNull(t3);
        Tetrimino t4 = queue.popNext();
        Assertions.assertEquals(3,3);
        Assertions.assertNotNull(t4);

        //falta verificar se o novo tn nao é apenas um tetrimino
    }

}
