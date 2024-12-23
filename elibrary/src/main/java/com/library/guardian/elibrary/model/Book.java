package com.library.guardian.elibrary.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private String category;
    private int availableCopies;
	
/*    public Object getTitle() {
		return this.title;
	}

	public Object getAuthor() {
		return this.author;
	}

	public void setTitle(String title) {
		this.title = title;
	}
*/
}
