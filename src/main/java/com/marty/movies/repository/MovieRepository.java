package com.marty.movies.repository;

import com.marty.movies.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Martim Ramos
 */

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
