package com.semanticsquare.thrilio.dao;

import com.semanticsquare.thrilio.DataStore;
import com.semanticsquare.thrilio.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getbookmarks(){
        return DataStore.getBookmarks();
    }
}
