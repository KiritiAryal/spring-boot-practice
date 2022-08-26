package org.hb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name = "monitorById", query = "from Monitor where id = ?1"),
	@NamedQuery(name = "monitorByWidth", query = "from Monitor where width = ?1")	
})
@Entity
@Table(name = "monitor_tb")
public class Monitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int height;
	private int width;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Monitor [id=" + id + ", height=" + height + ", width=" + width + "]";
	}

}
