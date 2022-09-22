package com.graphql.graphql.queries;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class TestQueryResolver implements GraphQLQueryResolver {
    public String getString(){
        return "Hello";
    }
}
