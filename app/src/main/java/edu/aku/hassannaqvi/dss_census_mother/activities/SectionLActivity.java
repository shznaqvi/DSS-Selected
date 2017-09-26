package edu.aku.hassannaqvi.dss_census_mother.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_mother.R;
import edu.aku.hassannaqvi.dss_census_mother.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_mother.core.MainApp;

public class SectionLActivity extends Activity {

    private static final String TAG = SectionLActivity.class.getSimpleName();


    @BindView(R.id.dcl01am)
    CheckBox dcl01am;
    @BindView(R.id.dcl01a1days)
    EditText dcl01a1days;
    @BindView(R.id.dcl01ac)
    CheckBox dcl01ac;
    @BindView(R.id.dcl01a2days)
    EditText dcl01a2days;
    @BindView(R.id.dcl01bm)
    CheckBox dcl01bm;
    @BindView(R.id.dcl01b1days)
    EditText dcl01b1days;
    @BindView(R.id.dcl01bc)
    CheckBox dcl01bc;
    @BindView(R.id.dcl01b2days)
    EditText dcl01b2days;
    @BindView(R.id.dcl01cm)
    CheckBox dcl01cm;
    @BindView(R.id.dcl01c1days)
    EditText dcl01c1days;
    @BindView(R.id.dcl01cc)
    CheckBox dcl01cc;
    @BindView(R.id.dcl01c2days)
    EditText dcl01c2days;
    @BindView(R.id.dcl01dm)
    CheckBox dcl01dm;
    @BindView(R.id.dcl01d1days)
    EditText dcl01d1days;
    @BindView(R.id.dcl01dc)
    CheckBox dcl01dc;
    @BindView(R.id.dcl01d2days)
    EditText dcl01d2days;
    @BindView(R.id.dcl01em)
    CheckBox dcl01em;
    @BindView(R.id.dcl01e1days)
    EditText dcl01e1days;
    @BindView(R.id.dcl01ec)
    CheckBox dcl01ec;
    @BindView(R.id.dcl01e2days)
    EditText dcl01e2days;
    @BindView(R.id.dcl01fm)
    CheckBox dcl01fm;
    @BindView(R.id.dcl01f1days)
    EditText dcl01f1days;
    @BindView(R.id.dcl01fc)
    CheckBox dcl01fc;
    @BindView(R.id.dcl01f2days)
    EditText dcl01f2days;
    @BindView(R.id.dcl01gm)
    CheckBox dcl01gm;
    @BindView(R.id.dcl01g1days)
    EditText dcl01g1days;
    @BindView(R.id.dcl01gc)
    CheckBox dcl01gc;
    @BindView(R.id.dcl01g2days)
    EditText dcl01g2days;
    @BindView(R.id.dcl01hm)
    CheckBox dcl01hm;
    @BindView(R.id.dcl01h1days)
    EditText dcl01h1days;
    @BindView(R.id.dcl01hc)
    CheckBox dcl01hc;
    @BindView(R.id.dcl01h2days)
    EditText dcl01h2days;
    @BindView(R.id.dcl01im)
    CheckBox dcl01im;
    @BindView(R.id.dcl01i1days)
    EditText dcl01i1days;
    @BindView(R.id.dcl01ic)
    CheckBox dcl01ic;
    @BindView(R.id.dcl01i2days)
    EditText dcl01i2days;
    @BindView(R.id.dcl02am)
    CheckBox dcl02am;
    @BindView(R.id.dcl02a1fr)
    EditText dcl02a1fr;
    @BindView(R.id.dcl02ac)
    CheckBox dcl02ac;
    @BindView(R.id.dcl02a2fr)
    EditText dcl02a2fr;
    @BindView(R.id.dcl02bm)
    CheckBox dcl02bm;
    @BindView(R.id.dcl02b1fr)
    EditText dcl02b1fr;
    @BindView(R.id.dcl02bc)
    CheckBox dcl02bc;
    @BindView(R.id.dcl02b2fr)
    EditText dcl02b2fr;
    @BindView(R.id.dcl02cm)
    CheckBox dcl02cm;
    @BindView(R.id.dcl02c1fr)
    EditText dcl02c1fr;
    @BindView(R.id.dcl02cc)
    CheckBox dcl02cc;
    @BindView(R.id.dcl02c2fr)
    EditText dcl02c2fr;
    @BindView(R.id.dcl02dm)
    CheckBox dcl02dm;
    @BindView(R.id.dcl02d1fr)
    EditText dcl02d1fr;
    @BindView(R.id.dcl02dc)
    CheckBox dcl02dc;
    @BindView(R.id.dcl02d2fr)
    EditText dcl02d2fr;
    @BindView(R.id.dcl02em)
    CheckBox dcl02em;
    @BindView(R.id.dcl02e1fr)
    EditText dcl02e1fr;
    @BindView(R.id.dcl02ec)
    CheckBox dcl02ec;
    @BindView(R.id.dcl02e2fr)
    EditText dcl02e2fr;
    @BindView(R.id.dcl02fm)
    CheckBox dcl02fm;
    @BindView(R.id.dcl02f1fr)
    EditText dcl02f1fr;
    @BindView(R.id.dcl02fc)
    CheckBox dcl02fc;
    @BindView(R.id.dcl02f2fr)
    EditText dcl02f2fr;
    @BindView(R.id.dcl02gm)
    CheckBox dcl02gm;
    @BindView(R.id.dcl02g1fr)
    EditText dcl02g1fr;
    @BindView(R.id.dcl02gc)
    CheckBox dcl02gc;
    @BindView(R.id.dcl02g2fr)
    EditText dcl02g2fr;
    @BindView(R.id.dcl02hm)
    CheckBox dcl02hm;
    @BindView(R.id.dcl02h1fr)
    EditText dcl02h1fr;
    @BindView(R.id.dcl02hc)
    CheckBox dcl02hc;
    @BindView(R.id.dcl02h2fr)
    EditText dcl02h2fr;
    @BindView(R.id.dcl02im)
    CheckBox dcl02im;
    @BindView(R.id.dcl02i1fr)
    EditText dcl02i1fr;
    @BindView(R.id.dcl02ic)
    CheckBox dcl02ic;
    @BindView(R.id.dcl02i2fr)
    EditText dcl02i2fr;
    @BindView(R.id.dcl03a)
    EditText dcl03a;
    @BindView(R.id.dcl03b)
    EditText dcl03b;
    @BindView(R.id.dcl03c)
    EditText dcl03c;
    @BindView(R.id.dcl03d)
    EditText dcl03d;
    @BindView(R.id.dcl03e)
    EditText dcl03e;
    @BindView(R.id.dcl04)
    RadioGroup dcl04;
    @BindView(R.id.dcl0488)
    RadioButton dcl0488;
    @BindView(R.id.dcl0401)
    RadioButton dcl0401;
    @BindView(R.id.dcl0402)
    RadioButton dcl0402;
    @BindView(R.id.dcl0403)
    RadioButton dcl0403;
    @BindView(R.id.dcl05)
    RadioGroup dcl05;
    @BindView(R.id.dcl0588)
    RadioButton dcl0588;
    @BindView(R.id.dcl0501)
    RadioButton dcl0501;
    @BindView(R.id.dcl0502)
    RadioButton dcl0502;
    @BindView(R.id.dcl0503)
    RadioButton dcl0503;
    @BindView(R.id.dcl06)
    RadioGroup dcl06;
    @BindView(R.id.dcl0688)
    RadioButton dcl0688;
    @BindView(R.id.dcl0601)
    RadioButton dcl0601;
    @BindView(R.id.dcl0602)
    RadioButton dcl0602;
    @BindView(R.id.dcl0603)
    RadioButton dcl0603;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l_new);
        ButterKnife.bind(this);

        //====================1===================

        // A1
        dcl01am.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01a1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01a1days.setVisibility(View.GONE);
                    dcl01a1days.setText(null);
                }
            }
        });

        // A2
        dcl01ac.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01a2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01a2days.setVisibility(View.GONE);
                    dcl01a2days.setText(null);
                }
            }
        });


        // b1
        dcl01bm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01b1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01b1days.setVisibility(View.GONE);
                    dcl01b1days.setText(null);
                }
            }
        });

        // b2
        dcl01bc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01b2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01b2days.setVisibility(View.GONE);
                    dcl01b2days.setText(null);
                }
            }
        });

        // c1
        dcl01cm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01c1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01c1days.setVisibility(View.GONE);
                    dcl01c1days.setText(null);
                }
            }
        });

        // b2
        dcl01cc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01c2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01c2days.setVisibility(View.GONE);
                    dcl01c2days.setText(null);
                }
            }
        });

        // d1
        dcl01dm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01d1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01d1days.setVisibility(View.GONE);
                    dcl01d1days.setText(null);
                }
            }
        });

        // d2
        dcl01dc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01d2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01d2days.setVisibility(View.GONE);
                    dcl01d2days.setText(null);
                }
            }
        });

        // e1
        dcl01em.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01e1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01e1days.setVisibility(View.GONE);
                    dcl01e1days.setText(null);
                }
            }
        });

        // e2
        dcl01ec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01e2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01e2days.setVisibility(View.GONE);
                    dcl01e2days.setText(null);
                }
            }
        });

        // f1
        dcl01fm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01f1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01f1days.setVisibility(View.GONE);
                    dcl01f1days.setText(null);
                }
            }
        });

        // f2
        dcl01fc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01f2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01f2days.setVisibility(View.GONE);
                    dcl01f2days.setText(null);
                }
            }
        });

        // g1
        dcl01gm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01g1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01g1days.setVisibility(View.GONE);
                    dcl01g1days.setText(null);
                }
            }
        });

        // g2
        dcl01gc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01g2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01g2days.setVisibility(View.GONE);
                    dcl01g2days.setText(null);
                }
            }
        });

        // h1
        dcl01hm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01h1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01h1days.setVisibility(View.GONE);
                    dcl01h1days.setText(null);
                }
            }
        });

        // h2
        dcl01hc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01h2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01h2days.setVisibility(View.GONE);
                    dcl01h2days.setText(null);
                }
            }
        });

        // h1
        dcl01im.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01i1days.setVisibility(View.VISIBLE);
                } else {
                    dcl01i1days.setVisibility(View.GONE);
                    dcl01i1days.setText(null);
                }
            }
        });

        // h2
        dcl01ic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl01i2days.setVisibility(View.VISIBLE);
                } else {
                    dcl01i2days.setVisibility(View.GONE);
                    dcl01i2days.setText(null);
                }
            }
        });

        //======================= END of 1======================

        //=========================== 2 ======================

        // a1
        dcl02am.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02a1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02a1fr.setVisibility(View.GONE);
                    dcl02a1fr.setText(null);
                }
            }
        });

        // a2
        dcl02ac.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02a2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02a2fr.setVisibility(View.GONE);
                    dcl02a2fr.setText(null);
                }
            }
        });

        // b1
        dcl02bm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02b1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02b1fr.setVisibility(View.GONE);
                    dcl02b1fr.setText(null);
                }
            }
        });

        // b2
        dcl02bc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02b2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02b2fr.setVisibility(View.GONE);
                    dcl02b2fr.setText(null);
                }
            }
        });


        // c1
        dcl02cm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02c1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02c1fr.setVisibility(View.GONE);
                    dcl02c1fr.setText(null);
                }
            }
        });

        // c2
        dcl02cc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02c2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02c2fr.setVisibility(View.GONE);
                    dcl02c2fr.setText(null);
                }
            }
        });

        // d1
        dcl02dm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02d1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02d1fr.setVisibility(View.GONE);
                    dcl02d1fr.setText(null);
                }
            }
        });

        // d2
        dcl02dc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02d2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02d2fr.setVisibility(View.GONE);
                    dcl02d2fr.setText(null);
                }
            }
        });

        // e1
        dcl02em.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02e1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02e1fr.setVisibility(View.GONE);
                    dcl02e1fr.setText(null);
                }
            }
        });

        // e2
        dcl02ec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02e2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02e2fr.setVisibility(View.GONE);
                    dcl02e2fr.setText(null);
                }
            }
        });


        // f1
        dcl02fm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02f1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02f1fr.setVisibility(View.GONE);
                    dcl02f1fr.setText(null);
                }
            }
        });

        // f2
        dcl02fc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02f2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02f2fr.setVisibility(View.GONE);
                    dcl02f2fr.setText(null);
                }
            }
        });

        // g1
        dcl02gm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02g1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02g1fr.setVisibility(View.GONE);
                    dcl02g1fr.setText(null);
                }
            }
        });

        // g2
        dcl02gc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02g2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02g2fr.setVisibility(View.GONE);
                    dcl02g2fr.setText(null);
                }
            }
        });

        // h1
        dcl02hm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02h1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02h1fr.setVisibility(View.GONE);
                    dcl02h1fr.setText(null);
                }
            }
        });

        // h2
        dcl02hc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02h2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02h2fr.setVisibility(View.GONE);
                    dcl02h2fr.setText(null);
                }
            }
        });

        // i1
        dcl02im.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02i1fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02i1fr.setVisibility(View.GONE);
                    dcl02i1fr.setText(null);
                }
            }
        });

        // i2
        dcl02ic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcl02i2fr.setVisibility(View.VISIBLE);
                } else {
                    dcl02i2fr.setVisibility(View.GONE);
                    dcl02i2fr.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
//        finish();
//        Intent endSec = new Intent(this, EndingActivity.class);
//        endSec.putExtra("check", false);
//        startActivity(endSec);
        MainApp.endActivity(this,this);
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionMActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSL();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sL = new JSONObject();
        sL.put("dcl01am", dcl01am.isChecked() ? "1" : "0");
        sL.put("dcl01a1days", dcl01a1days.getText().toString());
        sL.put("dcl01ac", dcl01ac.isChecked() ? "1" : "0");
        sL.put("dcl01a2days", dcl01a2days.getText().toString());
        sL.put("dcl01bm", dcl01bm.isChecked() ? "1" : "0");
        sL.put("dcl01b1days", dcl01b1days.getText().toString());
        sL.put("dcl01bc", dcl01bc.isChecked() ? "1" : "0");
        sL.put("dcl01b2days", dcl01b2days.getText().toString());
        sL.put("dcl01cm", dcl01cm.isChecked() ? "1" : "0");
        sL.put("dcl01c1days", dcl01c1days.getText().toString());
        sL.put("dcl01cc", dcl01cc.isChecked() ? "1" : "0");
        sL.put("dcl01c2days", dcl01c2days.getText().toString());
        sL.put("dcl01dm", dcl01dm.isChecked() ? "1" : "0");
        sL.put("dcl01d1days", dcl01d1days.getText().toString());
        sL.put("dcl01dc", dcl01dc.isChecked() ? "1" : "0");
        sL.put("dcl01d2days", dcl01d2days.getText().toString());
        sL.put("dcl01em", dcl01em.isChecked() ? "1" : "0");
        sL.put("dcl01e1days", dcl01e1days.getText().toString());
        sL.put("dcl01ec", dcl01ec.isChecked() ? "1" : "0");
        sL.put("dcl01e2days", dcl01e2days.getText().toString());
        sL.put("dcl01fm", dcl01fm.isChecked() ? "1" : "0");
        sL.put("dcl01f1days", dcl01f1days.getText().toString());
        sL.put("dcl01fc", dcl01fc.isChecked() ? "1" : "0");
        sL.put("dcl01f2days", dcl01f2days.getText().toString());
        sL.put("dcl01gm", dcl01gm.isChecked() ? "1" : "0");
        sL.put("dcl01g1days", dcl01g1days.getText().toString());
        sL.put("dcl01gc", dcl01gc.isChecked() ? "1" : "0");
        sL.put("dcl01g2days", dcl01g2days.getText().toString());
        sL.put("dcl01hm", dcl01hm.isChecked() ? "1" : "0");
        sL.put("dcl01h1days", dcl01h1days.getText().toString());
        sL.put("dcl01hc", dcl01hc.isChecked() ? "1" : "0");
        sL.put("dcl01h2days", dcl01h2days.getText().toString());
        sL.put("dcl01im", dcl01im.isChecked() ? "1" : "0");
        sL.put("dcl01i1days", dcl01i1days.getText().toString());
        sL.put("dcl01ic", dcl01ic.isChecked() ? "1" : "0");
        sL.put("dcl01i2days", dcl01i2days.getText().toString());
        sL.put("dcl02am", dcl02am.isChecked() ? "1" : "0");
        sL.put("dcl02a1fr", dcl02a1fr.getText().toString());
        sL.put("dcl02ac", dcl02ac.isChecked() ? "1" : "0");
        sL.put("dcl02a2fr", dcl02a2fr.getText().toString());
        sL.put("dcl02bm", dcl02bm.isChecked() ? "1" : "0");
        sL.put("dcl02b1fr", dcl02b1fr.getText().toString());
        sL.put("dcl02bc", dcl02bc.isChecked() ? "1" : "0");
        sL.put("dcl02b2fr", dcl02b2fr.getText().toString());
        sL.put("dcl02cm", dcl02cm.isChecked() ? "1" : "0");
        sL.put("dcl02c1fr", dcl02c1fr.getText().toString());
        sL.put("dcl02cc", dcl02cc.isChecked() ? "1" : "0");
        sL.put("dcl02c2fr", dcl02c2fr.getText().toString());
        sL.put("dcl02dm", dcl02dm.isChecked() ? "1" : "0");
        sL.put("dcl02d1fr", dcl02d1fr.getText().toString());
        sL.put("dcl02dc", dcl02dc.isChecked() ? "1" : "0");
        sL.put("dcl02d2fr", dcl02d2fr.getText().toString());
        sL.put("dcl02em", dcl02em.isChecked() ? "1" : "0");
        sL.put("dcl02e1fr", dcl02e1fr.getText().toString());
        sL.put("dcl02ec", dcl02ec.isChecked() ? "1" : "0");
        sL.put("dcl02e2fr", dcl02e2fr.getText().toString());
        sL.put("dcl02fm", dcl02fm.isChecked() ? "1" : "0");
        sL.put("dcl02f1fr", dcl02f1fr.getText().toString());
        sL.put("dcl02fc", dcl02fc.isChecked() ? "1" : "0");
        sL.put("dcl02f2fr", dcl02f2fr.getText().toString());
        sL.put("dcl02gm", dcl02gm.isChecked() ? "1" : "0");
        sL.put("dcl02g1fr", dcl02g1fr.getText().toString());
        sL.put("dcl02gc", dcl02gc.isChecked() ? "1" : "0");
        sL.put("dcl02g2fr", dcl02g2fr.getText().toString());
        sL.put("dcl02hm", dcl02hm.isChecked() ? "1" : "0");
        sL.put("dcl02h1fr", dcl02h1fr.getText().toString());
        sL.put("dcl02hc", dcl02hc.isChecked() ? "1" : "0");
        sL.put("dcl02h2fr", dcl02h2fr.getText().toString());
        sL.put("dcl02im", dcl02im.isChecked() ? "1" : "0");
        sL.put("dcl02i1fr", dcl02i1fr.getText().toString());
        sL.put("dcl02ic", dcl02ic.isChecked() ? "1" : "0");
        sL.put("dcl02i2fr", dcl02i2fr.getText().toString());
        sL.put("dcl03a", dcl03a.getText().toString());
        sL.put("dcl03b", dcl03b.getText().toString());
        sL.put("dcl03c", dcl03c.getText().toString());
        sL.put("dcl03d", dcl03d.getText().toString());
        sL.put("dcl03e", dcl03e.getText().toString());
        sL.put("dcl04", dcl0488.isChecked() ? "88" : dcl0401.isChecked() ? "1" : dcl0402.isChecked() ? "2"
                : dcl0403.isChecked() ? "3" : "0");
        sL.put("dcl05", dcl0588.isChecked() ? "88" : dcl0501.isChecked() ? "1" : dcl0502.isChecked() ? "2"
                : dcl0503.isChecked() ? "3" : "0");
        sL.put("dcl06", dcl0688.isChecked() ? "88" : dcl0601.isChecked() ? "1" : dcl0602.isChecked() ? "2"
                : dcl0603.isChecked() ? "3" : "0");

        MainApp.mc.setsL(String.valueOf(sL));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();


        if (dcl01am.isChecked()) {

            if (dcl01a1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01a1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01a1days: This data is Required!");
                return false;
            } else {
                dcl01a1days.setError(null);
            }
        }

        if (dcl01ac.isChecked()) {

            if (dcl01a2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01a2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01a2days: This data is Required!");
                return false;
            } else {
                dcl01a2days.setError(null);
            }
        }


        if (dcl01bm.isChecked()) {

            if (dcl01b1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01b1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01b1days: This data is Required!");
                return false;
            } else {
                dcl01b1days.setError(null);
            }
        }

        if (dcl01bc.isChecked()) {

            if (dcl01b2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01b2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01b2days: This data is Required!");
                return false;
            } else {
                dcl01b2days.setError(null);
            }
        }


        if (dcl01cm.isChecked()) {

            if (dcl01c1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01c1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01c1days: This data is Required!");
                return false;
            } else {
                dcl01c1days.setError(null);
            }
        }

        if (dcl01cc.isChecked()) {

            if (dcl01c2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01c2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01c2days: This data is Required!");
                return false;
            } else {
                dcl01c2days.setError(null);
            }
        }

        if (dcl01dm.isChecked()) {

            if (dcl01d1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01d1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d1days: This data is Required!");
                return false;
            } else {
                dcl01d1days.setError(null);
            }
        }

        if (dcl01dc.isChecked()) {

            if (dcl01d2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01d2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d2days: This data is Required!");
                return false;
            } else {
                dcl01d2days.setError(null);
            }
        }


        if (dcl01em.isChecked()) {

            if (dcl01e1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01e1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d1days: This data is Required!");
                return false;
            } else {
                dcl01d1days.setError(null);
            }
        }

        if (dcl01dc.isChecked()) {

            if (dcl01d2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01d2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d2days: This data is Required!");
                return false;
            } else {
                dcl01d2days.setError(null);
            }
        }

        if (dcl01em.isChecked()) {

            if (dcl01e1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01e1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01e1days: This data is Required!");
                return false;
            } else {
                dcl01e1days.setError(null);
            }
        }

        if (dcl01ec.isChecked()) {

            if (dcl01e2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01e2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01e2days: This data is Required!");
                return false;
            } else {
                dcl01e2days.setError(null);
            }
        }

        if (dcl01fm.isChecked()) {

            if (dcl01f1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01f1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01f1days: This data is Required!");
                return false;
            } else {
                dcl01f1days.setError(null);
            }
        }

        if (dcl01fc.isChecked()) {

            if (dcl01f2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01f2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01f2days: This data is Required!");
                return false;
            } else {
                dcl01f2days.setError(null);
            }
        }

        if (dcl01gm.isChecked()) {

            if (dcl01g1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01g1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01g1days: This data is Required!");
                return false;
            } else {
                dcl01g1days.setError(null);
            }
        }

        if (dcl01hc.isChecked()) {

            if (dcl01h2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01h2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01h2days: This data is Required!");
                return false;
            } else {
                dcl01h2days.setError(null);
            }
        }


        if (dcl01im.isChecked()) {

            if (dcl01i1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01i1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01i1days: This data is Required!");
                return false;
            } else {
                dcl01i1days.setError(null);
            }
        }

        if (dcl01ic.isChecked()) {

            if (dcl01i2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01i2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01i2days: This data is Required!");
                return false;
            } else {
                dcl01i2days.setError(null);
            }
        }







        // ================= Q1A / MotherTB =============


        if (dcl02am.isChecked()) {

            if (dcl02a1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02a1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02a1fr: This data is Required!");
                return false;
            } else {
                dcl02a1fr.setError(null);
            }
        }


        // ================ Q1A / Child ================


        if (dcl02ac.isChecked()) {

            if (dcl02a2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02a2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02a2fr: This data is Required!");
                return false;
            } else {
                dcl02a2fr.setError(null);
            }

        }


        // ================ Q1B / MotherTB ================


        if (dcl02bm.isChecked()) {
            /*if (dcl02b1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02b1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02b1days: This data is Required!");
                return false;
            } else {
                dcl02b1days.setError(null);
            }*/

            if (dcl02b1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02b1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02b1fr: This data is Required!");
                return false;
            } else {
                dcl02b1fr.setError(null);
            }

        }


        // ================ Q1B / Child ================


        if (dcl02bc.isChecked()) {

            if (dcl02b2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02b2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02b2fr: This data is Required!");
                return false;
            } else {
                dcl02b2fr.setError(null);
            }

        }


        // ================ Q1C / MotherTB ================


        if (dcl02cm.isChecked()) {
            /*if (dcl02c1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02c1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02c1days: This data is Required!");
                return false;
            } else {
                dcl02c1days.setError(null);
            }*/

            if (dcl02c1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02c1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02c1fr: This data is Required!");
                return false;
            } else {
                dcl02c1fr.setError(null);
            }

        }


        // ================ Q1C / Child ================


        if (dcl02cc.isChecked()) {
            /*if (dcl02c2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02c2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02c2days: This data is Required!");
                return false;
            } else {
                dcl02c2days.setError(null);
            }*/

            if (dcl02c2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02c2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02c2fr: This data is Required!");
                return false;
            } else {
                dcl02c2fr.setError(null);
            }

        }


        // ================ Q1D / MotherTB ================


        if (dcl02dm.isChecked()) {
            /*if (dcl02d1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02d1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02d1days: This data is Required!");
                return false;
            } else {
                dcl02d1days.setError(null);
            }*/

            if (dcl02d1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02d1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02d1fr: This data is Required!");
                return false;
            } else {
                dcl02d1fr.setError(null);
            }

        }


        // ================ Q1C / Child ================


        if (dcl02dc.isChecked()) {


            if (dcl02d2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02d2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02d2fr: This data is Required!");
                return false;
            } else {
                dcl02d2fr.setError(null);
            }

        }


        // ================ Q1E / MotherTB ================


        if (dcl02em.isChecked()) {
           /* if (dcl02e1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02e1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02e1days: This data is Required!");
                return false;
            } else {
                dcl02e1days.setError(null);
            }*/

            if (dcl02e1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02e1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02e1fr: This data is Required!");
                return false;
            } else {
                dcl02e1fr.setError(null);
            }

        }


        // ================ Q1E / Child ================


        if (dcl02ec.isChecked()) {
            if (dcl02e2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02e2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02e2fr: This data is Required!");
                return false;
            } else {
                dcl02e2fr.setError(null);
            }
        }


        // ================ Q1C / MotherTB ================


        if (dcl02fm.isChecked()) {
           /* if (dcl02f1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02f1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02f1days: This data is Required!");
                return false;
            } else {
                dcl02f1days.setError(null);
            }
*/
            if (dcl02f1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02f1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02f1fr: This data is Required!");
                return false;
            } else {
                dcl02f1fr.setError(null);
            }

        }


        // ================ Q1C / Child ================


        if (dcl02fc.isChecked()) {
            /*if (dcl02f2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02f2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02f2days: This data is Required!");
                return false;
            } else {
                dcl02f2days.setError(null);
            }*/

            if (dcl02f2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02f2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02f2fr: This data is Required!");
                return false;
            } else {
                dcl02f2fr.setError(null);
            }

        }


        // ================ Q1G / MotherTB ================


        if (dcl02gm.isChecked()) {


            if (dcl02g1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02g1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02g1fr: This data is Required!");
                return false;
            } else {
                dcl02g1fr.setError(null);
            }

        }


        // ================ Q1G / Child ================


        if (dcl02gc.isChecked()) {
            /*if (dcl02g2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02g2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02g2days: This data is Required!");
                return false;
            } else {
                dcl02g2days.setError(null);
            }*/

            if (dcl02g2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02g2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02g2fr: This data is Required!");
                return false;
            } else {
                dcl02g2fr.setError(null);
            }

        }


        // ================ Q1H / MotherTB ================


        if (dcl02hm.isChecked()) {
            /*if (dcl02h1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02h1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02h1days: This data is Required!");
                return false;
            } else {
                dcl02h1days.setError(null);
            }*/

            if (dcl02h1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02h1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02h1fr: This data is Required!");
                return false;
            } else {
                dcl02h1fr.setError(null);
            }

        }


        // ================ Q1H / Child ================


        if (dcl02hc.isChecked()) {
            /*if (dcl02h2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02h2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02h2days: This data is Required!");
                return false;
            } else {
                dcl02h2days.setError(null);
            }*/

            if (dcl02h2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02h2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02h2fr: This data is Required!");
                return false;
            } else {
                dcl02h2fr.setError(null);
            }

        }


        // ================ Q1I / MotherTB ================


        if (dcl02im.isChecked()) {
            /*if (dcl02i1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02i1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02i1days: This data is Required!");
                return false;
            } else {
                dcl02i1days.setError(null);
            }*/

            if (dcl02i1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02i1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02i1fr: This data is Required!");
                return false;
            } else {
                dcl02i1fr.setError(null);
            }

        }


        // ================ Q1I / Child ================


        if (dcl02ic.isChecked()) {
            /*if (dcl02i2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl02i2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02i2days: This data is Required!");
                return false;
            } else {
                dcl02i2days.setError(null);
            }
*/
            if (dcl02i2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl02i2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl02i2fr: This data is Required!");
                return false;
            } else {
                dcl02i2fr.setError(null);
            }

        }


        //======================== Q2A==================
        if (dcl03a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl03a), Toast.LENGTH_SHORT).show();
            dcl03a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl03a: This data is Required!");
            return false;
        } else {
            dcl03a.setError(null);
        }

        //======================== Q2B==================
        if (dcl03b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl03b), Toast.LENGTH_SHORT).show();
            dcl03b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl03b: This data is Required!");
            return false;
        } else {
            dcl03b.setError(null);
        }

        //======================== Q2C==================
        if (dcl03c.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl03c), Toast.LENGTH_SHORT).show();
            dcl03c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl03c: This data is Required!");
            return false;
        } else {
            dcl03c.setError(null);
        }

        //======================== Q2D==================
        if (dcl03d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl03d), Toast.LENGTH_SHORT).show();
            dcl03d.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl03d: This data is Required!");
            return false;
        } else {
            dcl03d.setError(null);
        }

        //======================== Q2E==================
        if (dcl03e.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl03e), Toast.LENGTH_SHORT).show();
            dcl03e.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl03e: This data is Required!");
            return false;
        } else {
            dcl03e.setError(null);
        }

        //======================== Q3==================
        if (dcl04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl04), Toast.LENGTH_SHORT).show();
            dcl0403.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl0403: This data is Required!");
            return false;
        } else {
            dcl0403.setError(null);
        }

        //======================== Q4==================
        if (dcl05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl05), Toast.LENGTH_SHORT).show();
            dcl0503.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl0503: This data is Required!");
            return false;
        } else {
            dcl0503.setError(null);
        }

        //======================== Q5==================
        if (dcl06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl06), Toast.LENGTH_SHORT).show();
            dcl0603.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl0603: This data is Required!");
            return false;
        } else {
            dcl0603.setError(null);
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
