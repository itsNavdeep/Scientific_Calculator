package com.example.navdeep_calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader CalcFxmlLoader = new FXMLLoader(Main.class.getResource("Calc.fxml"));
        Scene CalcScene = new Scene(CalcFxmlLoader.load(), 300, 500);
        stage.setTitle("Advance Calculator");
        stage.setScene(CalcScene);
        stage.show();
    }

}



