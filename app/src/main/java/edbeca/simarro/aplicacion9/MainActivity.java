package edbeca.simarro.aplicacion9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private ImageButton ibtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        ibtnLogin = (ImageButton) findViewById(R.id.ibtnLogin);


        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}