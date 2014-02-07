package wordreverser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

import org.apache.commons.lang3.text.WordUtils;

public class MainController {

	@FXML
	private TextArea input;

	@FXML
	private CheckBox capitalCheckBox;

	@FXML
	private CheckBox spaceCheckBox;

	@FXML
	protected void reverseButtonClick(ActionEvent event) {
		input.setText(reverse(input.getText()));
	}

	private String reverse(String inputString) {

		if (capitalCheckBox.isSelected())
			inputString = WordUtils.capitalizeFully(inputString);

		if (spaceCheckBox.isSelected())
			inputString = inputString.replace(" ", "");

		char[] inputChars = inputString.toCharArray();
		char[] newStringChars = new char[inputChars.length];

		int i = 1;
		for (char charactor : inputChars) {
			newStringChars[inputChars.length - i] = charactor;
			i++;
		}

		return new String(newStringChars);
	}
}