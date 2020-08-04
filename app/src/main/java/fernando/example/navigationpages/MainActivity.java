package fernando.example.navigationpages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fernando.example.navigationpages.R;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCenter.start(getApplication(), "3d3aaf11-7618-4050-a0a6-bde89c425c05",
                Analytics.class, Crashes.class);
        setContentView(R.layout.activity_main);
    }
}
