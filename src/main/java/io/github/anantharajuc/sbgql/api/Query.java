package io.github.anantharajuc.sbgql.api;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver
{
	public String getString()
	{
		return "Hello GraphQL World! "+LocalDateTime.now();
	}
}
