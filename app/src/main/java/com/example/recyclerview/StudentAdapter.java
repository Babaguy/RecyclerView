package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> studentList;

    // בנאי שמקבל את הנתונים
    public StudentAdapter(List<Student> list) {
        this.studentList = list;
    }

    // 1. יצירת "צלחת" חדשה (קורה רק בהתחלה עד שיש מספיק למסך)
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(view);
    }

    // 2. מילוי ה"צלחת" באוכל (חיבור המידע ל-View) - קורה בגלילה
    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student currentStudent = studentList.get(position);
        holder.tvName.setText(currentStudent.getName());
        holder.tvAge.setText(String.valueOf(currentStudent.getAge()));
    }

    // 3. כמה פריטים יש סה"כ ברשימה?
    @Override
    public int getItemCount() {
        return studentList.size();
    }

    // המחלקה הפנימית שמחזיקה את הרכיבים
    public static class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvAge;

        public StudentViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
        }
    }
}