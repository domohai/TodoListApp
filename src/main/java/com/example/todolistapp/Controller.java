package com.example.todolistapp;

import DataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<TodoItem> listView;
    @FXML
    private TextArea detailsText;
    @FXML
    private Label deadLineLabel;
    private List<TodoItem> todoItemList = new ArrayList<>();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TodoItem item1 = new TodoItem("Complete OOP assignment",
                "Finish coding the menu and pause menu, maintain the window class, ...",
                LocalDate.of(2022, Month.NOVEMBER, 5));
        todoItemList.add(item1);
        listView.getItems().setAll(todoItemList);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.getSelectionModel().selectFirst();
    }
    
    @FXML
    public void listViewAction() {
        TodoItem item = listView.getSelectionModel().getSelectedItem();
        if (item != null) {
            detailsText.setText(item.getDetails());
            deadLineLabel.setText("Due: " + item.getDL().toString());
        }
    }
}