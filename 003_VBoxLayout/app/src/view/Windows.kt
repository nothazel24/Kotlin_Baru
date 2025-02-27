package app.src.view

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

// kelas utama yang mengimplementasikan antarmuka Application dari javafx
class Windows : Application() {
    // start() method yang akan dipanggil saat aplikasi dijalankan
    override fun start(primaryStage: Stage) {
        // Objek VCox sebagai layout utama
        val vBox = VBox()

        vBox.spacing = 10.0
        vBox.padding = Insets(10.0)

        // label dan dua tombol
        val label = Label("Contoh VBox")
        val button1 = Button("Tombol 1")
        val button2 = Button("Tombol 2")

        // menambahkan elemen kedalam vbox
        vBox.children.addAll(label, button1, button2)

        // membuat scene dengan vbox sebagai root 
        val scene = Scene(vBox, 600.0, 200.0)

        // mengatur layout vBox
        primaryStage.scene = scene
        primaryStage.title = "Layout vbox (Kotlin UI JavaFx) - Ryan Bajindul"
        primaryStage.show()
    } 
}