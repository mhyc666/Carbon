package tk.zielony.carbonsamples.feature;

import android.os.Bundle;

import tk.zielony.carbonsamples.ActivityAnnotation;
import tk.zielony.carbonsamples.R;
import tk.zielony.carbonsamples.ThemedActivity;

@ActivityAnnotation(layout = R.layout.activity_shadow, title = R.string.shadowActivity_title)
public class ShadowActivity extends ThemedActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolbar();
    }
}
