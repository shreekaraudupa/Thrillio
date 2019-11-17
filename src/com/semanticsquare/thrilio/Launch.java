package com.semanticsquare.thrilio;

import com.semanticsquare.thrilio.entities.Bookmark;
import com.semanticsquare.thrilio.entities.User;
import com.semanticsquare.thrilio.managers.BookmarkManager;
import com.semanticsquare.thrilio.managers.UserManager;

public class Launch {
    private static User[] users;
    private static Bookmark[][] bookmarks;


    private static void loadData(){
        System.out.println("Loading data .. ");
        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmark();

        System.out.println("Printing users");
        printUserData();
        System.out.println("Printing bookmark");
        printBookmarkData();
    }

    private static void printBookmarkData() {
        for (Bookmark[] bookmarkList : bookmarks){
            for (Bookmark bookmark: bookmarkList) {
                System.out.println(bookmark);
            }
        }
    }

    private static void printUserData() {
        for (User user : users){
            System.out.println(user);
        }
    }

    private static void startBookmarking() {
        System.out.println("/n/n/n/n/n/2. Bookmarking ");
        for(User user : users){
            VIew.bookmark(user,bookmarks);
        }
    }
    public static void main(String[] args) {
        loadData();
        startBookmarking();
    }


}
