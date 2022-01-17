package Tetris.states;

import Tetris.Main;
import Tetris.controller.MenuController;
import Tetris.gui.GUI;
import Tetris.model.menu.Menu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class StatesTest {

    MenuController menuController;
    Menu menu;
    Main main;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        main = Main.getInstance();
        menu = new Menu();
        menuController = new MenuController(menu);
    }

    @AfterEach
    void after(){
        main.setState(new MenuState(new Menu()));
        menu = null;
        menuController = null;
    }

    @Test
    void actionDown(){
        menuController.step(main, GUI.ACTION.DOWN, 0);
        Assertions.assertTrue(menuController.getModel().isSelectedRules());
    }

    @Test
    void actionUp(){
        menuController.step(main, GUI.ACTION.UP, 0);
        Assertions.assertTrue(menuController.getModel().isSelectedExit());
    }

    @Test
    void actionQuit(){
        menuController.step(main, GUI.ACTION.QUIT, 0);
        Assertions.assertEquals(null, main.getState());
    }

    @Test
    void actionSelect(){
        menuController.step(main, GUI.ACTION.DOWN, 0);
        menuController.step(main, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(Tetris.states.RulesState.class, main.getState().getClass());
    }
}
