package dto;

// 해당 게시물에 대한 댓글 목록을 조회하기 위한 클래스
public class PostDTO {
	private int postNumber;
	private String postTitle;
	private String postComment;
	private String commentContent;
	private int memberNumber;
	
	public PostDTO() {;}

	public PostDTO(int postNumber, String postTitle, String postComment, String commentContent, int memberNumber) {
		this.postNumber = postNumber;
		this.postTitle = postTitle;
		this.postComment = postComment;
		this.commentContent = commentContent;
		this.memberNumber = memberNumber;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostComment() {
		return postComment;
	}

	public void setPostComment(String postComment) {
		this.postComment = postComment;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return "PostDTO [postNumber=" + postNumber + ", postTitle=" + postTitle + ", postComment=" + postComment
				+ ", commentContent=" + commentContent + ", memberNumber=" + memberNumber + "]";
	}
}
