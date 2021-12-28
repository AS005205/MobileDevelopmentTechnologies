package com.dima.MobileDevTechnologies.interfaces;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.dima.MobileDevTechnologies.pojo.MovieDetails;

import java.util.List;

@Dao
public interface DAO {

    @Query("SELECT * FROM moviedetails")
    List<MovieDetails> getAll();

    @Query("SELECT * FROM moviedetails WHERE id = :id")
    MovieDetails getById(String id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MovieDetails item);

}