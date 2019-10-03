package com.t.testdagger;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

  @Inject Product product;
  @Inject @Named("testing") String testName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ((MyApplication) getApplicationContext()).getApplicationComponent()
        .inject(this);
  }

  @Override protected void onStart() {
    super.onStart();
    Toast.makeText(this, product.getName(), Toast.LENGTH_SHORT).show();
    product.setName(testName);
    Toast.makeText(this, product.getName(), Toast.LENGTH_SHORT).show();
  }
}
