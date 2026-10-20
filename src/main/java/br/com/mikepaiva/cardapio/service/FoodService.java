package br.com.mikepaiva.cardapio.service;

import br.com.mikepaiva.cardapio.domain.FoodRequestDTO;
import br.com.mikepaiva.cardapio.domain.FoodResponseDTO;
import br.com.mikepaiva.cardapio.repository.Food;
import br.com.mikepaiva.cardapio.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    public Food addFood(FoodRequestDTO data) {
        Food food = new Food(data);

        return foodRepository.save(food);
    }

    public List<FoodResponseDTO> getAllFoods() {
        List<FoodResponseDTO> foodList;
        foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
