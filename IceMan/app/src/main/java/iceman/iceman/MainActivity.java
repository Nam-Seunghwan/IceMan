package iceman.iceman;

        import android.content.pm.ActivityInfo;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Button btn_start;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            //세로모드 고정
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            setContentView(R.layout.activity_main);

            findViewById(R.id.button_start).setOnClickListener(btnClickListener_BTN_START);
        }

        Button.OnClickListener btnClickListener_BTN_START = new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "누르면 시작한다.", Toast.LENGTH_LONG).show();
            }
        };
}
