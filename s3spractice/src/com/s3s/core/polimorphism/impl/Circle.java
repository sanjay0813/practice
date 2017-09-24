package com.s3s.core.polimorphism.impl;

import com.s3s.core.polimorphism.shape;

/**
 * Created by kafle on 9/17/2017.
 */
public class Circle extends shape {
    /**
     * {@inheritDoc}
     */
    @Override
    public void draw(String shapeName) {
        System.out.println( "this is drawing of:"+ shapeName);
    }
}
