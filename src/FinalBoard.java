
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalBoard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		System.out.println("lol");
		System.out.println("lol");
		System.out.println("dsfdsfdsfsdfsdf");


		// 寃뚯떆�뙋�쓽 異쒕젰 紐낅졊 踰덊샇
		while (true) {
			System.out.println("==== 寃뚯떆�뙋 ====");
			System.out.println("1. 寃뚯떆湲� �벑濡�");
			System.out.println("2. 寃뚯떆湲� �궘�젣");
			System.out.println("3. 寃뚯떆湲� 紐⑸줉 蹂닿린");
			System.out.println("0. 醫낅즺");
			System.out.println("�닽�옄留� �엯�젰�빐二쇱꽭�슂");
			
			try {  // �삤瑜� 諛쒖깮�떆 泥섏쓬�쑝濡�
				
				int menu = sc.nextInt();

				if (menu == 1) { // 寃뚯떆湲� �벑濡�
					System.out.println("�젣紐⑹쓣 �엯�젰�븯�꽭�슂.");
					sc.nextLine(); // '\n'�쓣 踰꾨━湲� �쐞�빐 異붽�
					String title = sc.nextLine();
					System.out.println("�궡�슜�쓣 �엯�젰�븯�꽭�슂.");
					String content = sc.nextLine();
					int id = board.getPosts().size() + 1; // 寃뚯떆湲� ID�뒗 �쁽�옱 寃뚯떆湲� 媛쒖닔 + 1濡� �꽕�젙
					Board2 post = new Board2(id, title, content);
					board.addPost(post);
					System.out.println("寃뚯떆湲��씠 �벑濡앸릺�뿀�뒿�땲�떎. ID: " + id);
					System.out.println(); // 鍮� 以� 異붽�
				} else if (menu == 2) { // 寃뚯떆湲� �궘�젣
					System.out.println("�궘�젣�븷 寃뚯떆湲� ID瑜� �엯�젰�븯�꽭�슂.");
					int id = sc.nextInt();
					board.deletePost(id);
					System.out.println("寃뚯떆湲��씠 �궘�젣�릺�뿀�뒿�땲�떎.");
					System.out.println(); // 鍮� 以� 異붽�
				} else if (menu == 3) { // 寃뚯떆湲� 紐⑸줉 蹂닿린
					board.showPosts();
					System.out.println(); // 鍮� 以� 異붽�
				} else if (menu == 0) { // 醫낅즺
					System.out.println("�봽濡쒓렇�옩�쓣 醫낅즺�빀�땲�떎.");
					break;
					// break 濡� �빐�떦 �봽濡쒓렇�옩�쓣 醫낅즺�븳�떎.
				} else {
					System.out.println("�옒紐삳맂 �엯�젰�엯�땲�떎. �떎�떆 �엯�젰�빐二쇱꽭�슂.");
					System.out.println(); // 鍮� 以� 異붽�
					continue; // 泥섏쓬�쑝濡� �룎�븘媛꾨떎.
				}
			} catch (InputMismatchException e) { // �삤瑜섏떆 泥섏쓬�쑝濡� �룎�븘媛꾨떎.
				System.out.println("�옒紐삳맂 �엯�젰�엯�땲�떎. �떎�떆 �엯�젰�빐二쇱꽭�슂.");
				System.out.println();
				sc.nextLine(); // �엯�젰 踰꾪띁瑜� 鍮꾩썙以�
				continue; // while臾몄쓽 泥섏쓬�쑝濡� �룎�븘媛�}
			}
		}
	}
}
