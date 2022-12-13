package com.blog.app.task.model;

import java.sql.Timestamp;

/**
 * TODO:
 * - Add the proper Spring annotations to the entity and its fields
 * - Include relations between entities
 */

public class Post {

	private Integer id;
	private Integer views;
	private String title;
	private String body;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	private User user;
}
