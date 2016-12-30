package ir.technopedia.materialdesigntutorials;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.favorites) {
                    Toast.makeText(getBaseContext(), "Favorites pressed!", Toast.LENGTH_LONG).show();
                    return true;
                } else if (item.getItemId() == R.id.list) {
                    Toast.makeText(getBaseContext(), "List pressed!", Toast.LENGTH_LONG).show();
                    return true;
                } else if (item.getItemId() == R.id.home) {
                    Toast.makeText(getBaseContext(), "Home pressed!", Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
    }
}
