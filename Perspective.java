package fr.chatnoir.enigmator.view;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import fr.chatnoir.enigmator.ui.view.View;

public class Perspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		layout.addStandaloneView(View.ID, false, IPageLayout.TOP, 1, editorArea);
	}

}
