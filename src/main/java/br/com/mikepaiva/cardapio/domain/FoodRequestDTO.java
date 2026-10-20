package br.com.mikepaiva.cardapio.domain;

public record FoodRequestDTO(
        String title,
        String image,
        Integer price
) {
}
