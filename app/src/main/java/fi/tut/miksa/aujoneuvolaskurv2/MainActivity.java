package fi.tut.miksa.aujoneuvolaskurv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean auto=false;
    private boolean mopo=false;
    private boolean bussi=false;

    private int autolkm=0;
    private int mopolkm=0;
    private int bussilkm=0;

    private TextView textView_auto;
    private TextView textView_mopo;
    private TextView textView_bussi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_auto=findViewById(R.id.textView_auto);
        textView_mopo=findViewById(R.id.textView_mopo);
        textView_bussi=findViewById(R.id.textView_bussi);

        Button buttonLisaa=findViewById(R.id.button_lisaa);
        buttonLisaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(auto){
                    autolkm++;
                    textView_auto.setText("Autoja: "+autolkm);
                }else if(mopo){
                    mopolkm++;
                    textView_mopo.setText("Mopoja: "+mopolkm);
                }else if(bussi){
                    bussilkm++;
                    textView_bussi.setText("Busseja: "+bussilkm);
                }

            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton_auto:
                if (checked) {
                    auto = true;
                    mopo = false;
                    bussi = false;
                }
                break;
            case R.id.radioButton_mopo:
                if (checked){
                    auto = false;
                    mopo = true;
                    bussi = false;
                }

                    break;
            case R.id.radioButton_bussi:
                if (checked){
                    auto = false;
                    mopo = false;
                    bussi = true;
                }

                    break;
        }
    }
}
