import javax.swing.*;
import java.awt.*;
public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    private TicTacToe t;
    private Image xImage;
    private Image oImage;
    private final int WINDOW_HEIGHT = 500;
    private final int WINDOW_WIDTH = 500;
    private final int CELL_SIDE_LENGTH = 100;
    private final int GRID_SIZE = 3;
    private Square[][] squares;

    public TicTacToeViewer(TicTacToe t) {
        this.t = t;
        this.squares = t.getBoard();

        this.xImage = new ImageIcon("Resources/X.png").getImage();
        this.oImage = new ImageIcon("Resources/O.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                squares[i][j].draw(g);
;            }
        }
//        g.setColor(Color.BLACK);
//        for (int i = 1; i < GRID_SIZE; i++) {
//            g.drawLine(100 + i * CELL_SIDE_LENGTH, 100, 100 + i * CELL_SIDE_LENGTH, WINDOW_HEIGHT - 100);
//            g.drawLine(100, 100 + i * CELL_SIDE_LENGTH, WINDOW_WIDTH - 100, 100 + i * CELL_SIDE_LENGTH);
//        }
//        for (int i = 0; i < GRID_SIZE; i++) {
//            for (int j = 0; j < GRID_SIZE; j++) {
//                if (squares[i][j].isWinningSquare) {
//                    g.setColor(Color.GREEN);
//                    g.fillRect(100 + j * CELL_SIDE_LENGTH, 100 + i * CELL_SIDE_LENGTH, CELL_SIDE_LENGTH, CELL_SIDE_LENGTH);
//                    g.setColor(Color.BLACK);
//                }
//                String squareMarker = squares[i][j].getMarker();
//                if (squareMarker.equals(TicTacToe.X_MARKER)) {
//                    g.drawImage(xImage, 100 + j * CELL_SIDE_LENGTH, 100 + i * CELL_SIDE_LENGTH, CELL_SIDE_LENGTH, CELL_SIDE_LENGTH, this);
//                } else if (squareMarker.equals(TicTacToe.O_MARKER)) {
//                    g.drawImage(oImage, 100 + j * CELL_SIDE_LENGTH, 100 + i * CELL_SIDE_LENGTH, CELL_SIDE_LENGTH, CELL_SIDE_LENGTH, this);
//                }
//            }
//        }

    }
}