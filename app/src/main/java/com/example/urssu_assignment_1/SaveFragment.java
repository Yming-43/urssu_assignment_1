package com.example.urssu_assignment_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SaveFragment extends Fragment
{

    private View view;
    private EditText et_name;
    private EditText et_phonenumber;
    private Button btn_save;

    private DatabaseReference mDatabaseRef = FirebaseDatabase.getInstance().getReference();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        view = inflater.inflate(R.layout.fragment_save, container, false);

        et_name = view.findViewById(R.id.fsave_et_name);
        et_phonenumber = view.findViewById(R.id.fsave_et_phone);
        btn_save = view.findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name = et_name.getText().toString();
                String phonenumber = et_phonenumber.getText().toString();

                HashMap result = new HashMap<>();

                result.put("Name", name);
                result.put("PhoneNumber", phonenumber);

                saveNewData(name, phonenumber);
                Toast.makeText(getActivity(), "등록되었습니다.", Toast.LENGTH_SHORT).show();
            }

            private void saveNewData( String mname, String mphonenumber) {
                RecyclerItem ritem = new RecyclerItem(mname, mphonenumber);
                mDatabaseRef.child("Data").push().setValue(ritem);
            }
        });

        return view;
    }
}