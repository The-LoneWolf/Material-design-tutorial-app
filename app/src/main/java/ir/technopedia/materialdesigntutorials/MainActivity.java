package ir.technopedia.materialdesigntutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRaisedButton, btnFlatButton, btnFab, btnCardView,
            btnAlertDialogButton, btnBottomNavMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRaisedButton = (Button) findViewById(R.id.btn_raised_button);
        btnRaisedButton.setOnClickListener(this);
        btnFlatButton = (Button) findViewById(R.id.btn_flat_button);
        btnFlatButton.setOnClickListener(this);
        btnFab = (Button) findViewById(R.id.btn_fab);
        btnFab.setOnClickListener(this);
        btnCardView = (Button) findViewById(R.id.btn_card_activity);
        btnCardView.setOnClickListener(this);
        btnAlertDialogButton = (Button) findViewById(R.id.btn_alert_dialog_activity);
        btnAlertDialogButton.setOnClickListener(this);
        btnBottomNavMenu = (Button) findViewById(R.id.btn_bottom_nav);
        btnBottomNavMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_raised_button) {
            startActivity(new Intent(getBaseContext(), RaisedButtonActivity.class));
        } else if (id == R.id.btn_flat_button) {
            startActivity(new Intent(getBaseContext(), FlatButtonActivity.class));
        } else if (id == R.id.btn_fab) {
            startActivity(new Intent(getBaseContext(), FloatingActionButtonActivity.class));
        } else if (id == R.id.btn_card_activity) {
            startActivity(new Intent(getBaseContext(), CardActivity.class));
        } else if (id == R.id.btn_alert_dialog_activity) {
            startActivity(new Intent(getBaseContext(), AlertDialogActivity.class));
        } else if (id == R.id.btn_bottom_nav) {
            startActivity(new Intent(getBaseContext(), BottomNavActivity.class));
        }
    }
}
