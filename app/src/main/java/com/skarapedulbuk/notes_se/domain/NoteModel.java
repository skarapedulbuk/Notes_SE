package com.skarapedulbuk.notes_se.domain;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.StringRes;

public class NoteModel implements Parcelable {
    @StringRes
    private final int noteName;

    @StringRes
    private final int noteDescription;


    public NoteModel(int noteName, int noteDescription) {
        this.noteName = noteName;
        this.noteDescription = noteDescription;
    }

    protected NoteModel(Parcel in) {
        noteName = in.readInt();
        noteDescription = in.readInt();
    }

    public static final Creator<NoteModel> CREATOR = new Creator<NoteModel>() {
        @Override
        public NoteModel createFromParcel(Parcel in) {
            return new NoteModel(in);
        }

        @Override
        public NoteModel[] newArray(int size) {
            return new NoteModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(noteName);
        dest.writeInt(noteDescription);
    }
}
