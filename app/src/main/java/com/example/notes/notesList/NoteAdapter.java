package com.example.notes.notesList;

import android.app.ListActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.MainActivity;
import com.example.notes.R;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    Context context;
    public ArrayList<NoteData> noteList;



    public NoteAdapter(Context context) {
        this.context = context;
        this.noteList = new ArrayList<>();

    }

    @NonNull
    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.note_template, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteAdapter.ViewHolder holder, int position) {
        holder.tvNoteHeadline.setText(noteList.get(position).getHeadline());
        holder.tvNoteDescription.setText((noteList.get(position).getDescription()));
        holder.tvNoteEditDate.setText(noteList.get(position).getEditDate());


    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNoteHeadline;
        TextView tvNoteEditDate;
        TextView tvNoteDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNoteHeadline = itemView.findViewById(R.id.tvNoteHeadline);
            tvNoteDescription = itemView.findViewById(R.id.tvNoteDescription);
            tvNoteEditDate = itemView.findViewById(R.id.tvNoteEditDate);
        }
    }
}
