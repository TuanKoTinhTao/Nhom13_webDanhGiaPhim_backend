package com.film.movieist.movies;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Review {
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String imdbId;

    public Review(String body, LocalDateTime created, LocalDateTime updated, String imdbId) {
        this.body = body;
        this.created = created;
        this.updated = updated;
        this.imdbId = imdbId;
    }
}
