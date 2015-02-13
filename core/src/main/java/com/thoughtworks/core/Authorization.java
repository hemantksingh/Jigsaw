package com.thoughtworks.core;

/**
 * Created by hkumar on 13/02/2015.
 */
public class Authorization implements IAuthorization {
    @Override
    public boolean isAuthenticated() {
        return true;
    }
}
