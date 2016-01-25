package tg.editor.window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import tg.editor.window.menu.Menu;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

public class Window extends JFrame {
	private Window_UI window_UI;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setUndecorated(true);
		TG.TG_WIND_WIDTH=((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
		TG.TG_WIND_HEIGHT = ((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
//		System.out.println(TG.TG_WIND_HEIGHT+"");
//		System.out.println(TG.TG_WIND_WIDTH+"");
		setBounds(0, 0, TG.TG_WIND_WIDTH, TG.TG_WIND_HEIGHT);
		setBackground(new Color(0,0,0,255));
		window_UI = new Window_UI();
		window_UI.setOpaque(false);
		setContentPane(window_UI);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		window_UI.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,0,0,0));
		panel.setLayout(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBounds(138, 0, 600, 26);
		panel.add(menuBar);
		menuBar.setBackground(new Color(0,0,0,0));
		
		
		//------------------------------------------------------------------------
		JMenu mnFile = new JMenu("  File  ");
		mnFile.setForeground(Color.BLACK);
		mnFile.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmNewProject = new JMenuItem("New Project");
		mntmNewProject.setBackground(Color.WHITE);
		mntmNewProject.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmNewProject);
		
		JMenuItem mntmImportProject = new JMenuItem("Import Project");
		mntmImportProject.setBackground(Color.WHITE);
		mntmImportProject.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmImportProject);
		
		mnFile.addSeparator();
		
		JMenuItem mntmNewFile = new JMenuItem("New File");
		mntmNewFile.setBackground(Color.WHITE);
		mntmNewFile.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmNewFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open...");
		mntmOpen.setBackground(Color.WHITE);
		mntmOpen.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSetting = new JMenuItem("Settings");
		mntmSetting.setBackground(Color.WHITE);
		mntmSetting.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmSetting);
		
		mnFile.addSeparator();
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setBackground(Color.WHITE);
		mntmSave.setIcon(new ImageIcon(Window.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmSave.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mntmSaveAs.setBackground(Color.WHITE);
		mntmSaveAs.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmSaveAll = new JMenuItem("Save All");
		mntmSaveAll.setBackground(Color.WHITE);
		mntmSaveAll.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmSaveAll);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.setBackground(Color.WHITE);
		mntmRefresh.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmRefresh);
		
		mnFile.addSeparator();
		
		JMenuItem mntmImportSettings = new JMenuItem("Import Settings");
		mntmImportSettings.setBackground(Color.WHITE);
		mntmImportSettings.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmImportSettings);
		
		JMenuItem mntmExportSettings = new JMenuItem("Export Settings");
		mntmExportSettings.setBackground(Color.WHITE);
		mntmExportSettings.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmExportSettings);
		
		mnFile.addSeparator();
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mntmPrint.setBackground(Color.WHITE);
		mntmPrint.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFile.add(mntmPrint);
		
		mnFile.addSeparator();
		
		JMenuItem mnQuit = new JMenuItem("Quit");
		mnQuit.setBackground(Color.WHITE);
		mnQuit.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnQuit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				dispose();
			}
		});
		
		
		mnFile.add(mnQuit);
		
		//-------------------------------------------------------------
		
		JMenu mnEdit = new JMenu("  Edit  ");
		mnEdit.setForeground(Color.BLACK);
		mnEdit.setBackground(Color.WHITE);
		mnEdit.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo...");
		mntmUndo.setBackground(Color.WHITE);
		mntmUndo.setIcon(new ImageIcon(Window.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		mntmUndo.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo...");
		mntmRedo.setBackground(Color.WHITE);
		mntmRedo.setIcon(new ImageIcon(Window.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		mntmRedo.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mntmRedo);
		
		mnEdit.addSeparator();
		
		JMenuItem mntmCut = new JMenuItem("Cut...");
		mntmCut.setBackground(Color.WHITE);
		mntmCut.setIcon(new ImageIcon(Window.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		mntmCut.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mntmCut);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mntmCopy.setBackground(Color.WHITE);
		mntmCopy.setIcon(new ImageIcon(Window.class.getResource("/com/sun/javafx/scene/web/skin/Copy_16x16_JFX.png")));
		mntmCopy.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mntmPaste.setBackground(Color.WHITE);
		mntmPaste.setIcon(new ImageIcon(Window.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		mntmPaste.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mntmPaste);
		
		JMenuItem mntmDelet = new JMenuItem("Delete");
		mntmDelet.setBackground(Color.WHITE);
		mntmDelet.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mntmDelet);
		
		mnEdit.addSeparator();
		
		JMenu mnFind = new JMenu("Find...");
		mnFind.setBackground(Color.WHITE);
		mnFind.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnEdit.add(mnFind);
		
		JMenuItem mntmFind = new JMenuItem("Find");
		mntmFind.setBackground(Color.WHITE);
		mntmFind.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnFind.add(mntmFind);
		
		
		//----------------------------------------------------------------------------------
		JMenu mnNavigate = new JMenu("  Navigate  ");
		mnNavigate.setForeground(Color.BLACK);
		mnNavigate.setBackground(new Color(0,0,0,0));
		mnNavigate.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnNavigate);
		
		
		//----------------------------------------------------------------------------------
		JMenu mnSearch = new JMenu("  Search  ");
		mnSearch.setForeground(Color.BLACK);
		mnSearch.setBackground(new Color(0,0,0,0));
		mnSearch.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnSearch);
		new Menu().File(mnSearch);
		
		JMenu mnProgect = new JMenu("  Progect  ");
		mnProgect.setForeground(Color.BLACK);
		mnProgect.setBackground(Color.WHITE);
		mnProgect.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnProgect);
		
		JMenuItem mntmOpenProgect = new JMenuItem("Open Progect");
		mntmOpenProgect.setBackground(Color.WHITE);
		mntmOpenProgect.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnProgect.add(mntmOpenProgect);
		
		JMenuItem mntmCloseProgect = new JMenuItem("Close Progect");
		mntmCloseProgect.setBackground(Color.WHITE);
		mntmCloseProgect.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnProgect.add(mntmCloseProgect);
		
		mnProgect.addSeparator();
		
		JMenuItem mntmBuild = new JMenuItem("Build");
		mntmBuild.setBackground(Color.WHITE);
		mntmBuild.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnProgect.add(mntmBuild);
		
		JMenuItem mntmBuildAll = new JMenuItem("Build All");
		mntmBuildAll.setBackground(Color.WHITE);
		mntmBuildAll.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnProgect.add(mntmBuildAll);
		
		mnProgect.addSeparator();
		
		JMenuItem mntmClear = new JMenuItem("Clear");
		mntmClear.setBackground(Color.WHITE);
		mntmClear.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnProgect.add(mntmClear);
		
		mnProgect.addSeparator();
		
		JMenuItem mntmProperty = new JMenuItem("Property");
		mntmProperty.setBackground(Color.WHITE);
		mntmProperty.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnProgect.add(mntmProperty);
		
		
		//----------------------------------------------------------------------------------
		JMenu mnRun = new JMenu("  Run  ");
		mnRun.setForeground(Color.BLACK);
		mnRun.setBackground(new Color(0,0,0,0));
		mnRun.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnRun);
		
		JMenuItem mntmRun = new JMenuItem("Run");
		mntmRun.setBackground(Color.WHITE);
		mntmRun.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnRun.add(mntmRun);
		
		mnRun.addSeparator();
		
		JMenu mnRunHistory = new JMenu("Run History");
		mnRunHistory.setBackground(Color.WHITE);
		mnRunHistory.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnRun.add(mnRunHistory);
		
		JMenu mnRunMode = new JMenu("Run Mode");
		mnRunMode.setBackground(Color.WHITE);
		mnRunMode.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnRun.add(mnRunMode);
		
		mnRun.addSeparator();
		
		JMenuItem mntmRunConfiguratio = new JMenuItem("Run Configuratio");
		mntmRunConfiguratio.setBackground(Color.WHITE);
		mntmRunConfiguratio.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnRun.add(mntmRunConfiguratio);
		//------------------------------------------------------------
		JMenu mnWindow = new JMenu("  Window  ");
		mnWindow.setForeground(Color.BLACK);
		mnWindow.setBackground(new Color(0,0,0,0));
		mnWindow.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnWindow);
		
		JMenuItem mntmNewWindow = new JMenuItem("New Window");
		mntmNewWindow.setBackground(Color.WHITE);
		mntmNewWindow.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnWindow.add(mntmNewWindow);
		
		JMenuItem mntmNewTgEditor = new JMenuItem("New TG Editor");
		mntmNewTgEditor.setBackground(Color.WHITE);
		mntmNewTgEditor.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnWindow.add(mntmNewTgEditor);
		
		mnWindow.addSeparator();
		
		JMenuItem mntmCloseWindow = new JMenuItem("Close Window");
		mntmCloseWindow.setBackground(Color.WHITE);
		mntmCloseWindow.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnWindow.add(mntmCloseWindow);
		
		JMenuItem mntmCloseTgEditor = new JMenuItem("Close TG Editor");
		mntmCloseTgEditor.setBackground(Color.WHITE);
		mntmCloseTgEditor.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnWindow.add(mntmCloseTgEditor);
		
		mnWindow.addSeparator();
		
		JMenu mnEditorTabs = new JMenu("Editor Tabs");
		mnEditorTabs.setBackground(Color.WHITE);
		mnEditorTabs.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnWindow.add(mnEditorTabs);
		
		mnWindow.addSeparator();
		
		//----------------------------------------------------------------------------------
		JMenu mnHelp = new JMenu(" Help  ");
		mnHelp.setForeground(Color.BLACK);
		mnHelp.setBackground(new Color(0,0,0,0));
		mnHelp.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		menuBar.add(mnHelp);
		
		JMenuItem mntmTgEdit = new JMenuItem("TG Edit");
		mntmTgEdit.setBackground(Color.WHITE);
		mntmTgEdit.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnHelp.add(mntmTgEdit);
		
		mnHelp.addSeparator();
		
		JMenuItem mntmHelpContent = new JMenuItem("Help Content");
		mntmHelpContent.setBackground(Color.WHITE);
		mntmHelpContent.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnHelp.add(mntmHelpContent);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mntmSearch.setBackground(Color.WHITE);
		mntmSearch.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnHelp.add(mntmSearch);
		
		mnHelp.addSeparator();
		
		JMenuItem mntmCheckForUpdates = new JMenuItem("Check for Updates");
		mntmCheckForUpdates.setBackground(Color.WHITE);
		mntmCheckForUpdates.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnHelp.add(mntmCheckForUpdates);
		
		mnHelp.addSeparator();
		
		JMenuItem mntmAboutEditor = new JMenuItem("About Editor");
		mntmAboutEditor.setBackground(Color.WHITE);
		mntmAboutEditor.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		mnHelp.add(mntmAboutEditor);
		
		JLabel lblNewLabel_close = new JLabel("");
		lblNewLabel_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_close.setBackground(new Color(0,0,0,0));
		lblNewLabel_close.setBounds(TG.TG_WIND_WIDTH-44, 0, 23, 22);
		panel.add(lblNewLabel_close);
		
		JLabel lblNewLabel_min = new JLabel("");
		lblNewLabel_min.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		lblNewLabel_min.setBackground(new Color(0,0,0,0));
		lblNewLabel_min.setBounds(TG.TG_WIND_WIDTH-74, 0, 23, 22);
		panel.add(lblNewLabel_min);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255,255,255,255));
		
		JPanel panel_path = new JPanel();
		panel_path.setBackground(new Color(0,0,0,0));
		
		JSeparator separator_1 = new JSeparator();
		
		JPanel panel_work = new JPanel();
		panel_work.setBackground(new Color(0,0,0,0));
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		GroupLayout gl_panel_work = new GroupLayout(panel_work);
		gl_panel_work.setHorizontalGroup(
			gl_panel_work.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_work.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
		);
		gl_panel_work.setVerticalGroup(
			gl_panel_work.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_work.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_work.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)))
		);
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
		);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		panel_4.setLayout(gl_panel_4);
		panel_work.setLayout(gl_panel_work);
		
		JSeparator separator_2 = new JSeparator();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0,0,0,0));
		GroupLayout gl_window_UI = new GroupLayout(window_UI);
		gl_window_UI.setHorizontalGroup(
			gl_window_UI.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_window_UI.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_window_UI.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1362, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_work, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_path, GroupLayout.PREFERRED_SIZE, 1362, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1362, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1362, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 1362, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1362, GroupLayout.PREFERRED_SIZE)))
		);
		gl_window_UI.setVerticalGroup(
			gl_window_UI.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_window_UI.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_window_UI.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_window_UI.createSequentialGroup()
							.addGap(25)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_window_UI.createSequentialGroup()
							.addGap(51)
							.addComponent(panel_work, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_window_UI.createSequentialGroup()
							.addGap(26)
							.addComponent(panel_path, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_window_UI.createSequentialGroup()
							.addGap(54)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_window_UI.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_window_UI.createSequentialGroup()
							.addGap(1)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
		);
		window_UI.setLayout(gl_window_UI);

	}
}
