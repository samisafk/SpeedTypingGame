package sample;

import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class UsernamePrompt {
    public static String promptForUsername() {
        TextInputDialog dialog = new TextInputDialog("Player"); // Default text
        dialog.setTitle("Enter Username");
        dialog.setHeaderText("New Game");
        dialog.setContentText("Please enter your username:");

        Optional<String> result = dialog.showAndWait(); // Wait for user input
        return result.orElse("DefaultUsername"); // Return entered username or default
    }
}
