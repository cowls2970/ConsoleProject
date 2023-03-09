
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalBoard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		System.out.println("lol");
		System.out.println("lol");
		System.out.println("lol");
		System.out.println("lol");
		System.out.println("lol");
		System.out.println("lol");

		// 게시판의 출력 명령 번호
		while (true) {
			System.out.println("==== 게시판 ====");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 삭제");
			System.out.println("3. 게시글 목록 보기");
			System.out.println("0. 종료");
			System.out.println("숫자만 입력해주세요");
			
			try {  // 오류 발생시 처음으로
				
				int menu = sc.nextInt();

				if (menu == 1) { // 게시글 등록
					System.out.println("제목을 입력하세요.");
					sc.nextLine(); // '\n'을 버리기 위해 추가
					String title = sc.nextLine();
					System.out.println("내용을 입력하세요.");
					String content = sc.nextLine();
					int id = board.getPosts().size() + 1; // 게시글 ID는 현재 게시글 개수 + 1로 설정
					Board2 post = new Board2(id, title, content);
					board.addPost(post);
					System.out.println("게시글이 등록되었습니다. ID: " + id);
					System.out.println(); // 빈 줄 추가
				} else if (menu == 2) { // 게시글 삭제
					System.out.println("삭제할 게시글 ID를 입력하세요.");
					int id = sc.nextInt();
					board.deletePost(id);
					System.out.println("게시글이 삭제되었습니다.");
					System.out.println(); // 빈 줄 추가
				} else if (menu == 3) { // 게시글 목록 보기
					board.showPosts();
					System.out.println(); // 빈 줄 추가
				} else if (menu == 0) { // 종료
					System.out.println("프로그램을 종료합니다.");
					break;
					// break 로 해당 프로그램을 종료한다.
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					System.out.println(); // 빈 줄 추가
					continue; // 처음으로 돌아간다.
				}
			} catch (InputMismatchException e) { // 오류시 처음으로 돌아간다.
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				System.out.println();
				sc.nextLine(); // 입력 버퍼를 비워줌
				continue; // while문의 처음으로 돌아감}
			}
		}
	}
}
