package ateamcomp354.projectmanagerapp.ui;

import javax.swing.JComponent;

import ateamcomp354.projectmanagerapp.services.ApplicationContext;
import ateamcomp354.projectmanagerapp.services.ProjectService;
import ateamcomp354.projectmanagerapp.ui.gen.SplitPane1Gen;
import ateamcomp354.projectmanagerapp.ui.gen.US1RightPanelGen;

public class ProjectsPanel {

	private final ApplicationContext appCtx;

	private SplitPane1Gen splitPane1Gen;
	private US1RightPanelGen us1RightPanelGen;
	
	public ProjectsPanel( ApplicationContext appCtx )
	{
		this.appCtx = appCtx;

		splitPane1Gen = new SplitPane1Gen();

		us1RightPanelGen = new US1RightPanelGen();

		splitPane1Gen.getSplitPane().setRightComponent( us1RightPanelGen );
	}
	
	public JComponent getComponent()
	{
		return splitPane1Gen;
	}

}
