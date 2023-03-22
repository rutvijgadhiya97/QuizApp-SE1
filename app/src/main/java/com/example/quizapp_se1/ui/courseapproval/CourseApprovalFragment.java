package com.example.quizapp_se1.ui.courseapproval;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.quizapp_se1.R;
import com.example.quizapp_se1.databinding.FragmentCourseapprovalBinding;

import java.util.Arrays;
import java.util.List;

public class CourseApprovalFragment extends Fragment {

private FragmentCourseapprovalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        //CourseApprovalViewModel dashboardViewModel =
          //      new ViewModelProvider(this).get(CourseApprovalViewModel.class);

   // binding = FragmentCourseapprovalBinding.inflate(inflater, container, false);
    //View root = binding.getRoot();

      //  final TextView textView = binding.textDashboard;
        //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        View view = inflater.inflate(
                R.layout.fragment_courseapproval, container, false);
        Bundle bundle = getArguments();
        String message = bundle.getString("SelectedCourse");
        List<String> selectedCourses= Arrays.asList(message.split(","));
        Spinner dropdown = view.findViewById(R.id.spinner_CourseSelect);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item,selectedCourses);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);

        return view;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}