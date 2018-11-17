package headfirst.pattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) {
		
		int c;
		try {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			InputStream in = new LowerCaseInputstream(new BufferedInputStream(
					new FileInputStream("test.txt")));
			
			while((c=in.read())>0) {
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
