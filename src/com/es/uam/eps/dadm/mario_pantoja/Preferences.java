package com.es.uam.eps.dadm.mario_pantoja;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class Preferences extends PreferenceActivity {
	private final static String TYPE_KEY = "type";
	private final static int TYPE_DEFAULT = Game.ENGLISH ;

	private final static String PLAY_MUSIC_KEY = "music";
	private final static boolean PLAY_MUSIC_DEFAULT = false;

	private final static String PLAYER_KEY = "username";
	private final static String PLAYER_DEFAULT = "First player";



	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);

	}

	public static int getType(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context)
				.getInt(TYPE_KEY, TYPE_DEFAULT);
	}

	public static boolean playMusic(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context)
				.getBoolean(PLAY_MUSIC_KEY, PLAY_MUSIC_DEFAULT);
	}

	public static String getPlayerName(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context)
				.getString(PLAYER_KEY, PLAYER_DEFAULT);
	}


}