package fr.chatnoir.enigmator.view;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


public class EgnigmatorPerspective implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = "fr.chatnoir.enigmator.view.perspective";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		layout.addStandaloneView(EnigmatorView.ID, false, IPageLayout.TOP, 1, editorArea);
	}

}
