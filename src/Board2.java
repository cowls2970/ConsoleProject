
import java.time.LocalDateTime;

public class Board2 {
	private int id; // �Խñ� ID
	private String title; // ����
	private String content; // ����

	// ������
	public Board2(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	// Getter �޼ҵ�
	public int getId() {
		return id;
	}

	// ������ �����ϴ�.
	public String getTitle() {
		return title;
	}

	// ������ �����ϴ�.
	public String getContent() {
		return content;
	}

	// Setter �޼ҵ� // ������ �����մϴ�.
	public void setTitle(String title) {
		this.title = title;
	}

	// ������ �����մϴ�.
	public void setContent(String content) {
		this.content = content;
	}

	// �ۼ��� ���� ����� ID�� ��� �����Դϴ�.
	@Override
	public String toString() {
		return "ID: " + id + "\nTitle: " + title + "\nContent: " + content + "\n";
	}
}