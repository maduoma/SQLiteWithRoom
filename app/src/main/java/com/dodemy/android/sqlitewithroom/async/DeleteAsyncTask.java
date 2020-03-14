package com.dodemy.android.sqlitewithroom.async;


import android.os.AsyncTask;

import com.dodemy.android.sqlitewithroom.models.Note;
import com.dodemy.android.sqlitewithroom.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }

}