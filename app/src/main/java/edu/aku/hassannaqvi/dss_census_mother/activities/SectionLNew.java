package edu.aku.hassannaqvi.dss_census_mother.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_mother.R;

public class SectionLNew extends Activity
{

    @BindView(R.id.dcl01am)
    CheckBox dcl01am;
    @BindView(R.id.dcl01a1days)
    EditText dcl02a1days;
    @BindView(R.id.dcl02am)
    CheckBox dcl02am;
    @BindView(R.id.dcl02a1fr)
    EditText dcl02a1fr;
    @BindView(R.id.dcl01ac)
    CheckBox dcl01ac;
    @BindView(R.id.dcl01b1days)
    EditText dcl02b1days;
    @BindView(R.id.dcl02ac)
    CheckBox dcl02ac;
    @BindView(R.id.dcl02b1fr)
    EditText dcl02b1fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l_new);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }


}
