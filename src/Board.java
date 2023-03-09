
import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Board2> posts;

	// �Խ����� ��� �����Դϴ�.
	public Board() {
		this.posts = new ArrayList<>();
	}

	// �Խ��ǿ� ���� �߰��ϴ� ����Դϴ�.
	public void addPost(Board2 post) {
		this.posts.add(post);
	}

	// �Խ����� ���� �����ϴ� ����Դϴ�.
	public void deletePost(int id) {
		for (Board2 post : posts) {
			if (post.getId() == id) {
				posts.remove(post);
				break;
			}
		}
	}

	// �Խ��ǿ� �ִ� ���� �����ִ� ����Դϴ�.
	public void showPosts() {
		System.out.println("==== �Խñ� ��� ====");
		for (Board2 post : posts) {
			System.out.println(post.toString());
		}
	}

	// ���� �ۼ��ϸ� �ٽ� ó������ ���ư��ϴ�.
	public List<Board2> getPosts() {
		return this.posts;
	}
}