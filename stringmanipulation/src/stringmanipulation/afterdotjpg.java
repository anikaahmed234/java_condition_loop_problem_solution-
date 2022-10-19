package stringmanipulation;

public class afterdotjpg {

	public static void main(String[] args) {

		String arr[] = { "photo1.jpg, doc1.pdf, doc2.docx, photo2.png, doc3.pdf, msoffice.exe, photo3.jpg" };
		String brk [] = new String[14]; 
		brk = arr.split(".");
		int i, flag=0;
		for (i=0;i<12;i++)
		{
			if (brk[i]== "jpg")
			{
				flag++;
			}
		}
		System.out.print("jpg files are counted: " +flag);

	}

}
//
//7. Find out how many images are in the given array:
//Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//Output: 3