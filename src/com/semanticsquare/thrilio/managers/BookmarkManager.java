package com.semanticsquare.thrilio.managers;

import com.semanticsquare.thrilio.DataStore;
import com.semanticsquare.thrilio.dao.BookmarkDao;
import com.semanticsquare.thrilio.entities.*;

public class BookmarkManager {
    private static BookmarkManager bookmarkManagerInstance = new BookmarkManager();
    private static BookmarkDao bookmarkDao=new BookmarkDao();
    //Private constructor as others cant instantiate this class as we want to maintain Singleton
    private BookmarkManager() {
    }

    public Bookmark[][] getBookmark(){
        return bookmarkDao.getbookmarks();
    }

    public static BookmarkManager getInstance() {
        return bookmarkManagerInstance;
    }

    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {

        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);

        return movie;
    }

    public Book createBook(long id, String title, String profileUrl,int publicationYear,String publisher, String[] authors,String genre,double amazonRating){

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setProfileUrl(profileUrl);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    public WebLink createWeblink(long id, String title, String profileUrl ,String url,String host){

        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setProfileUrl(profileUrl);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        UserBookmark userBookmark = new UserBookmark();
        userBookmark.setUser(user);
        userBookmark.setBookmark(bookmark);
        bookmarkDao.saveUserBookmark(userBookmark);
    }
}
