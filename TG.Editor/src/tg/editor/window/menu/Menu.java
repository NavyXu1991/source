package tg.editor.window.menu;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Menu {
	public void File(JMenu JMenu){
		JMenuItem mntmFind2 = new JMenuItem("Find2");
		mntmFind2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		JMenu.add(mntmFind2);
	}
}
