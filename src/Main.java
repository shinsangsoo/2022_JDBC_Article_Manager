import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		list<Article> = new ArrayList<>();
		System.out.println("==프로그램 시작==");
		
		
		while (true) {
			System.out.printf("명령어 ) ");
			Scanner sc = new Scanner(System.in);
			
			
			if (cmd.equals("article write")) {
				int lastArticleId = 0;
				int id = lastArticleId + 1;				
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.println("내용 : ");
				String body = sc.nextLine();
				
				Article article = new Article(id, title, body);
				articles.add(article);
			}
		}

	}

}
