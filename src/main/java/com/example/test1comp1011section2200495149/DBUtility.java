package com.example.test1comp1011section2200495149;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/javatest";

    public static ArrayList<NetflixShow> getNetflixShowsFromDB()
    {
        ArrayList<NetflixShow> netflixShows = new ArrayList<>();

        String sql =    "SELECT showId, type, title, rating, director, cast \n" +
                        "FROM netflix;";

        try(
                Connection conn = DriverManager.getConnection(connectUrl,user,pw);

                Statement statement = conn.createStatement();

                ResultSet dbResults = statement.executeQuery(sql);
        )
        {

            while (dbResults.next())
            {
                int showId = dbResults.getInt("showid");
                String type = dbResults.getString("type");
                String title = dbResults.getString("title");
                String rating = dbResults.getString("rating");
                String director = dbResults.getString("director");
                String cast = dbResults.getString("cast");
                NetflixShow newShow = new NetflixShow(showId,type, title, rating, director, cast);
                netflixShows.add(newShow);

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return netflixShows;
    }

    public static ArrayList<String> getRatingsFromDB()
    {
        ArrayList<String> ratings = new ArrayList<>();

        String sql =    "SELECT rating "    +
                        "FROM netflix "     +
                        "GROUP BY rating "  +
                        "ORDER BY rating;";

        try(
                Connection conn = DriverManager.getConnection(connectUrl,user,pw);

                Statement statement = conn.createStatement();

                ResultSet dbResults = statement.executeQuery(sql);
        )
        {

            while (dbResults.next())
            {
                String rating = dbResults.getString("rating");
                ratings.add(rating);

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return ratings;
    }
}
