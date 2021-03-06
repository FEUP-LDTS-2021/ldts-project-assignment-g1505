package Tetris.model.game;

public class Screen {

    private final int width;
    private final int height;

    private QueueOfTetrimino queueOfTetrimino;
    private Board board;
    private Tetrimino tetrimino;
    private Tetrimino shadowTetrimino;
    private Stats stats;
    private Music music;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;

        this.music = Music.getInstance();
        this.board = new Board(width, height);
        this.queueOfTetrimino = new QueueOfTetrimino();
        this.stats = new Stats();
        this.tetrimino = queueOfTetrimino.popNext();
        this.shadowTetrimino = this.tetrimino.copy();

        startMusic();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public QueueOfTetrimino getQueueOfTetrimino() {
        return queueOfTetrimino;
    }

    public Board getBoard() {
        return board;
    }

    public Tetrimino getTetrimino() { return tetrimino; }
    
    public void setTetrimino(Tetrimino tetrimino) { this.tetrimino = tetrimino;}

    public Tetrimino getShadowTetrimino() {
        return shadowTetrimino;
    }

    public void setShadowTetrimino(Tetrimino shadowTetrimino) {
        this.shadowTetrimino = shadowTetrimino;
    }

    public Stats getStats() {
        return stats;
    }

    public void startMusic(){
        music.startMusic();
    }

    public void stopMusic(){
        music.stopMusic();
    }
}
