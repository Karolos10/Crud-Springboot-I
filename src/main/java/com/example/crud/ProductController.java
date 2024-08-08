package com.example.crud;

import com.example.crud.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    @GetMapping
    public List<Product> getProduct(){
        return List.of(
                new Product(
                        2545L,
                        "Computer",
                        500,
                        LocalDate.of(2020, Month.DECEMBER, 10),
                        9
                )
        );
    }
}
