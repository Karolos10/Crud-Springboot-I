package com.example.crud.product;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProduct(){
        return List.of(
                new Product(
                        2545L,
                        "Computer HP",
                        500,
                        LocalDate.of(2020, Month.DECEMBER, 10),
                        9
                )
        );
    }
}
