module com.example.masodfoku_egyenlet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.masodfoku_egyenlet to javafx.fxml;
    exports com.example.masodfoku_egyenlet;
}