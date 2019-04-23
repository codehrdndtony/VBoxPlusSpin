package com.javafx;

public class SpinnerFactory {
    //Field name - name of person
    private String name;
    //Field born Year
    private Integer bornYear;
    //Field placeOfBirth
    private String placeOfBirth;

    /*Cons has 3 parameters.
    *The aim is to assign values to the fields of Person
     *Specc the name, YYb, place of birth
    */
    public Person(String name, Integer bornYear, String placeOfBirth) {
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }

    /* Cons has 2 parameters
    The aim is to assign values to the name, born year fields of the Person.
    The place of birth is not assigned.
     */
    public Person(String name, Integer bornYear) {
    this.name = name;
    this.bornYear = bornYear;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

}







































/* Spinner Tut does not works
import java.util.ArrayList;
import java.util.List;

import com.javafx.model.Language;

import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class SpinnerFactory extends Application {

    @Override
    public void start(Stage stage) {

        int timeFrSS = 33;
        final Spinner<Integer> _spinner = new Spinner<Integer>();

        Label infoLabel = new Label("-");
        infoLabel.setTextFill(Color.BLUE);

        SpinnerValueFactory<Integer> valueFactory = //
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, timeFrSS);
        _spinner.setValueFactory(valueFactory);

        _spinner.valueProperty().addListener(new ChangeListener<Number>(){
        @Override
        public void changed(ObservableValue<? extends Number> observableValue, //
            Number oldValue, Number newValue){
            infoLabel.setText("New value: " + newValue);
            }
        });

        FlowPane root = new FlowPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));

        root.getChildren().addAll(_spinner, infoLabel);

        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("JavaFX Spinner (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
*/