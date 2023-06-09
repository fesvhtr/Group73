package controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.ViewManager;


/**
 * @author 1914-杨雨田-20195462
 * @create 2020-07-22 4:40
 */
public class StudentMenuController {

    @FXML
    private BorderPane rootLayout;

    @FXML
    private JFXButton deviceManageButton;

    @FXML
    private JFXButton OrderInfoButton;

    @FXML
    private JFXButton userManagementButton;

    @FXML
    private JFXButton factoryInfoButton;

    @FXML
    private JFXButton productTypeButton;

    @FXML
    private JFXButton productInfoButton;

    @FXML
    private FontAwesomeIconView exitButton;

    @FXML
    void close(MouseEvent event) {
        Stage currentStage = (Stage) exitButton.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    void showDeviceManagement(ActionEvent event) {
        rootLayout.setCenter(ViewManager.getPane("DeviceManagement.fxml"));
    }

    @FXML
    void showDeviceTypeManagement(ActionEvent event) {
        rootLayout.setCenter(ViewManager.getPane("DeviceTypeManagement.fxml"));
    }

    @FXML
    void showFactoryInfo(ActionEvent event) {
        rootLayout.setCenter(ViewManager.getPane("FactoryInfo.fxml"));
    }

    @FXML
    void showOrderInfo(ActionEvent event) {

    }

    @FXML
    void showProductInfo(ActionEvent event) {
        rootLayout.setCenter(ViewManager.getPane("ModuleInfo.fxml"));
    }

    @FXML
    void showProductType(ActionEvent event) {
        rootLayout.setCenter(ViewManager.getPane("ModuleTypeManagement.fxml"));
    }

    @FXML
    void showUserManagement(ActionEvent event) {
        rootLayout.setCenter(ViewManager.getPane("UserManagement.fxml"));
    }

}
