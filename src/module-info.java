module TypingPracticeJava.main {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires java.sql;

    // Ensure the correct package is open for JavaFX to access
    opens sample to javafx.fxml; // or whatever your package name is
    exports sample;
}
