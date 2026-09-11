package com.rkenterprises.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 60, 40, 40);

        TextView title = new TextView(this);
        title.setText("RK ENTERPRISES\nINTERIOR & COMMERCIAL DESIGN");
        title.setTextSize(24);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("\nDREAM • DESIGN • DELIVER\n\nPremium spaces. Designed for you.");
        subtitle.setTextSize(18);
        layout.addView(subtitle);

        Button call = new Button(this);
        call.setText("Call Now");
        call.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:+918969764431"))));
        layout.addView(call);

        Button whatsapp = new Button(this);
        whatsapp.setText("WhatsApp");
        whatsapp.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.me/918969764431"))));
        layout.addView(whatsapp);

        Button website = new Button(this);
        website.setText("Visit Website");
        website.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://shekharsharma89.github.io/Shekhar-Sharma-/#home"))));
        layout.addView(website);

        setContentView(layout);
    }
}
