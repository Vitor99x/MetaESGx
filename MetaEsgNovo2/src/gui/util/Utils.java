package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
public static Stage currentStage(ActionEvent evento) {
	return (Stage)((Node)evento.getSource()).getScene().getWindow();
}
}
