package com.example.booklisting;

import android.content.Context;

import android.content.AsyncTaskLoader;

import java.util.List;

public class BookLoader extends AsyncTaskLoader<List<Book>> {


/** Query URL */
private String mUrl;

/**
 * Constructs a new {@link BookLoader}.
 *
 * @param context of the activity
 * @param url to load data from
 */
public BookLoader(Context context, String url) {

        super(context);
        mUrl = url;
        }

@Override
protected void onStartLoading() {
        forceLoad();
        }

/**
 * This is on a background thread.
 */
@Override
public List<Book> loadInBackground() {
        if (mUrl == null) {
        return null;
        }

        // Perform the network request, parse the response, and extract a list of books.
        List<Book> books = QueryUtils.fetchBookData(mUrl);
        return books;
        }
        }