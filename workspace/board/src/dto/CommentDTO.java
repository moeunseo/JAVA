package dto;

public class CommentDTO {
	private String postTitle; 
	private String postContent; 
	private String commentContent; 
	private String memberName;
	
	public CommentDTO() {;}

	public CommentDTO(String postTitle, String postContent, String commentContent, String memberName) {
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.commentContent = commentContent;
		this.memberName = memberName;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "CommentDTO [postTitle=" + postTitle + ", postContent=" + postContent + ", commentContent="
				+ commentContent + ", memberName=" + memberName + "]";
	}
}
