package com.bankwibu.tubespbo.Controllers.Client;
// deklarasi pakt yang digunakan oleh kelas ini
// keelas ini berada di dalam paket "com.bankwibu.tubespbo.Controllers.Client"

import javafx.fxml.Initializable; // mengimpor kelas Initializable dari paket javafxml. -> Initializable digunakan untuk memberikan metode initialize yang akan dipanggil setelah kontroler diinisialisasi.
import javafx.scene.control.Button;
import javafx.scene.control.IndexedCell;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//Ini adalah pernyataan import untuk mengimpor beberapa kelas dari paket javafx.scene.control. Dalam hal ini, Anda mengimpor kelas Button, IndexedCell, Label, dan TextField, yang semuanya adalah komponen antarmuka pengguna (UI) dalam JavaFX.
import java.net.URL;
// pernyataan import yang mengimpor kelas URL dari paket java.net. Kelas URL digunakan untuk merepresentasikan alamat URL, yang dapat digunakan, misalnya, untuk mendapatkan sumber daya dari jaringan.
import java.util.ResourceBundle;
//pernyataan import yang mengimpor kelas ResourceBundle dari paket java.util. Kelas ResourceBundle digunakan untuk mengelola set sumber daya (seperti string lokal) dalam aplikasi. Dalam konteks kelas yang mengimplementasikan Initializable, ResourceBundle dapat digunakan untuk mendapatkan sumber daya tambahan yang diperlukan selama inisialisasi.

//Interface Initializable sendiri membutuhkan implementasi metode initialize(URL location, ResourceBundle resources), yang biasanya digunakan untuk melakukan inisialisasi kontroler setelah file FXML di-load. Dalam metode ini, parameter URL location memberikan lokasi dari file FXML, dan ResourceBundle resources menyediakan akses ke sumber daya tambahan yang mungkin diperlukan selama inisialisasi.

// Kelas AccountsController yang Anda berikan adalah kelas JavaFX yang mengimplementasikan interface Initializable. Di dalam kelas ini, terdapat beberapa properti yang merupakan elemen-elemen antarmuka pengguna (UI) yang kemungkinan besar terhubung dengan elemen-elemen yang didefinisikan dalam file FXML.
public class AccountsController implements Initializable {
    public Label ch_acc_num;
    public Label transaction_limit;
    public Label ch_acc_date;
    public Label ch_acc_bal;
    public Label sv_acc_num;
    public Label withdrawal_limit;
    public Label sv_acc_date;
    public Label sv_acc_bal;
    public TextField amount_to_sv;
    public Button trans_to_sv_btn;
    public TextField amount_to_ch;
    public Button trans_to_ch_btn;

    @Override // metode yang diwarisi dari superclass atau diimplementasikan dari antarmuka (interface). Jika metode yang diberi anotasi @Override tidak sesuai dengan metode dalam superclass atau antarmuka yang diwarisi, kompiler akan menghasilkan kesalahan.
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}

//