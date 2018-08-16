package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//完成标号1内容
@MultipartConfig(location="E:\\java Workspace\\PartTest")
@WebServlet("/upload2.do")
public class UploadServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
     // 完成标号2内容
    	req.setCharacterEncoding("UTF-8");
        Part part = req.getPart("photo");
        String filename = getFilename(part);
     // 完成标号3内容
        part.write(filename);
    }

    private String getFilename(Part part) {
        String header = part.getHeader("Content-Disposition");
        String filename = header.substring(header.indexOf("filename=\"") + 10,
                header.lastIndexOf("\""));
        return filename;
    }
}
