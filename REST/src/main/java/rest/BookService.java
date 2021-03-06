package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("books")
public class BookService {

    @GET
    @Path("{year}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getBooks(@PathParam("year") String year,
                             @MatrixParam("author") String author,
                             @MatrixParam("country") String country) {

        return Response
                .status(200)
                .entity("getBooks is called, year : " + year
                        + ", author : " + author + ", country : " + country)
                .build();

    }
}