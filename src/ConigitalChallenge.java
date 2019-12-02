import javax.ws.rs.*;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/conigitalchallenge")
public class ConigitalChallenge {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "application/json"
    @Produces("application/json")
    public String doGetAsJson(@DefaultValue("-1") @QueryParam("number") int number)
    {
        String response ="";
        if(number %7 ==0)
            response=response+"C";
        if(number %9==0)
            response=response+"N";


        response = "{\"result\": \""+response+"\"}";
        return response;
    }
}
