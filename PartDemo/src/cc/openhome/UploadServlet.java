package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

// 完成标号1内容
@MultipartConfig
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    // 完成标号2内容
		Part part = req.getPart("photo");
		String filename = getFilename(part);
		writeTo(filename, part);
	}

	private String getFilename(Part part) {
	 // 完成标号3内容
		String header = part.getHeader("Content-Disposition");
		String filename = header.substring(header.indexOf("filename=\"")+ 10,
				header.lastIndexOf("\"")) ;
		return filename;
	}
	
	private void writeTo(String filename, Part part) throws IOException,
			FileNotFoundException {
		InputStream in = part.getInputStream();
		OutputStream out = new FileOutputStream("E:workspace/eclipse/jspServlet/" + filename);
		byte[] buffer = new byte[1024];
		int length = -1;
		while ((length = in.read(buffer)) != -1) {
			out.write(buffer, 0, length);
		}
		in.close();
		out.close();
	}
}
