module com.example.Products {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.products to javafx.fxml;
    exports com.example.products;
}