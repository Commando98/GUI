package JavaFXApplication7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.EventType;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;

public class JavaFXApplication7 extends Application {

    //Cafeteria cf;
    Label l1;
    Label l2;
    Label l3;
    Label l4;

    TextField tf1;
    TextField tf2;
    TextField tf3;
    TextField tf4;
    private String[] flagtitles = {"pizza:1 ", "coffe:2 ", "tea:3", "biskets:4", "ships:5", "snadwich:6", "choc:7"};
    GridPane root = new GridPane();

    @Override
    public void start(final Stage primaryStage) {
//        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagtitles));
//        lv.setPrefSize(400, 600);
//        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//        BorderPane BP = new BorderPane();
//        ScrollPane sp = new ScrollPane();
//        BP.setLeft(new ScrollPane(lv));

        Button btn = new Button();
        btn.setText("ADD Doctor");
        Button B2 = new Button();
        B2.setText("ADD Proudect");
        Button B3 = new Button();
        B3.setText("show products");
        Button B4 = new Button();
        B4.setText("show Doctor's list");
        Button B5 = new Button();
        B5.setText("show pill");
        Button B6 = new Button();
        B6.setText("update quantity");
        Button B7 = new Button();
        root.add(btn, 0, 0);
        root.add(B2, 0, 1);
        root.add(B3, 1, 0);
        root.add(B4, 1, 1);
        root.add(B5, 2, 0);
        root.add(B6, 2, 1);

        //  root.add(BP, 1, 1);
        Scene scene = new Scene(root, 500, 400);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                File f = new File("File.txt");
                FileWriter f1 = null;

                l1 = new Label("Enter the Doctor name ");
                tf1 = new TextField();
                l2 = new Label("Enter the doctor id");
                tf2 = new TextField();
                l3 = new Label("Enter the departmnent");
                tf3 = new TextField();
                l4 = new Label("Enter the Title");
                tf4 = new TextField();
                B6.setText("ADD");
                root.add(B7, 3, 11);
                root.add(l1, 3, 3);
                root.add(tf1, 3, 4);
                root.add(l2, 3, 5);
                root.add(tf2, 3, 6);
                root.add(l3, 3, 7);
                root.add(tf3, 3, 8);
                root.add(l4, 3, 9);
                root.add(tf4, 3, 10);
               // B6.setOnAction(this);
                int o = Integer.parseInt( tf1.getText());
                int i = Integer.parseInt(tf2.getText());
                int x = Integer.parseInt(tf3.getText());
                try {
                    Scanner sc = new Scanner(f);
                    //cf = new Cafeteria();
                    // cf.
                    f1 = new FileWriter(f);
                    f1.append(o + ",");
                    f1.append(i + "");
                    while (sc.hasNext()) {
                        System.out.println(f.canRead());
                    }
                    f1.close();
                } catch (IOException ex) {
                    Logger.getLogger(JavaFXApplication7.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        B2.setOnAction((ActionEvent event) -> {
            l1.setText("enter the proudect name");
            tf1 = new TextField();
            l2.setText("enter the proudect id");
            tf2 = new TextField();
            l3.setText("enter the proudect price");
            tf3 = new TextField();
            l4.setText("enter the proudect quantity");
            tf4 = new TextField();
            root.add(l1, 3, 3);
            root.add(tf1, 3, 4);
            root.add(l2, 3, 5);
            root.add(tf2, 3, 6);
            root.add(l3, 3, 7);
            root.add(tf3, 3, 8);
            root.add(l4, 3, 9);
            root.add(tf4, 3, 10);
            //root.removeEventHandler(EventType.ROOT, this);
        });
        primaryStage.setTitle("Welcome!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
