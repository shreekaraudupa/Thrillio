package com.semanticsquare.thrilio;

import com.semanticsquare.thrilio.constants.BookGenre;
import com.semanticsquare.thrilio.constants.Gender;
import com.semanticsquare.thrilio.constants.MovieGenre;
import com.semanticsquare.thrilio.constants.UserType;
import com.semanticsquare.thrilio.entities.Bookmark;
import com.semanticsquare.thrilio.entities.User;
import com.semanticsquare.thrilio.entities.UserBookmark;
import com.semanticsquare.thrilio.managers.BookmarkManager;
import com.semanticsquare.thrilio.managers.UserManager;

public class DataStore {
    public static final int TOTAL_USER_COUNT = 5;
    public static final int BOOKMARK_TYPES_COUNT = 3;
    public static final int BOOKMARK_COUNT_PER_TYPES = 5;
    public static final int USER_BOOKMARK_LIMIT = 5;

    private static User[] users = new User[TOTAL_USER_COUNT];
    private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPES];
    private static UserBookmark[] userBookmarks = new UserBookmark[DataStore.TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];


    public static User[] getUsers() {
        return users;
    }

    public static Bookmark[][] getBookmarks() {
        return bookmarks;
    }

    public static void loadData() {
        loadUsers();
        loadWebLinks();
        loadMovies();
        loadBooks();
    }

    private static void loadWebLinks() {
        bookmarks[0][0] = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger ,Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "	http://www.javaworld.com", "unknown");
        bookmarks[0][1] = BookmarkManager.getInstance().createWeblink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "	http://www.stackoverflow.com", "unknown");
        bookmarks[0][2] = BookmarkManager.getInstance().createWeblink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "	http://www.stackoverflow.com", "unknown");
        bookmarks[0][3] = BookmarkManager.getInstance().createWeblink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "	http://www.stackoverflow.com", "unknown");
        bookmarks[0][4] = BookmarkManager.getInstance().createWeblink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "	http://www.stackoverflow.com", "unknown");
    }
    private static void loadMovies() {
        bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","" ,	1941	,new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.CLASSICS,8.5);
        bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","" ,	1941	,new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.CLASSICS,8.5);
        bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","" ,	1941	,new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.CLASSICS,8.5);
        bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","" ,	1941	,new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.CLASSICS,8.5);
        bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","" ,	1941	,new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.CLASSICS,8.5);
    }
    private static void loadBooks() {
        bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000	,"Walden"	,"",1854	, "Wilder Publications",new String[]{"Henry David Thoreau"} , BookGenre.PHILOSOPHY, 4.3);
        bookmarks[2][1] = BookmarkManager.getInstance().createBook(4000	,"Walden"	,"",1854	, "Wilder Publications",new String[]{"Henry David Thoreau"} , BookGenre.PHILOSOPHY, 4.3);
        bookmarks[2][2] = BookmarkManager.getInstance().createBook(4000	,"Walden"	,"",1854	, "Wilder Publications",new String[]{"Henry David Thoreau"} , BookGenre.PHILOSOPHY, 4.3);
        bookmarks[2][3] = BookmarkManager.getInstance().createBook(4000	,"Walden"	,"",1854	, "Wilder Publications",new String[]{"Henry David Thoreau"} , BookGenre.PHILOSOPHY, 4.3);
        bookmarks[2][4] = BookmarkManager.getInstance().createBook(4000	,"Walden"	,"",1854	, "Wilder Publications",new String[]{"Henry David Thoreau"} , BookGenre.PHILOSOPHY, 4.3);

    }


    private static void loadUsers() {
        users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "M", Gender.MALE, UserType.USER);
        users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "John1", "F", Gender.FEMALE, UserType.USER);
        users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", "test", "John2", "F", Gender.FEMALE, UserType.EDITOR);
        users[3] = UserManager.getInstance().createUser(1003, "user3@semanticsquare.com", "test", "John3", "M", Gender.MALE, UserType.USER);
        users[4] = UserManager.getInstance().createUser(1004, "user4@semanticsquare.com", "test", "John4", "M", Gender.MALE, UserType.CHEIF_EDITOR);
    }

    private static int bookmarkIndex = 0;
    public static void add(UserBookmark userBookmark) {
        userBookmarks[bookmarkIndex] = userBookmark;
        bookmarkIndex++;
    }
}
