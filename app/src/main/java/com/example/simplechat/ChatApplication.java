package com.example.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("simplechat-client") // should correspond to APP_ID env variable
                //.clientBuilder(builder)
                .server("https://codepath-chat-lab.herokuapp.com/parse/").build());
                //.addNetworkInterceptor(new ParseLogInterceptor()).build());
        ParseObject.registerSubclass(Message.class);



    }
}
