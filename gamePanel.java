import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;

public class gamePanel extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int AppleX;
    int AppleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    gamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        StartGame();
    }
    public void StartGame() {

    }
    public void PaintComponent(Graphics g) {

    }
    public void Draw(Graphics g) {

    }
    public void newApple() {
        
    }
    public void Move() {

    }
    public void CheckApple() {

    }
    public void CheckCollisions() {

    }
    public void GameOver(Graphics g) {

    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
