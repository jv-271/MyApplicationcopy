package com.example.myapplicationcopy;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class ReportIssueActivity extends AppCompatActivity {

    Spinner categorySpinner;
    EditText descriptionInput, locationInput;
    Button photoButton;
    Button btnRoad, btnGarbage, btnEmergency, btnOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Bind views
        categorySpinner = findViewById(R.id.categorySpinner);
        descriptionInput = findViewById(R.id.descriptionInput);
        locationInput = findViewById(R.id.locationInput);
        photoButton = findViewById(R.id.photoButton);

        btnRoad = findViewById(R.id.btnRoad);
        btnGarbage = findViewById(R.id.btnGarbage);
        btnEmergency = findViewById(R.id.btnEmergency);
        btnOthers = findViewById(R.id.btnOthers);

        // Set Spinner options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.issue_categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapter);

        // Handle button click examples
        photoButton.setOnClickListener(view ->
                Toast.makeText(this, "Add photo clicked", Toast.LENGTH_SHORT).show());

        btnRoad.setOnClickListener(v -> Toast.makeText(this, "Road selected", Toast.LENGTH_SHORT).show());
    }
}