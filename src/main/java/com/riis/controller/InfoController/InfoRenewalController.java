package com.riis.controller.InfoController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import com.riis.controller.Controller;
import com.riis.model.viewmodel.SidebarModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InfoRenewalController implements Controller{
    @FXML
    private AnchorPane bocy_anchor;
    
    @FXML
    private VBox detail_box;
    
    @FXML
    private HBox detail_hbox;
    
    @FXML
    private HBox detail_hbox1;
    
    @FXML
    private HBox detail_hbox2;
    
    @FXML
    private HBox detail_hbox3;
    
    @FXML
    private Button re_approve_btn;
    
    @FXML
    private Button re_clear_btn;
    
    @FXML
    private Button re_search_btn;
    
    @FXML
    private TextField re_search_field;
    
    @FXML
    private ListView<?> replace_list;
    
    @FXML
    private HBox search_box;

    @Override
    public void getView() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/riis/fxml/Info_fxml/InfoRenewal.fxml"));

        AnchorPane anchorPane = (AnchorPane) root;
        SidebarModel.borderPane.setCenter(anchorPane);
    }
}
