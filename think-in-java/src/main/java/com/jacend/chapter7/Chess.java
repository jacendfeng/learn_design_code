package com.jacend.chapter7;

/**
 * @author fengxf
 * @since 2018-10-11
 */
class Game {

    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {

    Chess(int i) {
        super(i);
    }
}
