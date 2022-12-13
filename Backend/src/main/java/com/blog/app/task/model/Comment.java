package com.blog.app.task.model;

import java.sql.Timestamp;

/**
 * TODO:
 * - Add the proper Spring annotations to the entity and its fields
 * - Include relations between entities
 */

public class Comment {

	private Integer id;
	private String body;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	private Post post;
	private User author;

}
