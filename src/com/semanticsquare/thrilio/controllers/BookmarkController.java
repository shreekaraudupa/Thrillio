package com.semanticsquare.thrilio.controllers;

import com.semanticsquare.thrilio.entities.Bookmark;
import com.semanticsquare.thrilio.entities.User;
import com.semanticsquare.thrilio.managers.BookmarkManager;

public class BookmarkController {
    private static BookmarkController bookmarkControllerInstance = new BookmarkController();
    private BookmarkController(){}

    public static BookmarkController getInstance(){
        return bookmarkControllerInstance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user ,bookmark);
    }
}
