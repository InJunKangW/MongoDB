package com.example.mongodb.document;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

@Getter
@Document
public class Person {
	@Id
	private String id;

	private String name;
	private int age;

	@CreatedDate
	private Instant createdAt;
}
