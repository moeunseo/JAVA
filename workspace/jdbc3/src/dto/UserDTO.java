package dto;

//내 정보를 보는데 내가 추천한 사람의 아이디와 이름도 같이 확인!
public class UserDTO {
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userBirth;
	private int userRecommenderNumber;
	private String recommenderId;
	private String recommenderName;
	
	public UserDTO() {;}

	// 만약 또 다른 정보를 가져오고싶다?
	// 생성자 매개변수를 다르게 해서 하면 된다.
	public UserDTO(int userNumber, String userId, String userPw, String userName, String userPhone, String userBirth,
			int userRecommenderNumber, String recommenderId, String recommenderName) {
		this.userNumber = userNumber;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userBirth = userBirth;
		this.userRecommenderNumber = userRecommenderNumber;
		this.recommenderId = recommenderId;
		this.recommenderName = recommenderName;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public int getUserRecommenderNumber() {
		return userRecommenderNumber;
	}

	public void setUserRecommenderNumber(int userRecommenderNumber) {
		this.userRecommenderNumber = userRecommenderNumber;
	}

	public String getRecommenderId() {
		return recommenderId;
	}

	public void setRecommenderId(String recommenderId) {
		this.recommenderId = recommenderId;
	}

	public String getRecommenderName() {
		return recommenderName;
	}

	public void setRecommenderName(String recommenderName) {
		this.recommenderName = recommenderName;
	}

	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", userName="
				+ userName + ", userPhone=" + userPhone + ", userBirth=" + userBirth + ", userRecommenderNumber="
				+ userRecommenderNumber + ", recommenderId=" + recommenderId + ", recommenderName=" + recommenderName
				+ "]";
	}
}
