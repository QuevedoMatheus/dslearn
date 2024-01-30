package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dslearnbds.entities.Notification;

public class NotificationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
		
		private Long id;
		private String text;
		private Instant moment;
		private boolean read;
		private Long UserId;

		public NotificationDTO() {
			
		}

		public NotificationDTO(Long id, String text, Instant moment, boolean read, Long userId) {
			this.id = id;
			this.text = text;
			this.moment = moment;
			this.read = read;
			UserId = userId;
		}
		
		public NotificationDTO(Notification entity) {
			id = entity.getId();
			text = entity.getText();
			moment = entity.getMoment();
			read = entity.isRead();
			UserId = entity.getUser().getId();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Instant getMoment() {
			return moment;
		}

		public void setMoment(Instant moment) {
			this.moment = moment;
		}

		public boolean isRead() {
			return read;
		}

		public void setRead(boolean read) {
			this.read = read;
		}

		public Long getUserId() {
			return UserId;
		}

		public void setUserId(Long userId) {
			UserId = userId;
		}
		
		
	
		
}
