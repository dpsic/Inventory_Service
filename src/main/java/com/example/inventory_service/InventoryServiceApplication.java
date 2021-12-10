package com.example.inventory_service;

import com.example.inventory_service.entities.Product;
import com.example.inventory_service.respository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.config.RepositoryConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepo productRepo , RepositoryRestConfiguration restConfiguration)
    {restConfiguration.exposeIdsFor(Product.class);
        return args ->{
            productRepo.save(new Product(null,"ordinateur",788,12));
            productRepo.save(new Product(null,"smart phone",148,15));
            productRepo.save(new Product(null,"imprimante",120,100));
            productRepo.findAll().forEach(c->{
                System.out.println(c.getName());            });
        };
    }
}
