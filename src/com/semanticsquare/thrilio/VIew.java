package com.semanticsquare.thrilio;

import com.semanticsquare.thrilio.controllers.BookmarkController;
import com.semanticsquare.thrilio.entities.Bookmark;
import com.semanticsquare.thrilio.entities.User;

public class VIew {
    public static void bookmark(User user , Bookmark[][] bookmarks){
        System.out.println("\nUser -" +user+"\nBookmarking - "+bookmarks);
        for(int i=0;i< DataStore.USER_BOOKMARK_LIMIT ;i++){
            int typeOffSet = (int) (Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
            int bookmarkOffset = (int) (Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPES);

            Bookmark bookmark = bookmarks[typeOffSet][bookmarkOffset];

            BookmarkController.getInstance().saveUserBookmark(user,bookmark);

            System.out.println(bookmark);
        }
    }
}
