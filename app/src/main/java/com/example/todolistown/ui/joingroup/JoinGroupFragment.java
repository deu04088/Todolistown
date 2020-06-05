package com.example.todolistown.ui.joingroup;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.todolistown.R;
import com.example.todolistown.ui.group.GroupViewModel;

public class JoinGroupFragment extends Fragment {

    private GroupViewModel groupViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        groupViewModel =
                ViewModelProviders.of(this).get(GroupViewModel.class);
        View root = inflater.inflate(R.layout.fragment_group, container, false);
        final TextView textView = root.findViewById(R.id.text_group);
        groupViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
