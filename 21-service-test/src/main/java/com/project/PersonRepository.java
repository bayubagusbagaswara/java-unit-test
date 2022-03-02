package com.project;

public interface PersonRepository {

    // kita akan gunakan DataModel Person sebagai representasi data di database

    Person selectById(String id);

    void insert(Person person);
}
