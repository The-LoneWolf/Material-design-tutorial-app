package ir.technopedia.materialdesigntutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRaisedButton, btnFlatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRaisedButton = (Button) findViewById(R.id.btn_raised_button);
        btnRaisedButton.setOnClickListener(this);
        btnFlatButton = (Button) findViewById(R.id.btn_flat_button);
        btnFlatButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_raised_button) {
            startActivity(new Intent(getBaseContext(), RaisedButtonActivity.class));
        } else if (id == R.id.btn_flat_button) {
            startActivity(new Intent(getBaseContext(), FlatButtonActivity.class));
        }
    }
}
