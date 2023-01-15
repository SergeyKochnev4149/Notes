package com.example.notes.notesList;

public class NoteData {
    private String headline;
    private String description;
    private String editDate;

    public NoteData(String headline, String description, String editDate) {
        this.headline = headline;
        this.description = description;
        this.editDate = editDate;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }


}
