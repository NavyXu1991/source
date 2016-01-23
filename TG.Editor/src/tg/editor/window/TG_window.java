package tg.editor.window;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JDesktopPane;

import tg.editor.window.menu.Menu;



public class TG_window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TG_window window = new TG_window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TG_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TG.TG_WIND_WIDTH=((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
		TG.TG_WIND_HEIGHT = ((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
//		System.out.println(TG.TG_WIND_HEIGHT+"");
//		System.out.println(TG.TG_WIND_WIDTH+"");
		int TG_WIND_WIDTH = 1366;
		int TG_WIND_HEIGHT = 768;
		frame = new JFrame();
		frame.setBounds(0, 0, TG_WIND_WIDTH, TG_WIND_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("control"));
		menuBar.setBounds(0, 0, TG_WIND_WIDTH, 27);
		frame.getContentPane().add(menuBar);
		//------------------------------------------------------------------------
		JMenu mnFile = new JMenu("  File  ");
		mnFile.setIcon(new ImageIcon(TG_window.class.getResource("/tg/editor/window/icon/icon.PNG")));
		mnFile.setBackground(UIManager.getColor("control"));
		mnFile.setForeground(Color.BLACK);
		mnFile.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnFile);
		
		JMenuItem mntmNewProject = new JMenuItem("New Project");
		mntmNewProject.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmNewProject);
		
		JMenuItem mntmImportProject = new JMenuItem("Import Project");
		mntmImportProject.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmImportProject);
		
		mnFile.addSeparator();
		
		JMenuItem mntmNewFile = new JMenuItem("New File");
		mntmNewFile.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmNewFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open...");
		mntmOpen.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSetting = new JMenuItem("Settings");
		mntmSetting.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmSetting);
		
		mnFile.addSeparator();
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon(TG_window.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmSave.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mntmSaveAs.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmSaveAll = new JMenuItem("Save All");
		mntmSaveAll.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmSaveAll);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmRefresh);
		
		mnFile.addSeparator();
		
		JMenuItem mntmImportSettings = new JMenuItem("Import Settings");
		mntmImportSettings.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmImportSettings);
		
		JMenuItem mntmExportSettings = new JMenuItem("Export Settings");
		mntmExportSettings.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmExportSettings);
		
		mnFile.addSeparator();
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mntmPrint.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFile.add(mntmPrint);
		
		mnFile.addSeparator();
		
		JMenuItem mnQuit = new JMenuItem("Quit");
		mnQuit.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnQuit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				frame.dispose();
			}
		});
		
		
		mnFile.add(mnQuit);
		
		//-------------------------------------------------------------
		
		JMenu mnEdit = new JMenu("  Edit  ");
		mnEdit.setForeground(Color.BLACK);
		mnEdit.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo...");
		mntmUndo.setIcon(new ImageIcon(TG_window.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		mntmUndo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo...");
		mntmRedo.setIcon(new ImageIcon(TG_window.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		mntmRedo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mntmRedo);
		
		mnEdit.addSeparator();
		
		JMenuItem mntmCut = new JMenuItem("Cut...");
		mntmCut.setIcon(new ImageIcon(TG_window.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		mntmCut.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mntmCut);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mntmCopy.setIcon(new ImageIcon(TG_window.class.getResource("/com/sun/javafx/scene/web/skin/Copy_16x16_JFX.png")));
		mntmCopy.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mntmPaste.setIcon(new ImageIcon(TG_window.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		mntmPaste.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mntmPaste);
		
		JMenuItem mntmDelet = new JMenuItem("Delete");
		mntmDelet.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mntmDelet);
		
		mnEdit.addSeparator();
		
		JMenu mnFind = new JMenu("Find...");
		mnFind.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnEdit.add(mnFind);
		
		JMenuItem mntmFind = new JMenuItem("Find");
		mntmFind.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnFind.add(mntmFind);
		
		
		//----------------------------------------------------------------------------------
		JMenu mnNavigate = new JMenu("  Navigate  ");
		mnNavigate.setForeground(Color.BLACK);
		mnNavigate.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnNavigate);
		
		
		//----------------------------------------------------------------------------------
		JMenu mnSearch = new JMenu("  Search  ");
		mnSearch.setForeground(Color.BLACK);
		mnSearch.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnSearch);
		new Menu().File(mnSearch);
		
		JMenu mnProgect = new JMenu("  Progect  ");
		mnProgect.setForeground(Color.BLACK);
		mnProgect.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnProgect);
		
		JMenuItem mntmOpenProgect = new JMenuItem("Open Progect");
		mntmOpenProgect.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnProgect.add(mntmOpenProgect);
		
		JMenuItem mntmCloseProgect = new JMenuItem("Close Progect");
		mntmCloseProgect.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnProgect.add(mntmCloseProgect);
		
		mnProgect.addSeparator();
		
		JMenuItem mntmBuild = new JMenuItem("Build");
		mntmBuild.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnProgect.add(mntmBuild);
		
		JMenuItem mntmBuildAll = new JMenuItem("Build All");
		mntmBuildAll.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnProgect.add(mntmBuildAll);
		
		mnProgect.addSeparator();
		
		JMenuItem mntmClear = new JMenuItem("Clear");
		mntmClear.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnProgect.add(mntmClear);
		
		mnProgect.addSeparator();
		
		JMenuItem mntmProperty = new JMenuItem("Property");
		mntmProperty.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnProgect.add(mntmProperty);
		//----------------------------------------------------------------------------------
		JMenu mnRun = new JMenu("  Run  ");
		mnRun.setForeground(Color.BLACK);
		mnRun.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnRun);
		
		JMenuItem mntmRun = new JMenuItem("Run");
		mntmRun.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnRun.add(mntmRun);
		
		mnRun.addSeparator();
		
		JMenu mnRunHistory = new JMenu("Run History");
		mnRunHistory.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnRun.add(mnRunHistory);
		
		JMenu mnRunMode = new JMenu("Run Mode");
		mnRunMode.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnRun.add(mnRunMode);
		
		mnRun.addSeparator();
		
		JMenuItem mntmRunConfiguratio = new JMenuItem("Run Configuratio");
		mntmRunConfiguratio.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnRun.add(mntmRunConfiguratio);
		//------------------------------------------------------------
		JMenu mnWindow = new JMenu("  Window  ");
		mnWindow.setForeground(Color.BLACK);
		mnWindow.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnWindow);
		
		JMenuItem mntmNewWindow = new JMenuItem("New Window");
		mntmNewWindow.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnWindow.add(mntmNewWindow);
		
		JMenuItem mntmNewTgEditor = new JMenuItem("New TG Editor");
		mntmNewTgEditor.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnWindow.add(mntmNewTgEditor);
		
		mnWindow.addSeparator();
		
		JMenuItem mntmCloseWindow = new JMenuItem("Close Window");
		mntmCloseWindow.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnWindow.add(mntmCloseWindow);
		
		JMenuItem mntmCloseTgEditor = new JMenuItem("Close TG Editor");
		mntmCloseTgEditor.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnWindow.add(mntmCloseTgEditor);
		
		mnWindow.addSeparator();
		
		JMenu mnEditorTabs = new JMenu("Editor Tabs");
		mnEditorTabs.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnWindow.add(mnEditorTabs);
		
		mnWindow.addSeparator();
		
		//----------------------------------------------------------------------------------
		JMenu mnHelp = new JMenu(" Help  ");
		mnHelp.setForeground(Color.BLACK);
		mnHelp.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnHelp);
		
		JMenuItem mntmTgEdit = new JMenuItem("TG Edit");
		mntmTgEdit.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnHelp.add(mntmTgEdit);
		
		mnHelp.addSeparator();
		
		JMenuItem mntmHelpContent = new JMenuItem("Help Content");
		mntmHelpContent.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnHelp.add(mntmHelpContent);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mntmSearch.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnHelp.add(mntmSearch);
		
		mnHelp.addSeparator();
		
		JMenuItem mntmCheckForUpdates = new JMenuItem("Check for Updates");
		mntmCheckForUpdates.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnHelp.add(mntmCheckForUpdates);
		
		mnHelp.addSeparator();
		
		JMenuItem mntmAboutEditor = new JMenuItem("About Editor");
		mntmAboutEditor.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		mnHelp.add(mntmAboutEditor);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(UIManager.getColor("activeCaption"));
		desktopPane.setBounds(0, 26, 560, 388);
		frame.getContentPane().add(desktopPane);
	}
}
