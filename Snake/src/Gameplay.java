import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private int[] snakeXLength = new int[750];
    private int[] snakeYLength = new int[750];

    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    private ImageIcon rightMouth;
    private ImageIcon upMouth;
    private ImageIcon downMouth;
    private ImageIcon leftMouth;
    private ImageIcon snakeImage;
    private ImageIcon titleImage;
    private ImageIcon enemyImage;

    private Timer timer;
    private int delay = 100;
    
    private int snakeLength = 3;
    private int moves = 0;
    private int speed = 25;
    
    private int[] enemyXPos = {25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325,
    		350, 375, 400, 425, 450, 475, 500, 525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 
    		775, 800, 825, 850};
    private int[] enemyYPos = {75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325,
    		350, 375, 400, 425, 450, 475, 500, 525, 550, 575, 600, 625};
    
    private Random random = new Random();
    
    private int xPos = random.nextInt(34);
    private int yPos = random.nextInt(23);
    
    private int score = 0;
    
    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        if (moves == 0) {
            snakeXLength[2] = 50;
            snakeXLength[1] = 75;
            snakeXLength[0] = 100;

            snakeYLength[2] = 100;
            snakeYLength[1] = 100;
            snakeYLength[0] = 100;
        }

        // draw title image border
        g.setColor(Color.WHITE);
        g.drawRect(24, 10, 851, 55);

        // draw title image
        titleImage = new ImageIcon("snaketitle.jpg");
        titleImage.paintIcon(this, g, 25, 11);

        // draw border for playing area
        g.setColor(Color.WHITE);
        g.drawRect(24, 74, 851, 577);

        // draw background for gameplay
        g.setColor(Color.black);
        g.fillRect(25, 75, 850, 575);

        //draw scores
        g.setColor(Color.white);
        g.setFont(new Font("arial", Font.PLAIN, 14));
        g.drawString("Score: " + score, 780, 30);
        
        //draw length
        g.setColor(Color.white);
        g.setFont(new Font("arial", Font.PLAIN, 14));
        g.drawString("Length: " + snakeLength, 780, 50);
        
        //draw speed
        g.setColor(Color.white);
        g.setFont(new Font("arial", Font.PLAIN, 14));
        g.drawString("Speed " + speed, 700, 30);
        
        rightMouth = new ImageIcon("rightmouth.png");
        rightMouth.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);

        for (int a = 0; a < snakeLength; a++) {
        	if (a == 0 && right) {
        		rightMouth = new ImageIcon("rightmouth.png");
                rightMouth.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
        	}
        	if(a == 0 && left) {
                leftMouth = new ImageIcon("leftmouth.png");
                leftMouth.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
        	}
        	if(a == 0 && up) {
        		   upMouth = new ImageIcon("upmouth.png");
                   upMouth.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
        	}
        	if(a == 0 && down) {
        		downMouth = new ImageIcon("downmouth.png");
                downMouth.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
        	}
        	if(a != 0) {
        		snakeImage = new ImageIcon("snakeimage.png");
                snakeImage.paintIcon(this, g, snakeXLength[a], snakeYLength[a]);
        	}        		
        }
        
        enemyImage = new ImageIcon("enemy.png");
        
        if((enemyXPos[xPos] == snakeXLength[0]) && (enemyYPos[yPos] == snakeYLength[0])) {
        	score++;
        	snakeLength++;
        	//speed = 25 + (score * 5);
        	xPos = random.nextInt(34);
        	yPos = random.nextInt(23);
        }

        enemyImage.paintIcon(this, g, enemyXPos[xPos], enemyYPos[yPos]);
        
        for(int b = 1; b < snakeLength; b++) {
        	if (snakeXLength[b] == snakeXLength[0] && snakeYLength[b] == snakeYLength[0]) {
        		right = false;
        		left = false;
        		up = false;
        		down = false;
        		
        		g.setColor(Color.white);
        		g.setFont(new Font("arial", Font.BOLD, 50));
        		g.drawString("Game Over", 300, 300);
        		
        		g.setFont(new Font("arial", Font.BOLD, 20));
        		g.drawString("Space to RESTART", 350, 340);
        	}
        }
        
        g.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        /*
        System.out.println("Right = " + right);
        System.out.println("Left = " + left);
        System.out.println("Up = " + up);
        System.out.println("Down = " + down);
        */
        if (right) {
            //System.out.println("RIGHT!!!");
            for (int r = snakeLength - 1; r >= 0; r--) {
                snakeYLength[r + 1] = snakeYLength[r];
            }
            for (int r = snakeLength; r >= 0; r--) {
                if (r == 0) {
                    snakeXLength[r] = snakeXLength[r] + 25;
                }
                else {
                    snakeXLength[r] = snakeXLength[r - 1];
                }
                if (snakeXLength[r] > 850) {
                    snakeXLength[r] = 25;
                }
            }
            
            repaint();
        }
        if (left) {
            //System.out.println("Left!");
        	 for (int r = snakeLength - 1; r >= 0; r--) {
                 snakeYLength[r + 1] = snakeYLength[r];
             }
             for (int r = snakeLength; r >= 0; r--) {
                 if (r == 0) {
                     snakeXLength[r] = snakeXLength[r] - 25;
                 }
                 else {
                     snakeXLength[r] = snakeXLength[r - 1];
                 }
                 if (snakeXLength[r] < 25) {
                     snakeXLength[r] = 850;
                 }
             }
             
             repaint();
        }
        if (up) {
            //System.out.println("UP!");
        	 for (int r = snakeLength - 1; r >= 0; r--) {
                 snakeXLength[r + 1] = snakeXLength[r];
             }
             for (int r = snakeLength; r >= 0; r--) {
                 if (r == 0) {
                     snakeYLength[r] = snakeYLength[r] - 25;
                 }
                 else {
                     snakeYLength[r] = snakeYLength[r - 1];
                 }
                 if (snakeYLength[r] < 75) {
                     snakeYLength[r] = 625;
                 }
             }
             
             repaint();
        }
        if (down) {
            //System.out.println("DOWN!");
        	 for (int r = snakeLength - 1; r >= 0; r--) {
                 snakeXLength[r + 1] = snakeXLength[r];
             }
             for (int r = snakeLength; r >= 0; r--) {
                 if (r == 0) {
                     snakeYLength[r] = snakeYLength[r] + 25;
                 }
                 else {
                     snakeYLength[r] = snakeYLength[r - 1];
                 }
                 if (snakeYLength[r] > 625) {
                     snakeYLength[r] = 75;
                 }
             }
             
             repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
    	if(e.getKeyCode() == KeyEvent.VK_SPACE) {
    		moves = 0;
    		score = 0;
    		snakeLength = 3;
    		speed = 25;
    		repaint();
    	}
    	
    	//System.out.println("Step 0: left = "  + left);
    	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    		 moves++;
             right = true;
             //System.out.println("Step 1a: right = "  + right);
             //System.out.println("Step 1b: left = "  + left);
             if (!left) {
                 right = true;
                 //System.out.println("Step 2a: left = "  + left);
                 //System.out.println("Step 2b: right = "  + right);
             } 
             else {
                 right = false;
                 left = true;
                 //System.out.println("Step 3a: right = "  + right);
                 //System.out.println("Step 3b: left = "  + left);
             }

             up = false;
             down = false;
             //System.out.println("Step 4: up = "  + up);
             //System.out.println("Step 5: down = "  + down);
             //System.out.println("Right = " + right);
    	}
    	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
   		 moves++;
            left = true;
            if (!right) {
                left = true;
            } 
            else {
                left = false;
                right = true;
            }

            up = false;
            down = false;
            //System.out.println("Left = " + left);
    	}
    	if (e.getKeyCode() == KeyEvent.VK_UP) {
   		 moves++;
            up = true;
            if (!down) {
                up = true;
            } 
            else {
                up = false;
                down = true;
            }

            right = false;
            left = false;
            //System.out.println("Up = " + up);
    	}
    	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
   		 moves++;
            down = true;
            if (!up) {
                down = true;
            } 
            else {
                down = false;
                up = true;
            }

            right = false;
            left = false;
            //System.out.println("Down = " + down);
    	}
    	
        /*
        System.out.println("Right = " + right);
        System.out.println("Left = " + left);
        System.out.println("Up = " + up);
        System.out.println("Down = " + down);
       	*/
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
