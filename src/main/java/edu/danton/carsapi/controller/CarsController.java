package edu.danton.carsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.danton.carsapi.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
  @PostMapping
  public void createCar(@RequestBody CarDTO car) {
    String resultado = "Resumo sobre o carro recebido:"+"\nModelo: "+car.modelo()+"\nAno: "+car.anoModelo()+"\nValor: R$ "+car.valor();
    System.out.println(resultado);
  }
}
