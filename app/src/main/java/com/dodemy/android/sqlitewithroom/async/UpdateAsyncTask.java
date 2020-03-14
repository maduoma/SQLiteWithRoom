package com.dodemy.android.sqlitewithroom.async;

import android.os.AsyncTask;

import com.dodemy.android.sqlitewithroom.models.Note;
import com.dodemy.android.sqlitewithroom.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }

}