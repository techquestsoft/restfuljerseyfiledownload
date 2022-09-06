package com.training.rest;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")
public class FileDownloadService {
    private static final String FILE_PATH = "c:\\Raj\\myfile.txt";

    @GET
    @Path("/txt")
    @Produces("text/plain")
    public Response getTxtFile() {

        File file = new File(FILE_PATH);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=\"javatpoint_file.txt\"");
        return response.build();

    }

    private static final String FILE_PATH1 = "c:\\Raj\\myimage.png";

    @GET
    @Path("/image")
    @Produces("image/png")
    public Response getImageFile() {

        File file = new File(FILE_PATH1);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition","attachment; filename=\"javatpoint_image.png\"");
        return response.build();

    }

    private static final String FILE_PATH2 = "c:\\Raj\\mypdf.pdf";

    @GET
    @Path("/pdf")
    @Produces("application/pdf")
    public Response getPDFFile() {

        File file = new File(FILE_PATH2);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition","attachment; filename=\"javatpoint_pdf.pdf\"");
        return response.build();

    }

}