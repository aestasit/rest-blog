package com.aestasit.blog.rest.bootstrap;

import com.aestasit.blog.rest.BlogServiceRestImpl;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class ApplicationBootstrap extends Application {
    Set singletons = new HashSet();

    public ApplicationBootstrap() {
        singletons.add(new BlogServiceRestImpl());
    }

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        return set;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}