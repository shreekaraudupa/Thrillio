package com.semanticsquare.thrilio.dao;

import com.semanticsquare.thrilio.DataStore;
import com.semanticsquare.thrilio.entities.Bookmark;
import com.semanticsquare.thrilio.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getbookmarks(){
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.add(userBookmark);
    }
}
