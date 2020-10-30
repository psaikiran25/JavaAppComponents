package com.bajaj.javaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final FrameLayout fl = findViewById(R.id.container);

        Button textviewBtn = findViewById(R.id.textviewBtn);
        Button edittextBtn = findViewById(R.id.edittextBtn);
        Button imageViewBtn = findViewById(R.id.imageViewBtn);
        final Button imageBtnBtn = findViewById(R.id.imageBtnBtn);
        Button buttonBtn = findViewById(R.id.buttonBtn);
        final Button toggleBtn = findViewById(R.id.toggleBtn);
        final Button radioBtn = findViewById(R.id.radioBtn);
        Button radiogrpBtn = findViewById(R.id.radiogrpBtn);
        Button checkboxBtn = findViewById(R.id.checkbox);
        Button progressBtn = findViewById(R.id.progressBtn);
        Button spinnerBtn = findViewById(R.id.spinnerBtn);
        final Button alertBtn = findViewById(R.id.alertdialogBtn);
        final Button switchBtn = findViewById(R.id.switchBtn);

        textviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.textview, fl, true);
            }
        });

        edittextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.edittext, fl, true);
            }
        });

        imageViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.imageview, fl, true);
            }
        });

        imageBtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.imagebutton, fl, true);

                ImageButton imageButton = (ImageButton) fl.getChildAt(0);
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity3.this, "ImageButton Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        buttonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.button, fl, true);
                fl.getChildAt(0).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast = Toast.makeText(getBaseContext(), "Button Clicked", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
            }
        });

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.togglebutton, fl, true);
                ToggleButton toggleButton = (ToggleButton) fl.getChildAt(0);
                toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b) {
                            Toast.makeText(getBaseContext(), "Toggle button turned ON", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getBaseContext(), "Toggle button turned OFF", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        radioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.radiobutton, fl, true);
                RadioButton radioButton = (RadioButton) fl.getChildAt(0);
                radioButton.setOnCheckedChangeListener(new  RadioButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b) {
                            Toast.makeText(MainActivity3.this, "Radio button CHECKED", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity3.this, "Radio button UNCHECKED", Toast.LENGTH_SHORT).show();
                        }
                    }
                } );
            }
        });

        radiogrpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.radiogroup, fl, true);
                RadioGroup radioGroup = (RadioGroup) fl.getChildAt(0);
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioButton radioButton = (RadioButton) findViewById(i);
                        Toast.makeText(getBaseContext(), radioButton.getText() + " Selected", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        checkboxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.checkbox, fl, true);
                final CheckBox checkBox = (CheckBox) fl.getChildAt(0);
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b) {
                            Toast.makeText(MainActivity3.this, "Check box is CHECKED", Toast.LENGTH_SHORT).show();
                        }   else {
                            Toast.makeText(MainActivity3.this, "Check box is UNCHECKED", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.progressbar, fl, true);

                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) fl.getChildAt(0);

                final ProgressBar progressBar = (ProgressBar) linearLayoutCompat.getChildAt(0);
                final SeekBar seekBar = (SeekBar) linearLayoutCompat.getChildAt(2);
                final TextView textView = (TextView) linearLayoutCompat.getChildAt(1);

                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        progressBar.setProgress(i);
                        textView.setText("progress set to " + i);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });
            }
        });

        spinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(MainActivity3.this).inflate(R.layout.spinner, fl, true);

                final Spinner spinner = (Spinner) fl.getChildAt(0);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity3.this, "You've selected "+
                                adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity3.this,
                        R.array.spinner_choices, R.layout.support_simple_spinner_dropdown_item);
                adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
            }
        });

        alertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity3.this);
                alertDialogBuilder.setMessage("This is a sample dialog box");
                alertDialogBuilder.setTitle("Sample Dialog box");
                alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity3.this, "You've selected OK", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialogBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity3.this, "You've selected CANCEL", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        switchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fl.removeAllViews();
                LayoutInflater.from(getBaseContext()).inflate(R.layout.switchbutton, fl, true);
                Switch switchbutton = (Switch) fl.getChildAt(0);
                switchbutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b) {
                            Toast.makeText(MainActivity3.this, "Switch button turned ON", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity3.this, "Switch button turned OFF", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}