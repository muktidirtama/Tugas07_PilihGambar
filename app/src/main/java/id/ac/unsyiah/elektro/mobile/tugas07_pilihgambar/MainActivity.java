package id.ac.unsyiah.elektro.mobile.tugas07_pilihgambar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    ImageView imageViewGambar;
    String[] array_gambar = {"audi", "ferrari", "Bugatti", "Toyota", "koenigsegagera"};
    int[] array_drawable_gambar = {R.drawable.audi, R.drawable.ferrari, R.drawable.bugatti, R.drawable.toyota, R.drawable.koenigsegagera};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewGambar = (ImageView) findViewById(R.id.imageView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerCountGambardapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array_gambar);
        spinner.setAdapter(spinnerCountGambardapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this, "Gambar Yang Kamu Pilih: " + array_gambar[position], Toast.LENGTH_LONG).show();
        imageViewGambar.setImageResource(array_drawable_gambar[position]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
