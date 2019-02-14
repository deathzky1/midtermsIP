import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{

	Draw drawing;
	Player player;

	public MyFrame(){
		this.drawing = new Draw();
		this.player = new Player();
		
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			player.moveUp();
			System.out.println("pos: " + player.x + ", " + player.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			player.moveRight();
			System.out.println("pos: " + player.x + ", " + player.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			player.moveDown();
			System.out.println("pos: " + player.x + ", " + player.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			player.moveLeft();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			player.attack();
			System.out.println("attack");
		}
		else if(e.getKeyCode() == KeyEvent.VK_A){
			player.airAttack();
			System.out.println("HIYAAAAAH");
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			player.bowAttack();
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
		}
	else if(e.getKeyCode() == KeyEvent.VK_D){
			player.drawSword();
			System.out.println("SCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHEEEEK");
	}
}

	public void keyReleased(KeyEvent e){

	}

	public void keyTyped(KeyEvent e){
		
	}

	public static void main(String args[]){
		MyFrame gameFrame = new MyFrame();
		gameFrame.setSize(600,600);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		gameFrame.getContentPane().add(gameFrame.drawing);
		gameFrame.addKeyListener(gameFrame);
		System.out.println("practical programming");
	}
}