package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilmSaveResponseDTO {
private Film film;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Film {
        private long id;
        private String name;
        private int price;
        private int productionYear;
        private String[] country;
        private String[] genre;
        private float rating;
        private long views;
        private String image;
    }
}