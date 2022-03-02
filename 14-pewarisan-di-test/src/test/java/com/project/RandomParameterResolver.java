package com.project;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.util.Random;

/**
 * buat dependency injection manual
 * yakni dengan cara implement ParameterResolver
 * ParameterResolver berguna untuk melakukan inject ke sebuah unit test
 */
public class RandomParameterResolver implements ParameterResolver {

    private final Random random = new Random();

    // kita beri tahu JUnit nya supportParameter nya apa
    // jadi supportParameter ini hanya akan support untuk meng-inject parameter tipe Random Class
    // jadi jika parameter unit test nya bukan tipe Random, maka tidak bisa di inject

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == Random.class;
    }

    // Untuk resolve hasilnya tinggal kembalikan object random nya

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return random;
    }
}
