package br.com.mikepaiva.cardapio.controller;

import br.com.mikepaiva.cardapio.domain.FoodRequestDTO;
import br.com.mikepaiva.cardapio.domain.FoodResponseDTO;
import br.com.mikepaiva.cardapio.food.Food;
import br.com.mikepaiva.cardapio.food.FoodRepository;
import br.com.mikepaiva.cardapio.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<Food> addFood(@RequestBody FoodRequestDTO body) {
        Food food = foodService.addFood(body);
        return ResponseEntity.ok(food);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList;
        foodList = foodService.getAllFoods();
        return foodList;
    }
}
