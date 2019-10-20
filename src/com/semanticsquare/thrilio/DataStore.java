package com.semanticsquare.thrilio;

import com.semanticsquare.thrilio.entities.Bookmark;
import com.semanticsquare.thrilio.entities.User;
import com.semanticsquare.thrilio.entities.UserBookmark;

public class DataStore {
    private static final int TOTAL_USER_COUNT = 5;
    private static final int BOOKMARK_TYPES_COUNT = 3;
    private static final int BOOKMARK_COUNT_PER_TYPES = 5;
    private static final int USER_BOOKMARK_LIMIT = 5;

    private static User[] users = new User[TOTAL_USER_COUNT];
    private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPES];
    private static UserBookmark[] userBookmarks = new UserBookmark[DataStore.TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
    

}
