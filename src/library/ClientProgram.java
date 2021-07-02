package library;
import java.util.*;
import library.Book;
public class ClientProgram {

	public static void main(String[] args) {
		WrittenItem[] i = new WrittenItem[2];
		i[0] = new Book();
		i[1] = new JournalPaper();
		MediaItem[] j = new MediaItem[2];
		j[0]= new Video();
		j[1]= new CD();
		
		i[0].addAuthor("DanBrown");
		System.out.println(i[0].getAuthor());
	}
}
