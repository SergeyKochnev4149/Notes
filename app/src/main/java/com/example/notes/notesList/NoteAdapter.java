package com.example.notes.notesList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.R;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    Context context;
    NoteData[] noteList;

    public NoteAdapter(Context context, NoteData[] noteList) {
        this.context = context;
        this.noteList = noteList;
    }

    @NonNull
    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.note_template, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteAdapter.ViewHolder holder, int position) {
        holder.tvNoteHeadline.setText(noteList[position].getHeadline());
        holder.tvNoteDescription.setText((noteList[position].getDescription()));
        holder.tvNoteEditDate.setText(noteList[position].getEditDate());
    }

    @Override
    public int getItemCount() {
        return noteList.length;
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
