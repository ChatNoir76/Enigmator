package fr.chatnoir.enigmator.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String area = layout.getEditorArea();
		
		IFolderLayout project;
		project = layout.createFolder("left", IPageLayout.LEFT, 0.25f, area);
		project.addView(IPageLayout.ID_PROJECT_EXPLORER);
				
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);
		
	}

}
