package com.example.products;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.google.gson.Gson;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Lab5 - Products");

        Button button = new Button("Click here to parse JSON");
        button.setOnAction(e->parseJSON());

        VBox vbox= new VBox(button);
        Scene scene = new Scene(vbox, 120,120);

        stage.setScene(scene);
        stage.show();
    }

    public void parseJSON(){
        String jsonString = "{\"id\":\"1\",\"name\":\"Laptop\",\"date\":\"2024-07-17\",\"manufacturer\":\"Avell\"}";
        Gson gson = new Gson();
        Person person = gson.fromJson(jsonString, Person.class);

        String jsonOutput = gson.toJson(person);
        System.out.println("The output fo JSon " + jsonOutput);
    }

    public class Person{
        public int id;
        public String name;
        public String date;
        public String manufacturer;
    }

    public static void main(String[] args) {
        launch();
    }
}