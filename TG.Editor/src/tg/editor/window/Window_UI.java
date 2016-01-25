package tg.editor.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Window_UI extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255,255,255,230));
		g2d.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, 10, 10);
		
		g2d.setClip(0, 0, getWidth(), 30);
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(2, 2, getWidth()-4, 27, 10, 10);
		g2d.setClip(null);
		
		g2d.setClip(0, 0, getWidth(), 30);
		g2d.setColor(Color.WHITE);
		g2d.fillRect(2, 15, TG.TG_WIND_WIDTH-4, 27);
		g2d.setClip(null);
		
		g2d.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		g2d.setColor(Color.BLACK);
		g2d.drawString("TG.Editor", 25, 23);
		
		g2d.setClip(TG.TG_WIND_WIDTH-40, 2, 25, 25);
		g2d.setColor(Color.RED);
		g2d.fillOval(TG.TG_WIND_WIDTH-40, 7, 17, 17);
		g2d.setClip(null);
		
		g2d.setClip(TG.TG_WIND_WIDTH-70, 2, 25, 25);
		g2d.setColor(Color.ORANGE);
		g2d.fillOval(TG.TG_WIND_WIDTH-70, 7, 17, 17);
		g2d.setClip(null);
		
	}

	@Override
	protected void paintChildren(Graphics g) {
		// TODO Auto-generated method stub
		super.paintChildren(g);
	}

	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.paintBorder(g);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}
	
}
