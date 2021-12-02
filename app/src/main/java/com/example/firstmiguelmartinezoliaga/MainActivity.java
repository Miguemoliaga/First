package com.example.firstmiguelmartinezoliaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SwipeRefreshLayout swipeLayout;
    private WebView miVisorWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mycontext = (WebView) findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
        miVisorWeb = (WebView) findViewById(R.id.vistaweb);
        miVisorWeb.getSettings().setBuiltInZoomControls(true);
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com/");
    }

    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Toast toast0 = Toast.makeText(MainActivity.this, "Imagen actualizada", Toast.LENGTH_LONG);
            toast0.show();
            miVisorWeb.reload();
            swipeLayout.setRefreshing(false);
        }
    };

}