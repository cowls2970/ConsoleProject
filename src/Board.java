
import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Board2> posts;

	// 게시판의 기능 정렬입니다.
	public Board() {
		this.posts = new ArrayList<>();
	}

	// 게시판에 글을 추가하는 기능입니다.
	public void addPost(Board2 post) {
		this.posts.add(post);
	}

	// 게시판의 글을 제거하는 기능입니다.
	public void deletePost(int id) {
		for (Board2 post : posts) {
			if (post.getId() == id) {
				posts.remove(post);
				break;
			}
		}
	}

	// 게시판에 있는 글을 보여주는 기능입니다.
	public void showPosts() {
		System.out.println("==== 게시글 목록 ====");
		for (Board2 post : posts) {
			System.out.println(post.toString());
		}
	}

	// 글을 작성하면 다시 처음으로 돌아갑니다.
	public List<Board2> getPosts() {
		return this.posts;
	}
}