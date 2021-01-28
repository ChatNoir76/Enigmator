package fr.chatnoir.enigmator.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import fr.chatnoir.enigmator.service.Service;

public class EnigmatorView extends ViewPart {
	public static final String ID = "fr.chatnoir.enigmator.view";

	private Text input;
	private Button btCrypter;
	private Button btDecrypter;
	private Text output;
	private Composite container;

	@Override
	public void createPartControl(Composite parent) {
		container = new Composite(parent, SWT.BORDER_SOLID);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 30;
		layout.verticalSpacing = 20;
		container.setLayout(layout);
		
		GridData textLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		textLayout.horizontalSpan = 2;
		
		input = new Text(container, SWT.MULTI | SWT.V_SCROLL);
		input.setLayoutData(textLayout);
		
		btCrypter = new Button(container, SWT.PUSH);
		btCrypter.setText("Crypter");
		btCrypter.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		btDecrypter = new Button(container, SWT.PUSH);
		btDecrypter.setText("Décrypter");
		btDecrypter.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		output = new Text(container, SWT.MULTI | SWT.V_SCROLL);
		output.setLayoutData(textLayout);
		
		btCrypter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				output.setText(Service.encrypt(input.getText()));
			}
		});
		btDecrypter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				input.setText(Service.uncrypt(output.getText()));
			}
		});
	}
	
	

	@Override
	public void setFocus() {
	}

}
