package fr.chatnoir.enigmator.view;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;
/**
 * Vue principale de l'application
 * @author chatnoir
 *
 */
public class View extends ViewPart {
	public static final String ID = "fr.chatnoir.enigmator.view";

	@Inject IWorkbench workbench;
	/**
	 * Zone de texte source
	 */
	private Text input;
	private Button btCrypter;
	private Button btDecrypter;
	private Text output;
	
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.BORDER_SOLID);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 30;
		layout.verticalSpacing = 20;
		container.setLayout(layout);
		
		GridData textLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		textLayout.horizontalSpan = 2;
		
		input = new Text(container, SWT.MULTI | SWT.V_SCROLL);
		input.setSize(500, 500);
		input.setLayoutData(textLayout);
		
		btCrypter = new Button(container, SWT.PUSH);
		btCrypter.setText("Crypter");
		btCrypter.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		btDecrypter = new Button(container, SWT.PUSH);
		btDecrypter.setText("Décrypter");
		btDecrypter.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		output = new Text(container, SWT.MULTI | SWT.V_SCROLL);
		output.setSize(200, 200);
		output.setLayoutData(textLayout);
		
		btCrypter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				output.setText(input.getText());
			}
		});
		btDecrypter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				input.setText(output.getText());
			}
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
}