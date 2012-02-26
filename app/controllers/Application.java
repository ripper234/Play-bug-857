package controllers;

import play.jobs.Job;
import play.libs.F;
import play.mvc.Controller;

public class Application extends Controller {
	public static void index() throws Exception {
		F.Promise<String> future = new Job<String>() {
            @Override
            public String doJobWithResult() throws Exception {
				Thread.sleep(1000);
                return "World";
            }
        }.now();
        await(future);
		
		String what = future.get();
		renderText("Hello World");
	}
}