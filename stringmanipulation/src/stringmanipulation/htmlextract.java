package stringmanipulation;
//1. Extract the transaction ID from the following HTML body
//
//Input:
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456

import java.io.*;
public class htmlextract {

	public static void main(String[] args) throws IOException {
		StringBuilder html = new StringBuilder();
		FileReader fr = new FileReader("C:\\Users\\47839\\Pictures\\course mat\\github\\task.html");
		BufferedReader br = new BufferedReader(fr);
		String val;
		while ((val = br.readLine()) != null) {
			html.append(val);
		}
		String result = html.toString();
		String til = result.toString();
		String brr[] = til.split("Trnx Id is: ");
		String arr[] = brr[1].split("<");
		System.out.println(arr[0]);


		br.close();
	}
}
