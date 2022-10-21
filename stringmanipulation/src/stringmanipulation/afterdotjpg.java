package stringmanipulation;

public class afterdotjpg {

	public static void main(String[] args) {

		String[] arr = { "photo1.jpg, doc1.pdf, doc2.docx, photo2.png, doc3.pdf, msoffice.exe, photo3.jpg" };
		String c = arr[0]; 
		String[] jpg  = c.split("jpg");
		System.out.println(jpg.length);

		
	}

}

//7. Find out how many images are in the given array:
//Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//Output: 3