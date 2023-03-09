
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalBoard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();

		// �Խ����� ��� ��� ��ȣ
		while (true) {
			System.out.println("==== �Խ��� ====");
			System.out.println("1. �Խñ� ���");
			System.out.println("2. �Խñ� ����");
			System.out.println("3. �Խñ� ��� ����");
			System.out.println("0. ����");
			System.out.println("���ڸ� �Է����ּ���");
			
			try {  // ���� �߻��� ó������
				
				int menu = sc.nextInt();

				if (menu == 1) { // �Խñ� ���
					System.out.println("������ �Է��ϼ���.");
					sc.nextLine(); // '\n'�� ������ ���� �߰�
					String title = sc.nextLine();
					System.out.println("������ �Է��ϼ���.");
					String content = sc.nextLine();
					int id = board.getPosts().size() + 1; // �Խñ� ID�� ���� �Խñ� ���� + 1�� ����
					Board2 post = new Board2(id, title, content);
					board.addPost(post);
					System.out.println("�Խñ��� ��ϵǾ����ϴ�. ID: " + id);
					System.out.println(); // �� �� �߰�
				} else if (menu == 2) { // �Խñ� ����
					System.out.println("������ �Խñ� ID�� �Է��ϼ���.");
					int id = sc.nextInt();
					board.deletePost(id);
					System.out.println("�Խñ��� �����Ǿ����ϴ�.");
					System.out.println(); // �� �� �߰�
				} else if (menu == 3) { // �Խñ� ��� ����
					board.showPosts();
					System.out.println(); // �� �� �߰�
				} else if (menu == 0) { // ����
					System.out.println("���α׷��� �����մϴ�.");
					break;
					// break �� �ش� ���α׷��� �����Ѵ�.
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
					System.out.println(); // �� �� �߰�
					continue; // ó������ ���ư���.
				}
			} catch (InputMismatchException e) { // ������ ó������ ���ư���.
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				System.out.println();
				sc.nextLine(); // �Է� ���۸� �����
				continue; // while���� ó������ ���ư�}
			}
		}
	}
}