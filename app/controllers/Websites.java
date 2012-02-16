package controllers;

import play.jobs.Job;
import play.libs.F;
import play.mvc.Controller;

public class Websites extends Controller{
    public static void addWebsitePost() {
        F.Promise<String> future = new Job<String>() {
            @Override
            public String doJobWithResult() throws Exception {
                return null;
            }
        }.now();
        await(future);
    }
}

