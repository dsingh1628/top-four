package com.example.todo.persistence;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	private int taskId;
	private String taskName;
	private Date createAt;
	private Date lastUpdatedAt;
	private boolean isDeleted;

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", createAt=" + createAt + ", lastUpdatedAt="
				+ lastUpdatedAt + ", isDeleted=" + isDeleted + "]";
	}

	
	
}
