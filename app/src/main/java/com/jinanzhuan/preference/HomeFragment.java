package com.jinanzhuan.preference;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class HomeFragment extends PreferenceFragmentCompat implements Preference.OnPreferenceClickListener {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_home, rootKey);

        Preference account = findPreference("account");
        if(account != null) {
            account.setOnPreferenceClickListener(this);
        }
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if(TextUtils.equals(preference.getKey(), "account")) {
            Log.e("TAG", "skip to account activity");
        }
        return false;
    }
}

