package sv.edu.ntu.phamxuanvudat.phamxuanvudat_58131283_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {
        TextView Txt1,Txt2,Txt3;
        RadioGroup edGioitinh;
        EditText edTen, edNgaysinh,edSothich;
        Button btXacnhan,bt1,btXemphim;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            addViews();
            addEvents();
        }

        private void addViews()
        {
            Txt1 = findViewById(R.id.Txt1);
            edTen = findViewById(R.id.edTen);
            Txt2 = findViewById(R.id.Txt2);
            edNgaysinh = findViewById(R.id.edNgaysinh);
            Txt3 = findViewById(R.id.Txt3);
            edSothich = findViewById(R.id.edSothich);
            btXacnhan = findViewById(R.id.btXacnhan);
            edGioitinh = findViewById(R.id.rdGioitinh);
        }
    private void addEvents()
    {
        btXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String a = edTen.getText().toString();
                String b = edNgaysinh.getText().toString();
                String c = edSothich.getText().toString();
                Toast.makeText(MainActivity.this, a+"\n Ngày sinh "+b+"\nNam"+
                        "\nXem phim"+"\nĐi cà phê với bạn bè"+"\nvào bếp nấu ăn"+"\n"+c, Toast.LENGTH_LONG).show();

            }
        });
    }

}
