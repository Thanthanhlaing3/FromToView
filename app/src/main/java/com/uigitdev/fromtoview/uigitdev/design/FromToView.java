package com.uigitdev.fromtoview.uigitdev.design;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.uigitdev.fromtoview.R;

public class FromToView {
    private TextView from_current_location;
    private EditText to_edit_text;
    private RelativeLayout clear_button;

    public FromToView(View view) {
        setType(view);
        clearButtonVisibility();
        setOnClickClearButton();
    }

    private void setType(View view) {
        from_current_location = view.findViewById(R.id.from_current_location);
        to_edit_text = view.findViewById(R.id.to_edit_text);
        clear_button = view.findViewById(R.id.clear_button);
    }

    public void setCurrentPosition(String currentPosition) {
        from_current_location.setText(currentPosition);
    }

    public String getCurrentPosition() {
        return from_current_location.getText().toString();
    }

    public String getDestination() {
        return to_edit_text.getText().toString();
    }

    public void setOnClickClearButton() {
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_edit_text.setText("");
            }
        });
    }

    private void clearButtonVisibility() {
        to_edit_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count > 0) {
                    clear_button.setVisibility(View.VISIBLE);
                } else {
                    clear_button.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
