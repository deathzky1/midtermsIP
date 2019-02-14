import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.JComponent;


public class Player extends JComponent{
	
	public int xPos = 150;
	public int yPos = 300;

	public int x = 30;
	public int y = 30;
    public int state = 0;

	public BufferedImage image;
	public URL resource = getClass().getResource("run0.png");

	public Player(){
		try{
			image = ImageIO.read(resource);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void reloadImage(){
		state++;

		if(state == 0){
			resource = getClass().getResource("run0.png");
		}
		else if(state == 1){
			resource = getClass().getResource("run1.png");
		}
		else if(state == 2){
			resource = getClass().getResource("run2.png");
		}
		else if(state == 3){
			resource = getClass().getResource("run3.png");
		}
		else if(state == 4){
			resource = getClass().getResource("run4.png");
		}
		else if(state == 5){
			resource = getClass().getResource("run5.png");
			state = 0;
		}

		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

public void attackAnimation(){
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 5; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("idle/idle0.png");
						}
						else{
							resource = getClass().getResource("attack"+ctr+".png");
						}
						
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
				       repaint();
				        Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread1.start();
	}

	public void airAnimation(){
		Thread thread2 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 14; ctr++){
					try{
						if(ctr == 13){
							resource = getClass().getResource("idle/idle0.png");
						}
						else{
							resource = getClass().getResource("airatt/air"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
					     repaint();
						Thread.sleep(100);
					
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		});
		thread2.start();
	}
	public void bowAnimation(){
		Thread thread3 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 16; ctr++){
					try{
						if(ctr == 15){
							resource = getClass().getResource("idle/idle0.png");
						}
						else{
							resource = getClass().getResource("bowanim/bow"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);
					
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		});
		thread3.start();
	}

	public void drawAnimation(){
		Thread thread4 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 9; ctr++){
					try{
						if(ctr == 8){
							resource = getClass().getResource("idle/idle0.png");
						}
						else{
							resource = getClass().getResource("sworddraw/draw"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);
					
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		});
		thread4.start();
	}
	
	public void attack(){
		attackAnimation();
	}

	public void airAttack(){
		airAnimation();
	}

	public void bowAttack(){
		bowAnimation();
	}
	public void drawSword(){
		drawAnimation();
	}

	public void moveUp(){
		y = y - 5;
		reloadImage();
		repaint();
	}

	public void moveDown(){
		y = y + 5;
		reloadImage();
		repaint();
	}

	public void moveLeft(){
		x = x - 5;
		reloadImage();
		repaint();
	}

	public void moveRight(){
		x = x + 5;
		reloadImage();
		repaint();
	}

	
}