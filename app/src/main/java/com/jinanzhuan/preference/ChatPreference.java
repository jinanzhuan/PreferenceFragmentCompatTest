package com.jinanzhuan.preference;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class ChatPreference extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_chat, rootKey);
    }
}

