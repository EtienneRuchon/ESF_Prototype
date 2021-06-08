package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

public class ControllerContact implements  Initializable  {

    @FXML Button CouleurHome;
    @FXML Button CouleurChat;
    @FXML Button CouleurMeeting;
    @FXML Button CouleurContact;
    private EventObject event;
    ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void handleButtonHome(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);

        window.show();

    }
    public void TestEnteredCouleurHome(MouseEvent mouseEvent) {
        CouleurHome.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurHome.setPrefHeight(75.0);
        CouleurHome.setPrefWidth(300);
    }
    public void TestExitCouleurHome(MouseEvent mouseEvent) {
        CouleurHome.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurHome.setPrefHeight(75.0);
        CouleurHome.setPrefWidth(275);

    }


    public void handleButtonChat(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Chat.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);

        window.show();
    }
    public void TestEnteredCouleurChat(MouseEvent mouseEvent) {
        CouleurChat.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurChat.setPrefHeight(75.0);
        CouleurChat.setPrefWidth(300);
    }
    public void TestExitCouleurChat(MouseEvent mouseEvent) {
        CouleurChat.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurChat.setPrefHeight(75.0);
        CouleurChat.setPrefWidth(275);
    }


    public void handleButtonMeeting(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Meeting.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);

        window.show();
    }
    public void TestEnteredCouleurMeeting(MouseEvent mouseEvent) {
        CouleurMeeting.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurMeeting.setPrefHeight(75.0);
        CouleurMeeting.setPrefWidth(300);
    }
    public void TestExitCouleurMeeting(MouseEvent mouseEvent) {
        CouleurMeeting.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurMeeting.setPrefHeight(75.0);
        CouleurMeeting.setPrefWidth(275);
    }


    public void handleButtonContact(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Contact.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);

        window.show();
    }
    public void TestEnteredCouleurContact(MouseEvent mouseEvent) {
        CouleurContact.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurContact.setPrefHeight(75.0);
        CouleurContact.setPrefWidth(300);
    }
    public void TestExitCouleurContact(MouseEvent mouseEvent) {
        CouleurContact.setStyle("-fx-background-color:  #ffffffff; -fx-border-color: #3b649a; -fx-font-family: 'Letters for Learners'; -fx-font-size : 24;");
        CouleurContact.setPrefHeight(75.0);
        CouleurContact.setPrefWidth(300);
    }




    public void exitButton(MouseEvent mouseEvent) {
        Platform.exit();
    }
    public void handleButtonAdd(ActionEvent actionEvent) {
    }
    public void ClickRandoHome1(MouseEvent mouseEvent) {
    }
    public void ClickRandoHome2(MouseEvent mouseEvent) {
    }

    public void handleCalendar(MouseEvent mouseEvent) {
    }

    public void handleNewMeeting(MouseEvent mouseEvent) {
    }
}
