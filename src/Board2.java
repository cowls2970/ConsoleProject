
import java.time.LocalDateTime;

public class Board2 {
	private int id; // 게시글 ID
	private String title; // 제목
	private String content; // 내용

	// 생성자
	public Board2(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	// Getter 메소드
	public int getId() {
		return id;
	}

	// 제목을 갖습니다.
	public String getTitle() {
		return title;
	}

	// 내용을 갖습니다.
	public String getContent() {
		return content;
	}

	// Setter 메소드 // 제목을 설정합니다.
	public void setTitle(String title) {
		this.title = title;
	}

	// 내용을 설정합니다.
	public void setContent(String content) {
		this.content = content;
	}

	// 작성된 글의 내용과 ID의 출력 형식입니다.
	@Override
	public String toString() {
		return "ID: " + id + "\nTitle: " + title + "\nContent: " + content + "\n";
	}
}