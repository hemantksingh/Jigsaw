package com.thoughtworks.core;

/**
 * Created by hkumar on 13/02/2015.
 */
public class FakeAuthorization implements IAuthorization{
    private boolean authenticated;

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }
}
