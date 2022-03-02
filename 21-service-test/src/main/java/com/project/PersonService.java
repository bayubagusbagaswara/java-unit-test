package com.project;

import java.util.UUID;

public class PersonService {

    // class ini akan ketergantungan dengan PersonRepository
    // karena class ini untuk komunikasi ke database harus menggunakan PersonRepository

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // balikan method adalah Person, dengan parameter id berasal dari Person
    public Person get(String id){
        // ambil person dari personRepository
        Person person = personRepository.selectById(id);
        if (person != null){
            return person;
        } else {
            throw new IllegalArgumentException("Person not found");
        }
    }

    // Pertanyaannya bagaimana kita membuat test untuk method get() diatas?
    // karena method get() membutuhkan personRepository, artinya ketergantungan terhadap interface atau class yang lain
    // untuk itu kita bisa menggunakan Mockito

    // kita tambahkan method untuk register
    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        // gunakan method insert dari repository, dan insert data person nya
        personRepository.insert(person);
        return person;
    }
}
