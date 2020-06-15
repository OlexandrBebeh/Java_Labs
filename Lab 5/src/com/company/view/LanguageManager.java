package com.company.view;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public enum LanguageManager {
    INSTANCE;
    private ResourceBundle resBun;
    private final String RESOURCE_NAME = "com.company.localization.text";
    private LanguageManager(){
        resBun = ResourceBundle.getBundle(RESOURCE_NAME, Locale.getDefault());
    }
    public void changeLanguage (Locale locale){
        resBun = ResourceBundle.getBundle(RESOURCE_NAME,locale);
    }
    public String getString (String key){
        return resBun.getString(key);
    }
    public Enumeration getSetKey (){
        return resBun.getKeys();
    }
}
